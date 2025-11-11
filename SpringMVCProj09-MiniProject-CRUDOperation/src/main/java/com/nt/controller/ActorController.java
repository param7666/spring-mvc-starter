package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Actor;
import com.nt.service.IActorManagmentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ActorController {
	
	@Autowired
	private IActorManagmentService ser;
	
	@GetMapping("/")  // lounch the homepage
	public String showHomepage() {
		System.out.println("ActorController.showHomepage()");
		return "homepage";
	}
	
	@GetMapping("/report")  // get the actor details and lounch teh show report page
	public String showReport(Map<String, Object> map) {
		System.out.println("ActorController.showReport()");
		// use service
		List<Actor> actorList=ser.showAllActor();
		// keep the result in map attribute
		map.put("Actors", actorList);
		actorList.forEach(System.out::println);
		
		// return LVN (pagename)
		return "show_report";
	}
	
	@GetMapping("/register")  // lounch the actor register form
	public String showRegisterFormPage(@ModelAttribute("Actor")Actor actor) {
		System.out.println("ActorController.showRegisterFormPage()");
		return "register_form";
	}
	
//	@PostMapping("/register")  // problem code
//	public String registerActor(@ModelAttribute("Actor") Actor actor, Map<String, Object>map) {
//		System.out.println("ActorController.registerActor()");
//		String msg=ser.registerActor(actor);
//		map.put("msg", msg);
//		List<Actor> actorList=ser.showAllActor();
//		// keep the result in map attribute
//		map.put("Actors", actorList);
//		//return page name
//		return "show_report";
//	}
	
	
//	@PostMapping("/register")  // submit the form data
//	public String registerActor(@ModelAttribute("Actor") Actor actor, Map<String, Object>map) {
//		System.out.println("ActorController.registerActor()");
//		String msg=ser.registerActor(actor);
//		map.put("msg", msg);
//		List<Actor> actorList=ser.showAllActor();
//		// keep the result in map attribute
//		map.put("Actors", actorList);
//		//return page name
//		return "redirect:report";
////		return "forword:report"; not working
//		// redirect the req to the report/ show report page
//		// by submit Actor details
//	}
	
	
	//solution 2 best solution
	@PostMapping("/register")  // submit the form data
	public String registerActor(@ModelAttribute("Actor") Actor actor, RedirectAttributes atrs) {
		System.out.println("ActorController.registerActor()");
		String msg=ser.registerActor(actor);
		atrs.addFlashAttribute("msg", msg);

		return "redirect:report";
//		return "forword:report"; not working
		// redirect the req to the report/ show report page
		// by submit Actor details
	}
	
	
//	//solution 3 HttpsSession
//	@PostMapping("/register")  // submit the form data
//	public String registerActor(@ModelAttribute("Actor") Actor actor, HttpSession ses) {
//		System.out.println("ActorController.registerActor()");
//		String msg=ser.registerActor(actor);
//		ses.setAttribute("msg", msg);
//
//		return "redirect:report";
////		return "forword:report"; not working
//		// redirect the req to the report/ show report page
//		// by submit Actor details
//	}
	
	
	@GetMapping("/edit")
	public String editActorForm(@ModelAttribute("actor")Actor actor, @RequestParam("no") int id) {
		//use Service
		Actor actor1=ser.getActorById(id);
		// copy actor data object to model attribute
		BeanUtils.copyProperties(actor1, actor);
		return "edit_form";
	}
	
	@PostMapping("/edit")
	public String editActor(@ModelAttribute("actor") Actor actor, RedirectAttributes atrs) {
		String msg=ser.editActor(actor);
		atrs.addFlashAttribute("msg",msg);
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteActorById(@RequestParam("no")int id, Map<String, Object> map) {
		String msg=ser.deleteActor(id);
		map.put("msg", msg);
		// forword the requist
		return "redirect:report";
	}
	
}

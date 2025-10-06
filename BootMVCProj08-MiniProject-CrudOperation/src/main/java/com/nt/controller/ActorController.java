package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.Entity.Actor;
import com.nt.service.IActorService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ActorController {
	
	@Autowired
	private IActorService ser;

	@GetMapping("/")
	public String homePage() {
		System.out.println("ActorController.homePage()");
		return "index";
	}
	
	@GetMapping("/register")
	public String registerActor(@ModelAttribute("act") Actor a) {
		System.out.println("ActorController.registerActor()");
		return "register";
	}
	
	@PostMapping("/register")
	public String registerActor(@ModelAttribute Actor a,HttpSession ses) throws Exception {
		System.out.println("ActorController.registerActor()");
		String msg=ser.registerActor(a);
		ses.setAttribute("msg", msg);
		System.out.println(msg);
		return "redirect:view";
	}
	
	@GetMapping("/view")
	public String viewAllActor(Map<String, Object> map) throws Exception {
		System.out.println("ActorController.viewAllActor()");
		List<Actor> list=ser.showAllActor();
		map.put("actors", list);
		return "show";
	}
	
	@GetMapping("/edit")
	public String editActor(@ModelAttribute("actor") Actor a,@RequestParam("id") int id) throws Exception {
		System.out.println("ActorController.editActor()");
		Actor a1=ser.fetchActorById(id);
		BeanUtils.copyProperties(a1, a);
		return "editActor";
	}
	
	@PostMapping("/edit")
	public String editActor(@ModelAttribute("actor")Actor a, RedirectAttributes attrs) throws Exception {
		System.out.println("ActorController.editActor()");
		String msg=ser.editActor(a);
		attrs.addFlashAttribute("msg", msg);
		return "redirect:view";
	}
	
	@GetMapping("/delete")
	public String deleteActor(@RequestParam("id") int id, RedirectAttributes attrs) throws Exception {
		System.out.println("ActorController.deleteActor()");
		String msg=ser.deleteActorById(id);
		attrs.addFlashAttribute("msg", msg);
		return "redirect:view";
		
	}
}

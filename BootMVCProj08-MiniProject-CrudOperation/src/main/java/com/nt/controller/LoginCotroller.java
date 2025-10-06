package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.nt.Entity.Actor;
import com.nt.service.IActorService;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginCotroller {

	@Autowired
	private IActorService ser;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") int id,@RequestParam("password") String pass, HttpSession ses, RedirectAttributes attrs) throws Exception {
		Actor a=ser.login(id, pass);
		if(a!=null) {
			System.out.println("LoginCotroller.login()");
			ses.setAttribute("admin", a);
			return "dashborad";
		} else {
			attrs.addFlashAttribute("msg", "Login denied....");
			return "redirect:login";
		}
		
	}
	
	@GetMapping("/profile")
	public String profile(HttpSession ses) {
		System.out.println("LoginCotroller.profile()");
		Actor a=(Actor) ses.getAttribute("admin");
		System.out.println(a);
		return "profile";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession ses,RedirectAttributes atrs) {
		System.out.println("LoginCotroller.logout()");
		ses.invalidate();
//		Actor a=(Actor)ses.getAttribute("admin");
//		System.out.println(a);
		atrs.addFlashAttribute("msg","You have loged Out");
		return "redirect:login";
	}
	
}

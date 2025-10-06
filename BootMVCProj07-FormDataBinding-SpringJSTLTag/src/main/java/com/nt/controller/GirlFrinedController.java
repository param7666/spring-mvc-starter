package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Entity.GirlFrined;

@Controller
public class GirlFrinedController {

	@GetMapping("/gf")
	public String openGirlFriendFormPage(@ModelAttribute("gf")GirlFrined g) {
		System.out.println("GirlFrinedController.openGirlFriendFormPage()");
		return "gfForm";
	}
	
	@PostMapping("/gf")
	public String processGf(Map<String, Object> map, @ModelAttribute GirlFrined g) {
		System.out.println("GirlFrinedController.processGf()");
		map.put("data", g);
		System.out.println(g);
		System.out.println(map);
		return "show_data";
	}
}

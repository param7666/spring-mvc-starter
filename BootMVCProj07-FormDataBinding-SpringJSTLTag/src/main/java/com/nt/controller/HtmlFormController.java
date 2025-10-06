package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HtmlFormController {
	
	
	@GetMapping("/hp")
	public String OpenHTMLForm() {
		System.out.println("HtmlFormController.OpenHTMLForm()");
		return "htmlForm";
	}

	@PostMapping("/hp")
	public String proceessForm(HttpServletRequest req, Map<String, Object> map) {
		System.out.println("HtmlFormController.proceessForm()");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		map.put("name", name);
		map.put("email", email);
		map.put("password", password);
		System.out.println(map);
		return "show_data2";
	}
}

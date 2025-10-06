package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JSPFormController {

    private final HtmlFormController htmlFormController;

    JSPFormController(HtmlFormController htmlFormController) {
        this.htmlFormController = htmlFormController;
    }
	
	@GetMapping("/jsf")
	public String openJSPForm() {
		System.out.println("JSPFormController.openJSPForm()");
		return "jspForm";
	}
	
	@PostMapping("/jsf")
	public String jsfProcess(@RequestParam String name,
							@RequestParam String email,
							@RequestParam String password,
							@RequestParam String gender,
							@RequestParam(required = false) List<String> skills,
							@RequestParam String country, Map<String, Object> map) {
		System.out.println("JSPFormController.jsfProcess()");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(skills);
		System.out.println(country);
		
		map.put("msg", "Please check the Console for output...");
		
		return "jspSuccesspage";
		
	}

}

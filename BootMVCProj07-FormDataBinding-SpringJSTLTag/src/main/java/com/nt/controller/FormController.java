package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.Entity.Student;

@Controller
public class FormController {

	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("FormController.showHomePage()");
		return "homepage";
	}
	
	@GetMapping("/register")
	public String showFormPage(@ModelAttribute("stud") Student st) { // in html this will not works
		System.out.println("FormController.showFormPage()");
		st.setId(101);
		st.setName("Param");
		st.setAddrs("hyd");
		st.setGrade(84.55);
		return "registration_Form";
	}
	
	@PostMapping("/register")
	public String RegisterStudent(Map<String, Object> map, @ModelAttribute Student s) { // works in post request is html also
		System.out.println("FormController.RegisterStudent()");
		map.put("data", s);
		System.out.println(s);
		return "show_data";
	}
}

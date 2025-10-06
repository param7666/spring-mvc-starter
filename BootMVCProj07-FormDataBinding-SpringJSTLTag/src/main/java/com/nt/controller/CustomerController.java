package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Entity.Customer;

@Controller
public class CustomerController {

	@GetMapping("/custReg")
	public String showStudentForm(@ModelAttribute("cust")Customer c) {
		System.out.println("CustomerController.showStudentForm()");
		return "CustomerForm";
	}
	
	@PostMapping("/custReg")
	public String proccessCustomer(Map<String, Object> map, @ModelAttribute Customer c) {
		System.out.println("CustomerController.proccessCustomer()");
		map.put("data", c);
		System.out.println(map);
		System.out.println(c);
		return "show_data";
	}
}

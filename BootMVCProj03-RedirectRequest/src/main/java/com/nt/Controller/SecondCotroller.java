package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondCotroller {

//	@RequestMapping("/second")
//	public String secondPage() {
//		return "second";
//	}
	
	
	
	
//	PROBLEM WITH MODEL AS RETURN TYPE THERE IS NO lVM REQUEST PATH BY DEFUALT AS LVM
//	@RequestMapping("/second") // LVM is Here
//	public Model secondPage() {
//		Model mv=new BindingAwareModelMap(); //Shared mamory created manually
//		return mv;
//	}
	
	
	
	@RequestMapping("/second") // request path
	public ModelAndView secondPage() {
		// create shared memory and LVN
		ModelAndView mv=new ModelAndView("second2"); 
		//return modelAndView Object
		return mv;
	}
}

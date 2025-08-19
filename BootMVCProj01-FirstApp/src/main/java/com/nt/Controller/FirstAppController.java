package com.nt.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstAppController {


	@RequestMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
//	@RequestMapping("/currentDate")
//	public String checkCurrentDateAndTIme(Map<String, Object> map) {
//		map.put("msg", "Hello From CurrentDate handeler Method");
//		map.put("date", LocalDate.now());
//		map.put("time", LocalTime.now());
//		return "dateAndTime";
//	}
	
//	@RequestMapping("/details")
//	public String checkYourDetails(Map<String, Object> map) {
//		map.put("name","Parmeshwar Gurlewad");
//		map.put("city", "HYD");
//		map.put("phone", 7666845301L);
//		map.put("friend", "Bhosdiwala Tanya");
//		return "contact";
//	}
	
	@RequestMapping("/details")
	public String checkYourDetails(Model mv) {
		System.out.println("FirstAppController.checkYourDetails()::"+mv.getClass());
		// add attribute in the model
		mv.addAttribute("name","Parmeshwar Gurlewad");
		mv.addAttribute("city", "HYD");
		mv.addAttribute("phone", 7666845301L);
		mv.addAttribute("friend", "Bhosdiwala Tanya");
		return "contact"; //LVN 
	}
	
	@RequestMapping("/currentDate")
	public String checkCurrentDateAndTIme(ModelMap map) {
		System.out.println("FirstAppController.checkCurrentDateAndTIme():: "+map.getClass());
		map.addAttribute("msg", "Hello From CurrentDate handeler Method");
		map.addAttribute("date", LocalDate.now());
		map.addAttribute("time", LocalTime.now());
		return "dateAndTime";
	}
}

package com.nt.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FirstAppController {


	@RequestMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
	// redirect uses diffrent request and response object
	@RequestMapping("/details") // access the request and run this method
	public String forwordRequest() {
		return "redirect:detailsPrint"; // redirect to detailsPrint requist
	}
	
	
	@RequestMapping("/detailsPrint") // finds the redirected path 
	public String checkYourDetails(Map<String, Object> map) { // method executes
		map.put("name","Parmeshwar Gurlewad"); // data stored into map
		map.put("city", "HYD");
		map.put("phone", 7666845301L);
		map.put("friend", "Tanya");
		return "contact"; // open the jps page 
	}
	
	@RequestMapping("/currentDate")  // maps to /currentDate
	public String ForwardDateTimeRequest(Map<String, Object> map) { // handles the request
	    map.put("date", LocalDate.now()); // adds date to model (request scope)
	    map.put("time", LocalTime.now());
	    return "redirect:showDate"; // ❗️redirect creates a new request — model data is lost
	}

	@RequestMapping("/showDate")  // mapped after redirect
	public String showDateAndTime() { // gets executed on new request
	    // 🚫 Can't access data from previous method because redirect creates a new request
	    return "dateAndTime"; // logical view name
	}

	
	
	
	// SOLUTION FOR ACCESS PROVIES PROBLEM
	@RequestMapping("/show_data") 
	public String forwardData(RedirectAttributes req) { // use RedirectAttributes for send data to another
		//method 
		System.out.println("FirstAppController.forwardData()");
		// ✅ This works because Spring puts flash attributes into request
		req.addFlashAttribute("msg", "Yes you can send data one method to another"
				+ "Request Handeler mathod using HttpServletRequest");
		return "redirect:printData"; 
	}
	
	@RequestMapping("/printData")  
	public String printData(HttpServletRequest req) {
		System.out.println("FirstAppController.printData()");
		System.out.println(req.getAttribute("msg")); 
		req.setAttribute("name", "Parmeshwar");
		req.setAttribute("addrs","HYD");
		System.out.println(req.getAttribute("name")); 
		System.out.println(req.getAttribute("addrs")); 

		return "show_Data";
	}

}

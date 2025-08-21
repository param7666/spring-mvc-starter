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
	
	@RequestMapping("/details")
	public String forwordRequest() {
		return "forward:detailsPrint";
	}
	
	
	@RequestMapping("/detailsPrint")
	public String checkYourDetails(Map<String, Object> map) {
		map.put("name","Parmeshwar Gurlewad");
		map.put("city", "HYD");
		map.put("phone", 7666845301L);
		map.put("friend", "Bhosdiwala Tanya");
		return "contact";
	}
	
	@RequestMapping("/currentDate")
	public String ForwardDateTimeRequest() {
		return "forward:showDate";
	}
	
	@RequestMapping("/showDate") 
	public String showDateAndTime(Map<String, Object> map) {
		map.put("date", LocalDate.now());
		map.put("time", LocalTime.now());
		return "dateAndTime";
	}
	
	@RequestMapping("/show_data") // all the data from this method can access the second method(printData method)
	public String forwardData(Map<String, Object> map) { // because forward uses same request
		System.out.println("FirstAppController.forwardData()");
		map.put("msg", "Yes you can send data one method to another"
				+ "Request Handeler mathod");
		return "forward:printData"; // ✅ Forward internally to another method
	}
	
	@RequestMapping("/printData")  
	public String printData(Map<String,Object> map) {
		System.out.println("FirstAppController.printData()");
		System.out.println(map); //// ✅ Will include "msg" from the first method
		map.put("name", "Parmeshwar");
		map.put("addrs","HYD");
		System.out.println(map); // ✅ Will include msg, name, addrs
		return "show_Data"; // JSP: show_Data.jsp
	}

}

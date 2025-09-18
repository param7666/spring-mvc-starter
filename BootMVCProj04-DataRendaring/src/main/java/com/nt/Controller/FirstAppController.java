package com.nt.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IDataRenderService;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstAppController {
	
	@Autowired
	private IDataRenderService ser;


	@RequestMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/date")
	public String checkCurrentDate(Map<String, Object> map) {
		LocalDate dt=ser.showDate();
		map.put("date", dt);
		return "show_Data";
	}
	
	@RequestMapping("/time")
	public String checkCurrentTime(Map<String, Object> map) {
		LocalTime lt=ser.showTime();
		map.put("time", lt);
		return "show_Data";
	}
	
	
	
//	@RequestMapping({"/date","/time"}) // we can bind multiple request to one method and its case-sensetive
//	public String checkCurrentDate(Map<String, Object> map) {
//		LocalDate dt=ser.showDate();
//		map.put("date", dt);
//		LocalTime lt=ser.showTime();
//		map.put("time", lt);
//		return "show_Data";
//	}
	
	

	
	
}

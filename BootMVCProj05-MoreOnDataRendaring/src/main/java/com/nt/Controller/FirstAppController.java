package com.nt.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.Model.Customer;

@Controller
public class FirstAppController {


	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
	@GetMapping("show")
	public String showMoreData(Map<String, Object> map) {
		map.put("nickNamesList", List.of("Param","Babyy","Jaanuu","Pilluuuu","Shonaaa"));
		map.put("phonesSet", Set.of(8015796,9085870,9784359873L,843695));
		map.put("StringArray", new String[] {"Value1","Value2","Value3","Value4"});
		map.put("MapValues", Map.of("key1","Value1","key2","Value2","key3","Value3","key4","Value4"));
		Customer c=new Customer(101, "Parmeshwar", "HYD", 7666845301L);
		map.put("EntityObject", c);
		
		
		return "show_Data";
	}
	
	
	@GetMapping("/showCust")
	public String showCustomers(Map<String, Object> map) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(101, "Parmeshwar", "HYD", 7666845301L));
		list.add(new Customer(102, "Tanvir", "HYd", 7896845301L));
		list.add(new Customer(103, "Shakti", "Nagpur", 6786845301L));
		list.add(new Customer(104, "Jivan", "Pune", 7666845563L));
		list.add(new Customer(105, "Ajay", "Nanded", 7666845123L));
		list.add(new Customer(106, "Arvind", "HMT", 7666845103L));
		map.put("custList", list);
		
		return "customers";
	}
	

	
	
}

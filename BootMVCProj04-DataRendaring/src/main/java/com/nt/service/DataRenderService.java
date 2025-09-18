package com.nt.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class DataRenderService implements IDataRenderService {
	
//	@Autowired
	private LocalDate dt;
	private LocalTime lt;

	@Override
	public LocalDate showDate() {
		return dt.now();
	}
	
	@Override
	public LocalTime showTime() {
		return lt.now();
	}

}

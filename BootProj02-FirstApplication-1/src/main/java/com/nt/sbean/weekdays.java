package com.nt.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wd")
public class weekdays 
{
	@Autowired
	private LocalDate ld;
	
	public String Weeked()
	{
		int str =ld.getDayOfWeek().getValue();
		int day = 5;
		if(day>=5&&day<=6)
			return "working";
		else
			return "weekoff";
	}

	
	}

	
	
package com.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class seasonfind 
{
	@Autowired
	private LocalDate ld;
	
	public String seasonfind;
	//b.method
	public String Findseason()
	{
		int month=ld.getMonthValue();
		
		if(month>=3&&month<=6)
		    return "summer season";
		else if(month>=6&&month<=8)
			return "rainy season";
		else
			return "winter season";
		
	}

	
	
	}



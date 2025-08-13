package com.sr;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbean.weekdays;
//import com.sbeans.seasonfind;
//import com.sbeans.seasonfind;

@SpringBootApplication
public class BootProj02FirstApplication1Application
{
	@Bean("ld")
	public LocalDate createLocalDate()
	{
		return LocalDate.now();
	}
	@Bean("wd")
	public weekdays createweekdays()
	{
		return new weekdays();
	}

	public static void main(String[] args) 
	{
		
		ConfigurableApplicationContext ctx=	SpringApplication.run(BootProj02FirstApplication1Application.class, args);
		
		{
			weekdays wd=ctx.getBean("wd", weekdays.class);
			String seasonname= wd.Weeked();
			System.out.println("season name:"+seasonname);
			
		}
		((ConfigurableApplicationContext)ctx).close();
		
	}

}

package com.sr;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sbeans.seasonfind;

@SpringBootApplication
public class BootProj01FirstApplication {
	@Bean(name="ld")
	public LocalDate createdate()
	{
		return LocalDate.now();
	}
	@Bean(name="sf")
	public seasonfind createfind()
	{
		return  new seasonfind();
	}
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(BootProj01FirstApplication.class, args );
		{
				seasonfind finder=ctx.getBean("sf", seasonfind.class);
				String seasonname= finder.Findseason();
				System.out.println("season name:"+seasonname);
		}
		((ConfigurableApplicationContext)ctx).close();
		
	}
}
				
		
	
	
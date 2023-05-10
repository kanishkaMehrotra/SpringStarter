package com.kanishka.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanishka.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.kanishka.spring.basics.springin5steps.scope.PersonDAO;
import com.kanishka.spring.basics.springin5steps.someCDI.SomeCDIBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringIn5StepsCDIApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSort());
		Logger LOGGER=org.slf4j.LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
		
		//System.out.println(binarySearch.binarySearch(new int [] {1,2,3}, 0));
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness=applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{}",someCDIBusiness);
		LOGGER.info("{}",someCDIBusiness.getSomeCDIdao());


		//binarySearchImpl.binarySearch(new int [] {1,2,3}, 4);
		

	}

}

package com.kanishka.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanishka.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.kanishka.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSort());
		Logger LOGGER=org.slf4j.LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
		
		//System.out.println(binarySearch.binarySearch(new int [] {1,2,3}, 0));
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO1.getJdbcConnection());


		//binarySearchImpl.binarySearch(new int [] {1,2,3}, 4);
		

	}

}

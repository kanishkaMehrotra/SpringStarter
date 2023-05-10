package com.kanishka.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanishka.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSort());
		
		//System.out.println(binarySearch.binarySearch(new int [] {1,2,3}, 0));
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearchImpl=applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1=applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);

		binarySearchImpl.binarySearch(new int [] {1,2,3}, 4);
		

	}

}

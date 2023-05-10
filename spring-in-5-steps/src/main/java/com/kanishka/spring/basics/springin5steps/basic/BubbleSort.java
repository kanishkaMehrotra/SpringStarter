package com.kanishka.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class BubbleSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}

}

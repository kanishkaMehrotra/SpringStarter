package com.kanishka.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgo;

	public int binarySearch(int [] numbers,int noToSearch)
	{
		int [] sortNumb=sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return 3;
	}

}

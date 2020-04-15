package com.example.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("QuickSortAlgorithm");
		return numbers;
	}
	 

}

package com.example.springDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearchImp {
	@Autowired
	private SortAlgorithm shortAlgorithm;

	public BinarySearchImp(SortAlgorithm shortAlgorithm) {
		super();
		this.shortAlgorithm = shortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToBeSearchFor) {
		int[] num = shortAlgorithm.sort(numbers) ;
		System.out.println("number"+ num);
		return 4;
        
	}
}

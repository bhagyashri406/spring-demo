package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

		System.out.println("SpringDemoApplication 3334");

//		BinarySearchImp binarySearchImp = new BinarySearchImp(new bubbleSortAlgorithm());
//		int result = binarySearchImp.binarySearch(new int[] { 1, 2, 4, 6, 3 }, 6);
	    BinarySearchImp binarySearchImp = 	applicationContext.getBean(BinarySearchImp.class);
		
		System.out.println("result" +  binarySearchImp.binarySearch(new int[] { 1, 2, 4, 6, 3 }, 6));
	    
	}

}

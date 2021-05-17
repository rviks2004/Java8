package com.functionalinterface.demo.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
	 * else return false; }
	 */

	public static void main(String[] args) {

		// PredicateDemo p = new PredicateDemo();

//		Predicate<Integer> predicateExample = (t) -> {
//			if (t % 2 == 0) {
//				return true;
//			} else {
//				return false;
//			}
//		};
		
		/*
		Predicate<Integer> predicateExample = (t) -> t % 2 == 0;
		System.out.println(predicateExample.test(21));
		
		//Use with Stream API 
		List<Integer> numberList = Arrays.asList(3, 5, 4, 7, 2);
		numberList.stream().filter(predicateExample).forEach(listOfNumbers -> System.out.println(listOfNumbers));
		*/
		
		
				
		//Use with Stream API 
		List<Integer> numberList = Arrays.asList(3, 5, 4, 7, 2);
		numberList.stream().filter((t) -> t % 2 == 0).forEach(listOfNumbers -> System.out.println(listOfNumbers));
		
		
		
	}

}

package com.functionalinterface.demo.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	/*
	 * @Override public void accept(Integer t) { System.out.println("Printing : " +
	 * t);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// ConsumerDemo c = new ConsumerDemo();

		/*
		 * Consumer<Integer> c = (t) -> System.out.println("Printing : " + t);
		 * 
		 * c.accept(10);
		 */

		// Used in TONIK to get POI2 request
		List<Integer> numberList = Arrays.asList(3, 5, 4, 7, 2);

		numberList.stream().forEachOrdered(listOfNumbers -> System.out.println(listOfNumbers)
		
		);

	}

}

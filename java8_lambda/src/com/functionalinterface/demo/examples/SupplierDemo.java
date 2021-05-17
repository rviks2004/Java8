package com.functionalinterface.demo.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	
	/*
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hi Vikas";
	}
	
	public static void main(String[] args) {
		
		SupplierDemo s = new SupplierDemo();
		System.out.println(s.get());
		
	}*/	
	
	/*
	public static void main(String[] args) {
		
		Supplier<String> s = () -> "Hi Vikas";
		
		System.out.println(s.get());
	}*/

		public static void main(String[] args) {
		
		//Supplier<String> s = () -> "Hi Vikas";
		
		//System.out.println(s.get());
		
		List<String> numberList = Arrays.asList();
		
		System.out.println(numberList.stream().findAny().orElseGet(() -> "Hi Vikas"));
		
	}
	
	

}

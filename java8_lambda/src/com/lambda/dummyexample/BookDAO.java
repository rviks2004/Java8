package com.lambda.dummyexample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("111", "ABC", 323));
		books.add(new Book("144", "zvzx", 433));
		books.add(new Book("155", "sdfd", 22));
		books.add(new Book("166", "jgh", 665));
		
		return books;
		
	}
}

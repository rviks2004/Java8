package com.lambda.dummyexample;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksInOrder() {

		List<Book> books = new BookDAO().getBooks();
		
		Collections.sort(books, 
			( o1, o2) ->  o1.getName().compareTo(o2.getName())			
		);
		
		return books;
	}

	/*
	 * class MyComaprator implements Comparator<Book> {
	 * 
	 * @Override public int compare(Book o1, Book o2) { 
	 * return o1.getName().compareTo(o2.getName()); 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BookService().getBooksInOrder());
	}

}

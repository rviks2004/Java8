package com.lambda.dummyexample;

public class Book {
	
	private String id;
	private String bookName;
	private int pages;
	
	
	public Book(String id, String name, int pages) {
		super();
		this.id = id;
		this.bookName = name;
		this.pages = pages;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + bookName + ", pages=" + pages + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return bookName;
	}
	public void setName(String name) {
		this.bookName = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}

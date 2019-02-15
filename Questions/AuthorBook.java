package com.java;

public class AuthorBook {

	public static void main(String[] args) {
		Author author=new Author("shubahngi","shubangi@gmail.com",'f');
		
		Book b = new Book("life is what we make it",author, 88999.99, 1);
		b.setQty(1);
		System.out.println(b);
	}

}

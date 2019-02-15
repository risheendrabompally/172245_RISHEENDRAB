package com.collections1;

import java.util.ArrayList;

public class TestMain {
	public static void main(String args[])
	{
		ArrayList<MovieDetails> al=new ArrayList<MovieDetails>();
		Movie_DetailsList MDL=new Movie_DetailsList();
		MovieDetails m1= new MovieDetails("Happydays","Varun","Tamannah","Entertainer");
		MovieDetails m2= new MovieDetails("Arjunreddy","Vijay","Shalini","Adultrated");
		MovieDetails m3= new MovieDetails("One","Mahesh","Kriti","Mystery");
		MovieDetails m4= new MovieDetails("ABCD","rishi","Kajal","Romance");
		MovieDetails m5= new MovieDetails("SVSC","Mahesh","Samantha","Family");
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		MDL.add_Movie(m5);
	}

}

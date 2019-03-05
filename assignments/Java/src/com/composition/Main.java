package com.composition;

import java.util.Scanner;

public class Main {
	
	
    
    public static void main(String args[])
    {
    	Author a = new Author("rishi","rishindra.bompally@gmail.com",'m');	
        Book b = new Book("way to hell",a,1009,100);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
	}



package com.rizwan;

public class DemoD1 {
	
	//Q1.if x is divisible by 5 print "Hello";
	//if x is divisible by 3 print "Welcome";
	//if x is divisible by 5 and 3 both print "Hello Welcome";
	//if x is not divisible by 3 and 5 print "Invalid Number";
	
	
	           
	
	public static void printSomething(int x) {
		
		if(x%5==0 && x%3==0)
			System.out.println("Hello Welcome");
		else if(x%3==0)
			System.out.println("Welcome");
		else if(x%5==0)
			System.out.println("Hello");
		else
			System.out.println("Invalid Number");
		
		
		
	}
	
	public static void main(String[] args) {
		
		//printSomething(30);
		//printSomething(14);
		
		
		byte b=70;
		
		char c=(char)b;
		System.out.println(c);
		
		char ch= 'F';
		byte by=(byte)ch;
		System.out.println(by);
		
		
	}

}

package com.text.java;

public class OperatorsExamples {

	public static void main(String[] args) {
		
		int a=10,b=20;
		// Ternary operator
		int result=(a<b)?a:b;       //If the condition is true than true vallue is stored in result
									
		System.out.println(result);
		
		//Arithmatic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b%a);
		
		//Relational operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		//Logical Operators
		System.out.println((a!=b)&&(a>b));
		System.out.println((a!=b)||(a>b));
		
		
		System.out.println(a>>2);
		System.out.println(b<<2);
		
		a=a+10;
		a+=10;
		
		a=a*b;
		a*=b;
	}

}

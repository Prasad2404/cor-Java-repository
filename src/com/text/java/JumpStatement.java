package com.text.java;

public class JumpStatement {

	public static void main(String[] args) {
	int i,limit=100;
		
		for(i=1;i<=limit;i=i+1)  //1<=100 T   // for(initialization;expression;value updation)
		{
			System.out.println(i);
			if(i==50) //== equlity operation
			{
				//break;
				continue;
			}
			
		}

		System.out.println("outdise of for block");

	}

}

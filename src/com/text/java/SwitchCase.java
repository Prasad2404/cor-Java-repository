package com.text.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class SwitchCase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ins=new InputStreamReader(System.in);//input stream
		BufferedReader br=new BufferedReader(ins);
		
		System.out.println("Enter a number between 1 to 7:");
		int choice=Integer.parseInt(br.readLine());
		
		
		switch(choice) //Fall through execution
		{
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;
			case 3: System.out.println("Tuesday");
					break;		
			case 4: System.out.println("Wednesday");
					break;	
			case 5: System.out.println("Thursday");
					break;
			case 6: System.out.println("Friday");
					break;
			case 7: System.out.println("Saturday");
					break;
			default:System.out.println("Wrong Choice..");	
					System.err.println("Error occurred!!");
		}
		

	}

}

/*
package com.test.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExample1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		InputStreamReader ins=new InputStreamReader(System.in);//input stream
		BufferedReader br=new BufferedReader(ins);
		boolean exit=true;
		do
		{
		
		System.out.println("Enter Initial letters of Weekday:");
		String choice=br.readLine();
	
		
		
		switch(choice) //Fall through execution
		{
			case "S": System.out.println("Sunday");
					break;
			case "M": System.out.println("Monday");
					break;
			case "T": System.out.println("Tuesday");
					break;		
			case "W": System.out.println("Wednesday");
					break;	
			case "Th": System.out.println("Thursday");
					break;
			case "F": System.out.println("Friday");
					break;
			case "Sa": System.out.println("Saturday");
					break;
			default:System.out.println("Wrong Choice..");	
					
		}
		
		  System.out.println("To exit press y");
		  String v=br.readLine();
		  if(v.equals("y") || v.equals("Y"))
		  {
			  exit=false;
		  }
		
		
		}while(exit);
		

	}

}
*/
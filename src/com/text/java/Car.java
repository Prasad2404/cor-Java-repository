package com.text.java;

public class Car {
	
	//non static data member
	private long number;  
	private String model;
	
	
	//static data member
	static private String brand="BMW";
	
	
	
	
	public Car(long number, String model) {
		
		this.number = number;
		this.model = model;
	}



	//non static method
	 public void displayCarInfo()
	{
		System.out.println(this.number+ " "+this.model+ " "+this.brand);
	}
	
	 //static method  - can access only static data members
	 public static void display()
	 {
		 System.out.println(Car.brand );
		 
	 }
	

}
package com.text.java;

public class GeterSeterExample {
	
	private double radius=1.0;
	
	public GeterSeterExample() {
		
	}
	
	
	public GeterSeterExample(double radius) {
		
		this.radius=radius;
	}
	
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public double getArea()
	{
		return this.radius * this.radius * Math.PI;
	}
	
	
	public double getCircumference()
	{
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

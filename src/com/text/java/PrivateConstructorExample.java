package com.text.java;

class Myclass
{
	
	static int a=20;
	int b=10;
	static Myclass obj=null;
	
	private Myclass()
	{
		
	}
	
	
	public static Myclass getObject()
	{
		if(obj==null)
		{
			obj=new Myclass();
		}
		return obj;
	}
	
	
	
}



public class PrivateConstructorExample {

	public static void main(String[] args) {
		
		Myclass obj=Myclass.getObject();
		
		System.out.println(obj.b);
		System.out.println(obj.a);

	}
	
}

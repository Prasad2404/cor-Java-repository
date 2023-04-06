package com.text.java;

public class Outer {
	
  private static String str="Hello World"; //static data member
  private String str1="Hii";//non-static data member
  
  
  static class Inner  //Nested static class
  {
	   public void display()
	   {
		   System.out.println(str);
		 
	   }
	   
	   static public void test()
	   {
		   System.out.println("This is static method");
		   
	   }
  }
  
  
  public static void main(String args[])
  {
	   Outer.Inner obj=new Outer.Inner();
	   
	   obj.display();
	   obj.test();
  }
}
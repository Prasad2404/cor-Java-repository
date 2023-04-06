package com.text.java;

public class Account {
	
	private int id;
	private String name;
	private int balance=0;
	
	
	public Account(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}
	
	
	public int credit(int amount)
	{
		this.balance=this.balance + amount;
		return this.balance;
	}
	
	public int debit(int amount)
	{
		if(this.balance>=amount)
		{
			this.balance=this.balance - amount;
		}
		else
		{
			System.out.println("Amount exceded balance!!");
		}
		
		return this.balance;
	}
	
	
	public int fundTransfer(int amount)
	{
		if(this.balance>=amount)
		{
			this.balance=this.balance - amount;
		}
		else
		{
			System.out.println("Amount exceded balance!!");
		}
		
		return this.balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
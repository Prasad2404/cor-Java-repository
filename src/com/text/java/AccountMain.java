package com.text.java;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account=new Account(35345, "Mr. Aman", 10000);
		
		System.out.println(account.credit(5000));
		
		System.out.println(account.debit(5000));
		
		System.out.println(account.fundTransfer(2000));
		
		System.out.println(account.getBalance());
		System.out.println(account.getName());
		System.out.println(account.getId());
		
		
		

	}

}
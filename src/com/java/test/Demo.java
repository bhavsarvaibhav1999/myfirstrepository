package com.java.test;

public class Demo {
	public static void main(String[] args)
	{
		float rateOfInterest=7.8f;
		double amount=34000;
		int year=7;
		
		//INTEREST CALCULATION
		
		double interestAmount=(amount*year*rateOfInterest)/100;
		
		//OUTPUT STATEMENT
		
		System.out.println("INTEREST AMOUNT"+interestAmount);
	}
	
	

}

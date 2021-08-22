package com.bridgelabz3;

import java.util.Scanner;
// Program to find whether the year is leap year or not
public class Leapyear {

	public static void main(String[] args) {
		int i=0;
		int year=0;
		System.out.println("Enter the YEAR");
		while (i<1)
		{
			Scanner sc = new Scanner(System.in); 
			year=sc.nextInt();
			if(year<1000)
			{
				System.out.println("Please Enter the year in 4 digits");
			}
			else
				i=1;
		}
		
		if (year%400==0) 
			System.out.println(year+" is a Leap Year.");
		
		else if((year%100)==0)
		{
			System.out.println(year+" is not a Leap Year");
		}
		else if((year%4)==0)
			System.out.println(year+" is a Leap Year");
		else 
			System.out.println(year+" is not a Leap Year");
	}
 	    	

}	

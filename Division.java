package com.bridgelabz3;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int remainder=0;
		int quotient=0;
		int number=0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		
		int divisor=1;
		System.out.println("Enter the divisor");
		
		divisor=sc.nextInt();
		if(divisor==0)
			System.out.println("Please enter a number other than zero");
		
		quotient = number/divisor;
		remainder = number%divisor;
		System.out.println("The Quotient is: "+quotient);
		System.out.println("The Remainder is: "+remainder);
	}

}

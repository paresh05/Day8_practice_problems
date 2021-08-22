package com.bridgelabz3;

import java.util.Scanner;

//Program to compute the Harmonic Value

public class Harmonicno {

	public static void main(String[] args) {
		int number=0;
		double harmonicNo=0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			harmonicNo=harmonicNo+(1.0/i);
		}
		System.out.println("The Harmonic Value of "+number+" is "+harmonicNo);
	}

}

package com.bridgelabz3;

import java.util.Scanner;

// //Program to find a number is even or odd

public class OddorEven {

	public static void main(String[] args) {
		int num=0;
		//int temp=0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("Its an Even Number");
		else
			System.out.println("Its a Odd Number");
		
	}

}

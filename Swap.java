package com.bridgelabz3;

import java.util.Scanner;
// Program to swap two numbers
public class Swap {

	public static void main(String[] args) {
		int num1=0;
		int temp=0;
		System.out.println("Enter the 1st Number");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		
		int num2=0;
		System.out.println("Enter the 2nd Number");
		num2=sc.nextInt();
		
		System.out.println("The numbers before swapping, Number1= "+num1+" Number2= "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("The numbers after swapping, Number1= "+num1+" Number2= "+num2);
		
	}

}

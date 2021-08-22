package com.bridgelabz3;

import java.util.Scanner;

//Program to find the largest of three numbers

public class LargestNum {

	public static void main(String[] args) {
		int num1=0;
		System.out.println("Enter the 1st Number");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		
		int num2=0;
		System.out.println("Enter the 2nd Number");
		num2=sc.nextInt();
		
		int num3=0;
		System.out.println("Enter the 3rd Number");
		num3=sc.nextInt();
		
		int largest=0;
		
		largest = num3>(num2>num1 ? num2 : num1) ? num3 : (num2>num1 ? num2 : num1);
		
		System.out.println("The Largest number is: "+largest);

	}

}

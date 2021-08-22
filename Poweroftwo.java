package com.bridgelabz3;

import java.util.Scanner;

//Program to compute the power of 2

public class Poweroftwo {

	public static void main(String[] args) {
		int power=1;
		int N=0; // @param N This is the parameter used to take input from user 
		System.out.println("Enter the value of N only between 0 and 31");
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		
		// Calculates and prints the powers of 2
		for (int i=0;i<=N;i++)
		{
			power=(int)Math.pow(2, i);
			System.out.print(power+" ");
		}
		sc.close();
	}
}

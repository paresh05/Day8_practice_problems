package com.bridgelabz3;

import java.util.Scanner;

//Prgram to compute prime factors of a number

public class Factors {

	public static void main(String[] args) {
		int number=0;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		
		while (number%2==0)
		{
			System.out.print("2 ");
			number/=2;
		}
		
		for(int i=3; i*i<=number;i=i+2)
		{
			while(number%i == 0)
			{
				number=number/i;
				System.out.print(i+" ");
			}
		}
		
		if(number>2)
			System.out.print(number);
		
	}

}

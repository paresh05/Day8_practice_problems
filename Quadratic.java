package com.bridgelabz3;

import java.util.Scanner;
//Program to compute the quadratic roots
public class Quadratic {

	public static void main(String[] args) {
		double a=0;
		System.out.println("Enter the value of a");
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		
		double b=0;
		System.out.println("Enter the value of b");
		b=sc.nextDouble();
		
		double c=0;
		System.out.println("Enter the value of c");
		c=sc.nextDouble();
		
		double delta= (b*b)-(4*a*c);
		
		System.out.println(delta);
		double root1=0,root2=0;
		
		root1 = (-b + Math.sqrt(delta))/(2*a);
		root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println(" The value of 1st root of x is "+root1);
		System.out.println(" The value of 2nd root of x is "+root2);
	}

}

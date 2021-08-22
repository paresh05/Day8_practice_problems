package com.bridgelabz3;

import java.util.Scanner;

//Program to compute the Euclidean distance

public class Distance {

	public static void main(String[] args) {
		int x=0;
		double distance=0;
		System.out.println("Enter the value of X");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		int y=0;
		System.out.println("Enter the value of Y");
		y=sc.nextInt();
		
		distance= Math.sqrt((Math.pow(x,2))+(Math.pow(y,2))); //Formula to compute the Euclidean distance
		
		System.out.println("The Euclidean distance from the point ("+x+","+y+") to the origin (0,0) is "+distance);
	}

}

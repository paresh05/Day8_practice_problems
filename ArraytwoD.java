package com.bridgelabz3;
import java.io.*;

import java.util.Scanner;

// Program to create and print the elements of a two dimensional array

public class ArraytwoD {

	public static void main(String[] args) {
		int arr[][];
		int N,M,i=0,j=0;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		System.out.println("Enter the number of columns");
		M=sc.nextInt();
		System.out.println("Enter the elements");
		arr=new int[N][M];
		// taking input from the user
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		// printing the elements of the 2D array
		PrintWriter writer = new PrintWriter(System.out);
		
		for(i=0;i<N;i++)
		{
			for(j=0;j<M;j++)
			{
				writer.write(arr[i][j]+"  ");
			}
			writer.println();
		}
		
		writer.flush();
		
		
		
	}

}

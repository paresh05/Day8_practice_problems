package com.bridgelabz3;

import java.util.Scanner;

public class SumofThreeInteger {

	public static void main(String[] args) {
		int count=0;
		int arr[];
		int N,i=0;
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		System.out.println("Enter the elements");
		arr=new int[N];
		for(i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int a=0;a<N-2;a++)
		{
			for(int b=a+1;b<N-1;b++)
			{
				for(int c=b+1;c<N;c++)
				{
					if((arr[a]+arr[b]+arr[c])==0)
					{
						System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
						count=1;
					}
					
				}
			}
		}
		if(count==0)
			System.out.println("Triplets Does not exist");
	}

}

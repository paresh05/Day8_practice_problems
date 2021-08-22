package com.bridgelabz3;

import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		int i=1;
		int head=0, tail=0;
		System.out.println("Enter the number of times to flip the coin");
		Scanner sc = new Scanner(System.in); 
 	    int flipNo = sc.nextInt();
 	    while (i<=flipNo)
 	    {
 	    	System.out.println("Flip the coin");
 	    	float coin= (float)(Math.random()%10);
 	    	//System.out.println(coin);
 	    	if(coin>=0.5)
 	    	{
 	    		head+=1;
 	    		System.out.println("Its a HEAD");
 	    	}
 	    	else
 	    	{
 	    		tail+=1;
 	    		System.out.println("Its a TAIL");
 	    	}
 	    	i++;
 	    }
 	    int headPercent= (head*100)/flipNo;
 	    int tailPercent= (tail*100)/flipNo;
 	    System.out.println("Percentage of occurance of HEAD is: "+headPercent+"%");
 	    System.out.println("Percentage of occurance of TAIL is: "+tailPercent+"%");
 	    
	}

}

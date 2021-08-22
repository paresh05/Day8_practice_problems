package com.bridgelabz3;

// Program to compute the Effective Temperature
public class WindChill {

	public static void main(String[] args) {
		
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		
		if(t<50 && (v<120) && (v>3))
		{
			double w=0;
			w= (35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v,0.16))); //formula to compute the effective temperature
			System.out.println("Effective Temperature is: "+w);
		}
		else
			System.out.println("Please enter value of t less than 50 and v between 3 and 120");

	}

}

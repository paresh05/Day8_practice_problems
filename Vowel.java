package com.bridgelabz3;

import java.util.Scanner;

// Program to check an aphabet entered is odd or even

public class Vowel {

	public static void main(String[] args) {
		
		char alphabet;
		boolean lowerCaseAlphabet;
		boolean upperCaseAlphabet;
		System.out.println("Enter the Alphabet");
		Scanner sc = new Scanner(System.in);
		alphabet = sc.next().charAt(0);
		
		lowerCaseAlphabet=((alphabet == 'a')||(alphabet=='e')||(alphabet=='i')||(alphabet=='o')||(alphabet=='u'));
		upperCaseAlphabet=((alphabet == 'A')||(alphabet=='E')||(alphabet=='I')||(alphabet=='O')||(alphabet=='U'));	
		
		if(lowerCaseAlphabet||upperCaseAlphabet)
			System.out.println("The alphabet is Vowel");
		else
			System.out.println("The alphabet is Consonant");
		

	}

}

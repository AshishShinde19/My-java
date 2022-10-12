/*
topic : program to demostrate while loop continue till the number is positive 
name : Ashish Shinde
date : 12/10/2022

*/

package javaprojrct;

import java.util.Scanner;

class Whileloop {

	public static void main (String arg[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the digit : ");
	int num = sc.nextInt();;
	
	while(num >= 1 )
	{
		
		System.out.println("Enter a Number: ");
	    num = sc.nextInt();
	}
	sc.close();
	}
}

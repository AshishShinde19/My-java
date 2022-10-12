/*
topic : program to demostrate while loop continue till the number is positive 
name : Ashish Shinde
date : 12/10/2022

*/

package javaprojrct;

import java.util.Scanner;

public class Do_while {
	
	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int y = sc.nextInt();
				
		sc.close();	
		for(int x = y ; x>=0; --x)
		{
		 do
		 {
			 
		  System.out.println("the reversion of number"+ x );
		  break;
		 }
		while(x>=10);
} 
}
}
package com.du.iff.elsee;
import java.util.Scanner;

public class IfElseAssignmentGreaterOfTwoNumbers_1 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		System.out.println("enter first number a =  ");
		a = sc.nextInt();
		
		
		System.out.println("enter second number b =  ");
		b = sc.nextInt();
		
		if ( a>b )
		{
			System.out.println(" A = " +a+ " is greater than " + b);
		}
		else
		{
			System.out.println(" B = "+b+ " is greater than" +a);
		}
	}
}

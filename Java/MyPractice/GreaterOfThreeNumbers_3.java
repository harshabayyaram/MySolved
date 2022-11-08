package com.du.iff.elsee;

import java.util.Scanner;

public class GreaterOfThreeNumbers_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		System.out.println("enter first number a =  ");
		a = sc.nextInt();
		
		
		System.out.println("enter second number b =  ");
		b = sc.nextInt();
		
		System.out.println("enter third number c =  ");
		c = sc.nextInt();
		
		if ( a == b && b== c)
		{
			System.out.println(" equal numbers " );
		}
		else if ( a>b )
		{
			if(a>c)
			{
			System.out.println(a + " A is greater " );
			}
		}
		else if ( b>a )
		{
			if(b>c)
			{
			System.out.println(a + " b is greater " );
			}
		}
		else if ( c>a )
		{
			if(c>b)
			{
			System.out.println(a + " c is greater " );
			}
		}
	}

}

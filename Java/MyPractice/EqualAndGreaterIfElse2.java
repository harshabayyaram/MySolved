package com.du.iff.elsee;

import java.util.Scanner;

public class EqualAndGreaterIfElse2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int a,b;
		System.out.println("enter first number a =  ");
		a = sc.nextInt();
		
		
		System.out.println("enter second number b =  ");
		b = sc.nextInt();
		
		if ( a == b )
		{
			System.out.println(" A = " +a+ " is Equal to  " + b);
		}
		else if(a>b)
		{
			System.out.println(" B = "+b+ " is greater than A= " +a);
		}
		else
		{
			System.out.println("A "+a+" is less than B = "+b);
		}
	}

}

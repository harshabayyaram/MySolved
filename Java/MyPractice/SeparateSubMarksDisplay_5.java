package com.du.iff.elsee;

import java.util.Scanner;

public class SeparateSubMarksDisplay_5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int m1,m2,m3;
		String sub1,sub2,sub3;
		
		System.out.println("enter the first subject marks = ");
		m1 = sc.nextInt();
		
		System.out.println("enter the second subject marks = ");
		m2 = sc.nextInt();
		
		System.out.println("enter the third subject marks = ");
		m3 = sc.nextInt();
		
		
		if(m1>=40)
		{
			System.out.println("sub1	pass");
		}
		else{
			System.out.println("sub1	Fail");
		}
		if(m2>=40)
		{
			System.out.println("sub2	pass");
		}
		else
		{
			System.out.println("sub2	fail");
		}
		if (m3 >= 40)
		{
			System.out.println("sub3	pass");
		}
		else
		{
			System.out.println("sub3	fail");
		}
		
		
		//final result 
		
		if ( m1 >= 40 && m2>=40 && m3>=40)
		{
			System.out.println("Result	Pass");
		}
		else
		{
			System.out.println("Result	fail");
		}
		
		
		
		
		
		sc.close();

	}

}

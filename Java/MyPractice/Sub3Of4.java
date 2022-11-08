package com.du.iff.elsee;

import java.util.Scanner;

public class Sub3Of4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m1,m2,m3,m4;
		boolean sub1,sub2,sub3,sub4;
		String Result;
		
		System.out.println("enter the first subject marks = ");
		m1 = sc.nextInt();
		
		System.out.println("enter the second subject marks = ");
		m2 = sc.nextInt();
		
		System.out.println("enter the third subject marks = ");
		m3 = sc.nextInt();
		
		System.out.println("enter the fourth subject marks = ");
		m4 = sc.nextInt();
		
		int inc = 0;
		
		if (m1>=40)
		{
			sub1 = true;
			inc = inc + 1;
		}

		if (m2 >= 40)
		{
			sub2 = true;
			inc = inc + 1;
		}

		if(m3>=40)
		{
			sub3 = true;
			inc = inc + 1;
		}

		if(m4 >=40)
		{
			sub4 = true;
			inc = inc + 1;
		}
		
		
		
		if(inc >= 3)
		{
			Result = "pass";
			System.out.println(Result);
		}
		else
		{
			Result = "fail";
			System.out.println(Result);
		}
		
		
		//printing
		
		System.out.println("sub1	sub2	sub3	sub4	Result");
		System.out.println( m1 +"\t"+m2+"\t"+m3+"\t"+m4+"\t"+Result);

		
		
		sc.close();
	}

}

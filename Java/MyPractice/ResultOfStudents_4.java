package com.du.iff.elsee;
import java.util.Scanner;

public class ResultOfStudents_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m1,m2,m3;
		
		System.out.println("enter the first subject marks = ");
		m1 = sc.nextInt();
		
		System.out.println("enter the second subject marks = ");
		m2 = sc.nextInt();
		
		System.out.println("enter the third subject marks = ");
		m3 = sc.nextInt();
		
		
		if ( m1 >= 40 && m2>=40 && m3>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		sc.close();
	}

}

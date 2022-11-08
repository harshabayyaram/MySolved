package com.du.iff.elsee;
import java.util.Scanner;

public class GradeSystem_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter avg");
		float avg = sc.nextFloat();
		
		if(avg>=90)
		{
			System.out.println("Grade A");
		}
		else if (avg >=80 && avg <=89)
		{
			System.out.println("Grade B");
		}
		else if (avg >=70 && avg <= 79)
		{
			System.out.println("Grade c");
		}
		else if (avg >= 60  && avg <= 69)
		{
			System.out.println("Grade D");
		}
		else if (avg < 60)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("fail");
		}

	}

}

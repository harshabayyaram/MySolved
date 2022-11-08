package com.du.iff.elsee;
import java.util.Scanner;

public class CcricketBatsmanScore_8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the Score of the batsman");
		int score = sc.nextInt();
		
		if(score <0)
		{
			System.out.println("invalid input");
		}
		else if(score ==0 )
		{
			System.out.println("Duckout");
		}
		else if(score>=1 && score <=49)
		{
			System.out.println("Normal score");
		}
		else if(score>=50 && score <=99)
		{
			System.out.println("half century");
		}
		else if(score>=100 && score <=199)
		{
			System.out.println("Century");
		}
		else if(score>=199 && score <=200)
		{
			System.out.println("Double century");
		}
	

	}

}

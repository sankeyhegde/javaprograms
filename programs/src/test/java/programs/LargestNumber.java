package programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		
		System.out.println("Enter the b value");
		int b= sc.nextInt();
		
		System.out.println("Enter the c value");
		int c =sc.nextInt();
		
		//logic 1
		//int a=40,b=20,c=50;
//		
//		if(a>b && a>c)
//		{
//			System.out.println("a is the gretest no");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is the gretest no ");
//		}
//		else
//		{
//			System.out.println("c is the gretest no ");
//		}
//		
		
		//logic 2
		
		
		int largest =c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("largest no "+" "+largest);
		
		
	}

}

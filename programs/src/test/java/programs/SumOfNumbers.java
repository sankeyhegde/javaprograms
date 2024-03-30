package programs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		
		int num=sc.nextInt();
		
		int count=0,sum=0;
		
		while(num!=0) {
			
			sum=sum+num%10;
		num=	num/10;
		count++;
			
		}
		
		System.out.println("Count of the input"+" "+count);
		System.out.println("Sun of the input"+" "+sum);
		
	}

}

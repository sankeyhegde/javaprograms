package programs;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no ");
		int num=sc.nextInt();
		
		int count =0;
		
		if(num>1)
		{
		
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("number is prime number");
			}
			else
			{
				System.out.println("number is not a prime number ");
			}
			
		}
		else
		{
			System.out.println("number is palandrome");
		}
		
		
	}

}

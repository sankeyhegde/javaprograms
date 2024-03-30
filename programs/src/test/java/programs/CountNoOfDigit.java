package programs;

import java.util.Scanner;

public class CountNoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		
		int num=sc.nextInt();
		
		int count=0,even=0, odd=0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
			if(num%2==0) {
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Count of the input"+" "+count);
		System.out.println("count od the even no"+" "+even);
		System.out.println("count of the odd no "+" "+odd);
	}

}

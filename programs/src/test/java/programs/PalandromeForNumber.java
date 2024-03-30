package programs;

import java.util.Scanner;

public class PalandromeForNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num= sc.nextInt();
	
		
		int rev=0;
		int org_num=num;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
	//	System.out.println(rev);
		
		if(org_num == rev) {
			System.out.println("number in palandrome");
		}
		else
		{
			System.out.println("number is not palandrome ");
		}
		
//		System.out.println("after reverse ");
//		System.out.println("Reverse No ="+rev);
		
	}

}

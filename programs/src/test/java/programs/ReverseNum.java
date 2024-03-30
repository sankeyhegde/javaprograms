package programs;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("input number="+num);
		System.out.println("before reverse ");
		
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		System.out.println("after reverse ");
		System.out.println("Reverse No ="+rev);
		
	}

}

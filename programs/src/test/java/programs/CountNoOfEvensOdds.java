package programs;

import java.util.Scanner;

public class CountNoOfEvensOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		
		int num=sc.nextInt();
		
		int count=0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		
		System.out.println("Count of the input"+" "+count);
	}

}

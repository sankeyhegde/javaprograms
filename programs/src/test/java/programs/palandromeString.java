package programs;

import java.util.Scanner;

public class palandromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your word =" );
		String str = sc.next();
		//System.out.println("Input string"+str);
		
		//String str ="sankey";
		String rev ="";
		String org_Str=str;
		
		int len= str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_Str.equals(str)) {
			System.out.println("palandrome");	
			}
			else
			{
				System.out.println("not a palandorme");
			}
		//System.out.println("After Reverse ="+" " +rev);
		
		
	}

}

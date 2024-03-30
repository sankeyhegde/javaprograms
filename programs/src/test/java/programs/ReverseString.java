package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Type your word =" +sc.next());
		String str = sc.next();
		//System.out.println("Input string"+str);

		//lOGIC 1 
		
//		//String str ="sankey";
//		String rev ="";
//		
//		int len= str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
		
		
	//System.out.println("After Reverse ="+" " +rev);
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}

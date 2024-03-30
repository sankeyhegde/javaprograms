package programs;

import java.util.Arrays;

public class checkArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a1[]= {1,2,3,4,5};
		char a2[]= {1,2,3,4,5};
		
		Boolean bol=Arrays.equals(a1, a2);
		
		if(bol== true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

}

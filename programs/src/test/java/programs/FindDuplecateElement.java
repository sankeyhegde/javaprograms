package programs;

import java.util.HashSet;

public class FindDuplecateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[]= {"sankey","sam","bob","ram","sankey"};
		Boolean bol=false;
		
		
		//logic 1
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if (a[i]==a[j])
//				{
//					System.out.println("Found Duplicate Element "+" "+a[i]);
//					bol=true;
//				}
//			}
//		}
//		
//		if(bol== false)
//		{
//			System.out.println("Duplicate element is not found ");
//		}
		
		
		//logic 2 
		
		HashSet <String> len = new HashSet();
		
		for(String l:a)
		{
			if ((len.add(l)== false))
				{
				System.out.println("Duplicate amount found " + " " + l);
				bol=true;
				}
		}
		
		if(bol== false)
		{
			System.out.println("Duplicate number is not found ");
		}
		
	}

}

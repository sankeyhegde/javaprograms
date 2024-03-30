package programs;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {10,40,50,30,100};
		
		int searchValue=10;
		Boolean bol = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchValue)
			{
				System.out.println("the search value present at "+" "+i);
			
				bol=true;
				break;
			}
		}
		if(bol== false)
		{
			System.out.println("search value is not present in the array ");
		}
	}

}

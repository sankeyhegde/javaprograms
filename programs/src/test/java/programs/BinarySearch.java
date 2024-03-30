package programs;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {1,2,3,4,5,10,20,30,40,50};
		
		int key =100;
		
		int l=a[0];
		
		int h=a.length-1;
		Boolean bol = false;
		
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			
			if(a[m] == key)
			{
				System.out.println("key value is found");
				bol= true;
				break;
			}
			
			if(a[m]<key)
			{
				l=m+1;
			}
			
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		
		if(bol == false)
		{
			System.out.println("key value is not found ");
		}
	}

}

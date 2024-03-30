package programs;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {2,20,30,5,8};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum number in array "+" "+min);
	}

}

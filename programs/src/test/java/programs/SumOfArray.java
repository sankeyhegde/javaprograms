package programs;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {10,10,10,10};
		int len =a.length;
		int sum=0;
		for(int i=len-1;i>=0;i--)
		{
			sum = sum+a[i];
		}
		
		System.out.println(sum);
		
	}

}

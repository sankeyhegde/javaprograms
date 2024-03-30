package programs;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[] = {1,2,4,5};
		
		int len=a.length;
		int sum1=0,sum2=0;
		
		for(int i=len-1;i>=0;i--)
		{
			 sum1= sum1+a[i];
		}
		System.out.println(sum1);
		
		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("missing no"+" "+(sum2-sum1));
	}

}

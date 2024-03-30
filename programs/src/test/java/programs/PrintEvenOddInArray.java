package programs;

public class PrintEvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {1,2,3,4,5};
		int even=0,odd=0;
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			//int num=a[i];
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("even "+" "+even);
		System.out.println("odd "+" "+odd);
	}

}

package programs;

public class GretestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {30,40,10,20,100};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println("gretest number in array "+" "+max);
	}

}

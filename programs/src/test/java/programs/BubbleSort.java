package programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,3,5,1,2};
		
		System.out.println("before sorting the array "+" "+Arrays.toString(a));
		int n = a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				int temp =a[j];
				 a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
		System.out.println("After sorting the array" + " "+Arrays.toString(a));
	}

}

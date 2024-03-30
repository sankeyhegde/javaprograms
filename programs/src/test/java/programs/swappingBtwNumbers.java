package programs;

public class swappingBtwNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10,b=20;
		System.out.println("before Swapping");

		System.out.println("the values of a=" +a+"values of b="+b);
		
//		//logic 1 
//		
//		int temp;
//		temp=a;
//		a=b;;
//		b=temp;
		
		
		//logic 2 without temp
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;
		
		
		
		
		System.out.println("after Swapping");
		System.out.println("the values of a=" +a+"values of b="+b);
	}

}

package Programs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//with temp variable
//		System.out.println("before swapping:");
//		System.out.println("a "+a);
//		System.out.println("b "+b);
//		
//		
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		
//		System.out.println("after swapping:");
//		System.out.println("a "+a);
//		System.out.println("b "+b);
		
		//without temp variable
		
		System.out.println("before swapping:");
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		a = a-b; //-10
		b = a+b; //30
		a = b-a; //20
		
		System.out.println("after swapping:");
		System.out.println("a "+a);
		System.out.println("b "+b);
		

	}

}

package Programs;

public class SwapString {

	public static void main(String[] args) {
		
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping: ");
		
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is: " +b);
		
		
		//append a and b
		a = a+b;// HelloWorld
		
		//store initial string a in to string b
		
		b = a.substring(0, a.length()-b.length());
		
		//store initial b in to string a
		
		a = a.substring(b.length());
		
		System.out.println("After swapping: ");
		
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is: " +b);
		
		
		
		
		
		
		
		
		
		

	}

}

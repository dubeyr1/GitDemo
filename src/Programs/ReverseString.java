package Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		//string is imutable object so s.rev wont work here
		//using for loop
		
		String s = "Selenium";
		
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1;i>=0;i--) {
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
	
		
		//using string buffer class
		String s1 = "Testing";
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf.reverse());
		

	}
	
	
	
	

}

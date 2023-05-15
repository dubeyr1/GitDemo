package Programs;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String str = "selenium Testing with Java super";
		
		String str1 = "selenium Testing with Java super";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf('s'));  //1st occurrence
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); //2nd occurrence
		
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1)); //3rd occurrence
		
		System.out.println(str.indexOf("with"));
		
		//string comparison
		
		System.out.println(str.equals(str1));
		
		
		
		
		
		
		
		
	}

}

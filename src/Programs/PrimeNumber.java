package Programs;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		}
	
		
	
	
	
	public static void main(String[] args) {
		
		// a number can be devided by own 
		
		
		System.out.println(isPrimeNumber(2));
		

	}

}

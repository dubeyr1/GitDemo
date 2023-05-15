package Programs;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		double number = -12.33;
		
		if(number < 0.0) {
			System.out.println(number + " is Negative number");
		}
		else if(number > 0.0) {
			System.out.println(number + " is positive number");
		}
		else {
			System.out.println(number + " is zero");
		}
		

	}

}

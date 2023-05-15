package Programs;

public class ArmstrongNumber {
	
	//153
	//1*1*1 = 1
	//5*5*5 = 125
	//3*3*3 = 27
	
	public static void isArmstrongNUmber(int num) {
		
		int cube = 0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
			
		}
		
		if(t==cube) {
			System.out.println("This is armstrong number");
		}
		else {
			System.out.println("This is not an armstrong number");
		}
		
	}
	

	public static void main(String[] args) {
		
		isArmstrongNUmber(153);
		
		
		
	}

}

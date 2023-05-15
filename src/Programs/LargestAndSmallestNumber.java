package Programs;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24,50, 5, -88 , 99};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("given array is :"+ Arrays.toString(numbers));
		System.out.println("largest number is :"+ largest);
		System.out.println("smallest number is :"+ smallest);
		
		
		

	}

}

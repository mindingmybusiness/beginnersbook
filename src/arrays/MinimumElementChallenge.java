package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
	
	public static void main(String[] args) {
		int[] myIntAttay = readIntegers();
		int min = findMin(myIntAttay);
		System.out.println("Min element is: " + min );
		
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(myIntAttay));
		reversedArray(myIntAttay);
		System.out.println(Arrays.toString(myIntAttay));
	}
	
	private static int[] readIntegers() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter a comma seperated number array");
		
		String stringEntered = sc.next();
		String[] inputEntered = stringEntered.split(",");
		
		int[] enteredNumbers = new int[inputEntered.length];
		for(int i=0;i<inputEntered.length;i++) {
			enteredNumbers[i] = Integer.parseInt(inputEntered[i].trim());
		}
		
		return enteredNumbers;
	}
	
	private static int findMin(int[] array) {
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	private static void reversedArray(int[] array) {		
		int maxIndex = array.length-1;
		int halfLength = array.length/2;
		
		for(int i=0;i<halfLength;i++) {
			int temp = array[i];
			array[i] = array[maxIndex-i];
			array[maxIndex-i] = temp;
			System.out.println(array[maxIndex-i]);
		}
	}

}

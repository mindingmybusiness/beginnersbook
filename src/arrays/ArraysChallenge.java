package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
	
	public static void main(String[] args) {
		int[] myArray = getRandomArray(10);
		int[] copyOfArray = Arrays.copyOf(myArray, 10);
		System.out.println(Arrays.toString(copyOfArray));
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		myArray = reversedArray(myArray);
		System.out.println(Arrays.toString(myArray));
		
		
	}
	
	private static int[] getRandomArray(int len) {
		int[] newArray = new int[len];
		Random random = new Random();
		
		for(int i=0;i<len;i++) {
			newArray[i] = random.nextInt(100);
		}
		return newArray;
	}
	
	private static int[] reversedArray(int[] array) {
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		for(int i=0;i<arrayCopy.length;i++) {
			arrayCopy[i] = array[array.length-1-i];
		}
		
		return arrayCopy;
	}

}

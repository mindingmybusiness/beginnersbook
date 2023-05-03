package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayPlay {
	
	public static void main(String[] args) {
		int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(firstTen.length);
		System.out.println(Arrays.toString(firstTen));
		System.out.println(Arrays.binarySearch(firstTen, 7));
		System.out.println(Arrays.binarySearch(firstTen, 12));
		//Binary search can be performed only when the items in an 
		//array are sorted
		int[] secondTen = {1,2,3,4,5,6,7,8,9,10};
		if(Arrays.equals(firstTen, secondTen)) {
			System.out.println("Arrays are equal");
		}
		
		
		int[] firstArray = getRandomArray(10);
		Arrays.sort(firstArray);
		System.out.println(Arrays.toString(firstArray));
		
		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		Arrays.fill(secondArray, 2);
		System.out.println(Arrays.toString(secondArray));
		
		int[] thirdArray = getRandomArray(10);
		System.out.println(Arrays.toString(thirdArray));
		int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
		System.out.println(Arrays.toString(fourthArray));
		
		
	}

	public static int[] getRandomArray(int len) {
		
		Random random = new Random();
		int[] newInt = new int[len];
		
		for(int i=0;i<len;i++) {
			newInt[i] = random.nextInt(100);
		}
		
		return newInt;
		
	}
}

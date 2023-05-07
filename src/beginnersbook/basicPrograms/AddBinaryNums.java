package beginnersbook.basicPrograms;

import java.util.Scanner;

public class AddBinaryNums {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first binary number");
		int bin1 = sc.nextInt();
		System.out.println("Enter the second binary number");
		int bin2 = sc.nextInt();

		int carry = 0;
		int sum = 0;
		String result = "";

		while (bin1 != 0 || bin2 != 0) {
			int digit1 = bin1 % 10;
			int digit2 = bin2 % 10;

			if (carry + digit1 + digit2 == 0) {
				sum = 0;
				carry = 0;
			} else if (carry + digit1 + digit2 == 1) {
				sum = 1;
				carry = 0;
			} else if (carry + digit1 + digit2 == 2) {
				sum = 0;
				carry = 1;
			} else if (carry + digit1 + digit2 == 3) {
				sum = 1;
				carry = 1;
			}

			result = result + sum;

			bin1 = bin1 / 10;
			bin2 = bin2 / 10;

		}

		if (carry == 1) {
			result = result + 1;
		}

		String actualResult = reverseDigits(result);
		System.out.println("Result of the addition is:" + actualResult);

	}

	private static String reverseDigits(String result) {
		char[] res = result.toCharArray();

		String actualResult = "";

		for (int i = res.length - 1; i >= 0; i--) {
			actualResult = actualResult + res[i];
		}

		return actualResult;
	}

}

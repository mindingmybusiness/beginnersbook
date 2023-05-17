package beginnersbook.basicPrograms;

import java.util.Scanner;

public class VowelOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		String ch = sc.next();
		
		boolean flag = false;
		
		switch (ch.toLowerCase()) {
		case "a":
			flag = true;
			break;
		case "e":
			flag = true;
			break;
		case "i":
			flag = true;
			break;
		case "o":
			flag = true;
			break;
		case "u":
			flag = true;
			break;
		default:
			System.out.println("Entered value is a consonant");
			break;
		}
		
		if(flag) {
			System.out.println("The entered value is a vowel");
		}
	}

}

package arrayLists;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

	public static ArrayList<String> myList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String add = "";
		String remove = "";

		while (true) {
			System.out.println("Available actions: \n" + "0 - to Shut down \n"
					+ "1 - to add item(s) to list (comma delimited list \n"
					+ "2 - to remove any item(s) (comma delimited list \n"
					+ "Enter a number for which action you want to do");

			int input = sc.nextInt();
			switch (input) {
			case 0:
				System.out.println("System exit called");
				System.exit(0);
				break;
			case 1:
				System.out.println("Please enter the items to add in a comma" + " separated list");
				add = sc.next();
				addToList(add);
				break;

			case 2:
				System.out.println("Please enter the items to remove in a " + "comma separated list");
				remove = sc.next();
				removeFromList(remove);
				break;
			default:
				System.out.println("Enter correct input from the list");
				break;
			}
			System.out.println(myList);
		}

	}

	private static ArrayList<String> addToList(String add) {
		String[] splitString = add.split(",");
		for (String s : splitString) {
			if (myList.contains(s)) {
				continue;
			} else {
				myList.add(s);
			}
		}
		//Collections.sort(myList);
		myList.sort(Comparator.naturalOrder());
		return myList;
	}

	private static ArrayList<String> removeFromList(String remove) {
		String[] splitString = remove.split(",");
		for (String s : splitString) {
			myList.remove(s);
		}
		Collections.sort(myList);
		return myList;
	}

}

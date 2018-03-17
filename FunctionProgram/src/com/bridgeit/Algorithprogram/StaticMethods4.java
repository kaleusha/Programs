package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class StaticMethods4 {
	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("enter size of array ");
		int n = Utility.inputInteger();

		System.out.println("integer array using insertion sort then press 1");
		System.out.println("string array using insertion sort then press 2");
		System.out.println("integer array using bubbol sort then press 3");
	    System.out.println("string array using bubbol sort then press 4");
	    System.out.println("search any integer key using binary search then press 5");
		System.out.println("searh any string key then press  6");
		

		Integer array[];

		String stringArray[];
		String string[];

		System.out.println("enter choice ");
		int choice = Utility.inputInteger();

		switch (choice) {
		case 1:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = Utility.inputInteger();
			}
			array = utility.insertionSortString(array);
			Utility.print(array, array.length);
			break;

		case 2:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = Utility.inputString();
			}
			string = utility.insertionSortString(stringArray);
			Utility.print(string, stringArray.length);

			break;

		case 3:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = Utility.inputInteger();
			}
			array = Utility.bubbleSortInt(array);
			Utility.print(array, array.length);
			break;

		case 4:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = Utility.inputString();
			}
			string = Utility.bubbleSortInt(stringArray);
			Utility.print(string, stringArray.length);

			break;

		case 5:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = Utility.inputInteger();
			}
			utility.insertionSortString(array);
			System.out.println("enter key ");
			Integer key = Utility.inputInteger();
			array = utility.binarySearchInt(array, key);
			Utility.print(array, array.length);
			break;

		case 6:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = Utility.inputString();
			}

			utility.insertionSortString(stringArray);
			System.out.println("enter Stringkey ");
			String stringKey = Utility.inputString();
			System.out.println();
			string = utility.binarySearchInt(stringArray, stringKey);
			Utility.print(stringArray, stringArray.length);

			break;
		default:
			System.out.println("program end");

		}
	}

}

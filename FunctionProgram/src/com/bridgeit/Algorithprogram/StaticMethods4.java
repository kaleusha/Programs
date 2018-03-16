package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class StaticMethods4 {
	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("enter size of array ");
		int n = utility.inputInteger();

		System.out.println("if you want sort the integer array using insertion sort then press 1");
		System.out.println("if you want sort the string array using insertion sort then press 2");
		System.out.println("if you want sort the integer array using bubbol sort then press 3");
	    System.out.println("if you want sort the string array using bubbol sort then press 4");
	    System.out.println("if you want search any integer key using binary search then press 5");
		System.out.println("if you want searh any string key then press  6");
		

		Integer array[];

		String stringArray[];
		String string[];

		System.out.println("enter choice ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			array = utility.insertionSortString(array);
			utility.print(array, array.length);
			break;

		case 2:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}
			string = utility.insertionSortString(stringArray);
			utility.print(string, stringArray.length);

			break;

		case 3:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			array = utility.bubbleSortInt(array);
			utility.print(array, array.length);
			break;

		case 4:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}
			string = utility.bubbleSortInt(stringArray);
			utility.print(string, stringArray.length);

			break;

		case 5:
			System.out.println("enter integer element ");

			array = new Integer[n];
			for (int i = 0; i < n; i++) {
				array[i] = utility.inputInteger();
			}
			utility.insertionSortString(array);
			System.out.println("enter key ");
			Integer key = utility.inputInteger();
			array = utility.binarySearchInt(array, key);
			utility.print(array, array.length);
			break;

		case 6:
			System.out.println("enter String ");
			stringArray = new String[n];
			for (int i = 0; i < n; i++) {
				stringArray[i] = utility.inputString();
			}

			utility.insertionSortString(stringArray);
			System.out.println("enter Stringkey ");
			String stringKey = utility.inputString();
			System.out.println();
			string = utility.binarySearchInt(stringArray, stringKey);
			utility.print(stringArray, stringArray.length);

			break;
		default:
			System.out.println("program end");

		}
	}

}

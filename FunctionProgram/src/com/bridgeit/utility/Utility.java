package com.bridgeit.utility;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.xml.soap.Node;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.DataStructure.LinkedListStructure;
import com.bridgeit.DataStructure.OrderedListStructure;
import com.bridgeit.DataStructure.QueueStructure;
import com.bridgeit.DataStructure.StackCalender10;
import com.bridgeit.DataStructure.StackStructure;


import java.util.Date;
import java.util.regex.Matcher;

import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;
public class Utility {

	static Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	public static String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Long
	public long inputLong() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}
	
	
	// INPUT Double
	public long inputDouble() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;


	}

	/**
	 * Purpose:Print Leap Year or Not
	 * 
	 * @param year
	 */
	public static void leapYear(int year) {

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println(+year + " Is Leap Year");
			} else {
				System.out.println(+year + " Is Not Leap Year");
			}
		} else {
			if (year % 4 == 0) {
				System.out.println(+year + " Is Leap Year");
			} else {
				System.out.println(+year + " Is Not Leap Year");
			}
		}
	}

	/**
	 * Purpose:Print Power Of 2
	 * 
	 * @param number
	 */
	public static void power(int number) {
		int mult = 2;
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				System.out.println("2^0=1");
			} else

			{
				int j = 1;
				j = j * mult;
				System.out.println("2^" + i + "=" + j);
				mult = mult * 2;
			}
		}

	}

	/**
	 * Purpose:Print 
	 * 
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void grambler(int stake, int goal, int trials) {
		int lbets = 0;
		int wins = 0;
		for (int i = 0; i < trials; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				//lbets++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;/*


					 */
				}
				if (cash == goal) {
					wins++;
				}
			}
		}
		System.out.println(wins + " Wins off " + trials);
		int won = 100 * wins / trials;
		System.out.println("Percentage of won: " + won);
		//System.out.println("Avg bets = " + 1.0 * lbets / trials);
	}

	/**
	 * Purpose:Print Distinct Coupon Number
	 * 
	 * @param number
	 */
	public static void couponRandom(int number) {
		int array[] = new int[number];

		Random rand = new Random();
		// System.out.println("Random Elements are:");
		for (int i = 0; i < array.length; i++) {
			// Generate Random Elements
			int r = rand.nextInt(number);
			array[i] = r;

			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("unique Elements Are:");
		// Print Unique Elements
		for (int i = 0; i < number; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * Purpose:Print Last Harmonic Number
	 * 
	 * @param number
	 */
	public static void harmonic(int number) {
		double result = 0.0;
		if (number == 0) {
			System.out.println("   ");

		} else {
			for (int i = 1; i <= number; i++) {

				result = result + (1.0 / i);
			}
		}

		System.out.println("Harmonic Series is " + result);
	}

	/**
	 * Purpose:Print Percentage Of Head And Tail
	 * 
	 * @param number
	 */
	public static void flipCoin(int number) {
		int tailcount = 0;
		int headcount = 0;
		float array[] = new float[number];
		for (int i = 0; i < number; i++) {
			array[i] = (float) Math.random();// Generate Random Elements
			System.out.println(array[i]);

		}
		// Count Head and Tail
		for (int i = 0; i < number; i++) {
			if (array[i] < 0.5) {
				tailcount++;
			} else {
				headcount++;

			}
		}
		System.out.println("The number of tails is" + tailcount);
		System.out.println("The number of head us" + headcount);
		// Calculate Percentage of Head And Tail
		int tailper = tailcount * 100 / number;
		int headper = headcount * 100 / number;
		System.out.println("The percentage of tail is" + tailper);
		System.out.println("The percentage of head is" + headper);
	}

	/**
	 * Purpose:Print Odd Prime Factors Of Any Number
	 * 
	 * @param number
	 */
	public static void primeFactor(int number) {
		System.out.print("Prime Factors are : ");
		for (int i = 2; i <= number; i++) {

			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
	}

	/**
	 * Purpose:Print Number Of Triples Found
	 * 
	 * @param array
	 * @param number
	 */
	public static void sumOf3Int(int[] array, int number) {
		int count = 0;

		boolean found = false;
		System.out.print("Triple Elements is: ");
		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {

					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(+array[i]);
						System.out.println(+array[j]);
						System.out.println(+array[k]);
						found = true;
						count++;
					}

				}

			}
		}
		{
			if (found == false)
				System.out.println("Triple not exist");
		}
		System.out.print("Triples Are: " + count);
		System.out.println(" ");
	}

	/**
	 * Purpose:Print Roots Of Given Equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(int a, int b, int c) {
		int delta = b * b - 4 * a * c;
		if (delta > 0) {
			System.out.println("Roots Are Unequal");
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots are:" + root1);
			System.out.println("Roots are:" + root2);

		} else if (delta == 0) {
			System.out.println("Roots Are Equal");
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots are:" + root1);
		} else {
			System.out.println(" Roots Are Imaginary ");
		}
	}

	/**
	 * Purpose:Print Matrix
	 * 
	 * @param ch
	 * @param row
	 * @param colum
	 */
	public static void matrix(int ch, int row, int colum) {
		Scanner scanner = new Scanner(System.in);
		switch (ch) {
		case 1:

			int array[][] = new int[row][colum];
			System.out.println("Enter Array Element:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Matrix Elements Are:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					System.out.print(array[i][j]);

				}
				System.out.println("  ");
			}
			break;

		case 2:
			float array1[][] = new float[row][colum];
			System.out.println("Enter Array Element:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array1[i][j] = scanner.nextFloat();
				}
			}
			System.out.println("Matrix Elements Are:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					System.out.print(array1[i][j]);

				}
				System.out.println("  ");
			}
			break;

		case 3:
			boolean array2[][] = new boolean[row][colum];
			System.out.println("Enter Array Element:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array2[i][j] = scanner.nextBoolean();
				}
			}
			System.out.println("Matrix Elements Are:");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					System.out.print(array2[i][j]);

				}
				System.out.println("  ");
			}
			break;

		}
		scanner.close();

	}

	/**
	 * Purpose:prints the wind chill
	 * 
	 * @param t
	 * @param v
	 * @param w
	 */
	public static void windChill(double temprature, double speed) {
		// TODO Auto-generated method stub
		double windChill;
		if (temprature > 50 && (speed > 3 && speed < 120)) {
			windChill = 35.74 + 0.6215 * temprature + (0.4275 * temprature - 35.75) * Math.pow(speed, 0.16);
			System.out.println("Temprature: " + temprature);
			System.out.println("speed: " + speed);
			System.out.println("windchill: " + windChill);
		} else {
			System.out.println("Invalid Temprature or Speed");
		}
	}

	/**
	 * 
	 * Purpose:prints the Elapsed Time
	 * 
	 */
	public static double START_TIMER;
	public static double STOP_TIMER;

	public static double start() {
		double START_TIMER = System.currentTimeMillis();
		System.out.println("Start Time is: " + START_TIMER );
		return START_TIMER;
	}

	public static double stop() {
		double STOP_TIMER = System.currentTimeMillis();
		System.out.println("Stop Time is: " + STOP_TIMER);
		return STOP_TIMER;
	}

	public static double getElapsedTime(double START_TIMER, double STOP_TIMER) {
		double ELAPSED = (STOP_TIMER - START_TIMER);
		return ELAPSED;
	}

	/**
	 * Purpose:print Prime Numbers Between 0 To 1000
	 * 
	 * @return
	 * 
	 */
	public static ArrayList<Integer> primeNumber() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			int flag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}

			}

			if (flag == 0) {
				System.out.print(i + " ");
				list.add(i);
			}

		}
		return list;

	}

	/**
	 * Purpose: Print the String with User Name
	 * 
	 * @param input
	 */
	public static void stringReplace(String input) {
		// TODO Auto-generated method stub
		String str = "Hello <<UserName>>, How are you? ";
		if (input.length() > 3) {
			System.out.println("valid string");
			String replaceString = str.replace("<<UserName>>", input);
			System.out.println(replaceString);
		}

		else
			System.out.println("enter greter than 3 char in string");

	}

	/**
	 * Purpose: Print Two Strings Are Anagram Or Not
	 * 
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static <E> boolean anagram(String string1, String string2) {
		boolean status = true;


		if ( string1.length()!= string2.length()) {
			status = false;
		} else {
			char [] ArrayS1 = string1.toCharArray();
			Arrays.sort(ArrayS1);
			char ArrayS2[] = string2.toCharArray();
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);

		}
		if (status) {

			return true;
		} else {

			return false;
		}

	}

	/**
	 * Purpose:Print Sorted Array
	 * 
	 * @param arr
	 * @param number
	 */
	public void bubbleSort(int arr[], int number) {
		int temp;
		int n = arr.length;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n - 2; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	public void printArray(int arr[], int number) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/**
	 * Purpose:Print Day
	 * 
	 * @param m
	 * @param d
	 * @param y
	 * @return
	 */
	public static int dayOfWeek(int m, int d, int y) {
		// TODO Auto-generated method stub
		int y0, x, m0, d0;
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;

		d0 = Math.floorMod((d + x + 31 * m0 / 12), 7);

		return d0;
	}

	/**
	 * Purpose: Find number
	 * 
	 * @param low
	 * @param high
	 * @param middle
	 * @param count
	 * @param num
	 */
	public static void binarySearch(int low, int high, int middle, int count, int num) {
		Utility utility = new Utility();
		String input = null;
		;
		System.out.println("Is your number:" + middle);

		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input = utility.inputString();
		do {
			if (input.equals("high")) {
				low = middle;
				count++;
			} else if (input.equals("yes")) {
				System.out.println("The number you search was: " + middle);
				int no = count + 1;
				System.out.println("It takes " + no + " times to find your exact number");
				break;
			} else if (input.equals("low")) {
				high = middle;
				count++;
			}
			if (count < num) {
				middle = (low + high + 1) / 2;
				System.out.println("Is your number " + middle + ":");
				input = utility.inputString();
			}
		} while (low <= high);
		if (count > num) {
			System.out.println("Number not found");
		} else {
			System.exit(0);
		}

	}

	/**
	 * Purpose:Print Sorted order
	 * 
	 * @param arr
	 * @param number
	 */
	public static void insertionSort(int arr[], int number) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/**
	 * Purpose:Print Sorted order
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	public static void mergesort(int array[], int low, int high) {
		int n = high - low;
		if (n <= 1)
			return;
		int mid = low + n / 2;
		mergesort(array, low, mid);
		mergesort(array, mid, high);
		int temp[] = new int[n];
		int i = low, j = mid;
		for (int k = 0; k < n; k++) {
			if (i == mid) {
				temp[k] = array[j++];
			} else if (j == high) {
				temp[k] = array[i++];
			} else if (array[j] < array[i]) {
				temp[k] = array[j++];
			} else {
				temp[k] = array[i++];
			}
		}
		for (int k = 0; k < n; k++)
			array[low + k] = temp[k];

	}

	/**
	 * Purpose:Print Monthly Payment
	 * 
	 * @param principal
	 * @param rate
	 * @param year
	 */
	public static void monthlyPayment(int principal, double rate, int year) {
		// TODO Auto-generated method stub
		int n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (principal * rate) / (1 - Math.pow((1 + rate), (-1)));
		System.out.println("Monthly Payment Is: " + payment);

	}

	/**
	 * Purpose:Print Prime Numbers That Are Anagram
	 * 
	 * @param strArray
	 */
	public static void primeAnagram(int[] strArray) {
		// TODO Auto-generated method stub
		System.out.println("\nprime number That Are Anagarm:");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (Utility.anagram(strArray[i]+ " ", strArray[j]+ " ")) {
					System.out.println(strArray[i] + " -> " + strArray[j]);
				}
			}
		}




	}

	/**
	 * Purpose:Search String
	 * 
	 * @param key
	 * @param words
	 * @param low
	 * @param high
	 * @return
	 */
	public static int binarySearchString(String key, String[] words, int low, int high) {

		if (high <= low)
			return -1;

		if (low <= high) {
			int mid = (low + high) / 2;
			if (key.compareTo(words[mid]) == 0) {
				return mid;
			} else if (key.compareTo(words[mid]) > 0) {
				return binarySearchString(key, words, mid + 1, high);
			} else {
				return binarySearchString(key, words, low, mid - 1);
			}
		}

		return -1;
	}

	/**
	 * Purpose:Sort String
	 * 
	 * @param input
	 */
	public static void bubblesortString(String input[]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].compareToIgnoreCase(input[j]) > 0) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			System.out.println(input[i]);
		}
	}

	/**
	 * Purpose:Read File
	 * 
	 * @param filePath
	 * @return
	 */
	public static String[] readFile(String filePath) {
		String[] words= {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[];
		BufferedReader bufferedReader;
		FileReader file;

		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) {
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++) {
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return words;
	}

	/**
	 * Purpose:Print Leap Year or NOt
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	/**
	 * @param str
	 */
	public static void display(String[][] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print("|_" + str[i][j] + "_|");
			}
			System.out.println();
		}

		System.out.println("\n");
	}

	/**
	 * Purpose: Find out Permutation
	 * @param str
	 * @param l
	 * @param r
	 */
	public static void permute(String str, int l, int r) {
		int count = 0;
		if (l == r) {

			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);

			}
		}
		// System.out.println(count);
	}

	/**
	 * Purpose: Swap Elements
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String str, int i, int j) {
		char temp;
		char charArray[] = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Purpose: Banking 
	 * @param amunt
	 */
	static double balance = 0;

	public static void enqueue(double amunt) {

		balance = balance + amunt;
		System.out.println("Rs" + amunt + " Deposited Sucessfully");
		System.out.println("Current Balance is Rs" + balance);

	}

	public static void dequeue(double amuntw) {
		balance = balance - amuntw;
		System.out.println(" Rs" + amuntw + " Withdraws Sucessfully");
		System.out.println("Current Balance is Rs " + balance);
	}

	public static void checkbalance() {
		System.out.println("Current Balance is Rs" + balance);
	}

	/**
	 * Purpose:Print Factorial Of Given Number
	 * 
	 * @param number
	 */
	public static int factorial(int number) {
		// TODO Auto-generated method stub
		int i, fact = 1;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		// System.out.println("Factorial of "+number+" is: "+fact);
		return fact;
	}

	/**
	 * Purpose: Find Number of Possible Ways To Arrange Tree
	 * 
	 * @param array
	 */
	public static void NumberOfBinarySearchTree(int number) {
		long fact1, fact2, fact3, counter = 0;

		fact1 = factorial((2) * (number));
		fact2 = factorial(number + 1);
		fact3 = factorial(number);

		counter = fact1 / (fact2 * fact3);

		System.out.println(counter);
	}

	/**
	 * Purpose: Print Binary Number
	 * 
	 * @param num
	 */
	public void DecimalTOBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

	}

	/**
	 * Purpose: Print Decimal Number
	 * 
	 * @param binary
	 */
	public void convertBinaryToDecimal(String binary) {
		int result = 0;

		for (int j = 0; j < binary.length(); j++) {
			char currentChar = binary.charAt(binary.length() - j - 1);
			int numericValue = Character.getNumericValue(currentChar);
			result += Math.pow(2, j) * numericValue;

		}
		System.out.println(result);

	}

	/**
	 * Purpose: Swap Nibbles
	 * 
	 * @param binary
	 * @return
	 */
	public static String swapNibbles(String binary) {
		binary = binary.replaceAll("", "");
		String Lower_NIBBELE = binary.substring(0, 4);
		String UPPER_NIBBELE = binary.substring(4, 8);
		String SwapingBinary = UPPER_NIBBELE + Lower_NIBBELE;
		return SwapingBinary;
	}

	/**
	 * Purpose: Convert Binary And Add Padding For converting 8 bit Number
	 * 
	 * @param num
	 * @return
	 */
	public static String binaryAddPadding(int num) {
		String bin[] = { "0", "1" };
		String binary = " ";
		int pading = 0;
		while ((num > 0) || (pading % 8 != 0)) {
			int rem = num % 2;
			binary = bin[rem] + binary;
			num = num / 2;
			pading++;
			if (pading % 4 == 0 && num != 0) {
				binary = " " + binary;
			}
		}
		return binary;

	}

	/**
	 * Purpose: Temperature Conversion
	 * 
	 * @param cel
	 */
	public void celTofar(double cel) { double far=(cel*(9/5))+32;
	System.out.println("\nFahrenheit : "+far);
	}
	public void farTocel(double far) 
	{
		double cel=((far-32)*(5/9));
		System.out.println("\nCelsius Temperature : "+cel);
	}

	/**
	 * Purpose: Hashing
	 * 
	 * @param words
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void hashing(String[] words) {

		HashMap<Integer, LinkedListStructure> hashmap = new HashMap<Integer, LinkedListStructure >();
		int hash = 0;
		int hasharray[]=new int[words.length];
		for(int i=0;i<words.length;i++)
		{
			hasharray[i]=Integer.parseInt(words[i]);
		}
		for(int i=0;i<hasharray.length;i++)
		{
			hash=hasharray[i]%11;
			if(hashmap.containsKey(hash))
			{

				LinkedListStructure linkedlist=hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			}
			else
			{
				hashmap.put(hash, new LinkedListStructure());
				LinkedListStructure linkedlist=hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			}
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the key to search");
		int search = scanner.nextInt();

		hash= search % 11;
		//System.out.println("New Hash:"+hash);

		if(hashmap.containsKey(hash))
		{
			//System.out.println("fddffg"+hash);

			LinkedListStructure linkedlist=hashmap.get(hash);

			if(linkedlist.search(search))
			{
				linkedlist.remove(search);
				System.out.println(search+" Element found and removed from the list");

			}
			else
			{
				linkedlist.add(search);
				System.out.println(search+"element Not found and added to the list");

			}
		}
		else
		{
			hashmap.put(hash, new LinkedListStructure());
			LinkedListStructure linkedlist=hashmap.get(hash);

			linkedlist.add(search);

		}
		Set<Integer> keys = hashmap.keySet(); 
		for(Integer key1: keys)
		{ 
			LinkedListStructure value = hashmap.get(key1);
			System.out.print(key1+"->");
			value.printlist();
			System.out.println();
		}
		scanner.close();
	}

	/**
	 * Purpose: Write in file
	 * 
	 * @param list
	 */
	public static<T> void writeFileinteger(OrderedListStructure<T> list) { 
		String string = list.toString();
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Programs/files/hashing");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(string);

			write.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	/**
	 * Purpose: Print Prime Numbers In 2D Array
	 * 
	 * @param array
	 */
	@SuppressWarnings("unchecked")
	public <T>void prime2D(ArrayList<T> array) {

		int array2D[][]=new int[10][30]; 
		int result=0;
		int i=0,j=0;
		Iterator<Integer> iterator=(Iterator<Integer>) array.iterator();
		while(iterator.hasNext())
		{
			int element=iterator.next();
			int d=element/100;
			if(d!=result)
			{
				result=d;
				i++;
				j=0;
			}
			array2D[i][j++]=element;
		}
		for(int r=0;r<array2D.length;r++)
		{
			for(int s=0;s<array2D[r].length;s++)
			{
				if(array2D[r][s]==0) {
					System.out.print(" ");
				}else
				{
					System.out.printf("%3d ",array2D[r][s]);
				}
			}
			System.out.println();
		}

	}

	/**
	 * Purpose: Print Pallindrom numbers
	 * 
	 * @param strArray
	 */
	public static void pallindrom(int[] strArray) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers That Are pallindrom: ");
		for (int i = 0; i < strArray.length; i++) 
		{
			String s=String.valueOf(strArray[i]);
			StringBuffer sb = new StringBuffer(s);
			sb=sb.reverse();
			String str=sb.toString();
			if (str.equals(s)) {
				System.out.println(str+ " ");
			}
		}

	}

	/**
	 * Purpose: Print Anagram from Stack
	 * 
	 * @param strArray
	 */
	public static void stackAnagram(int[] strArray) {
		StackStructure stack=new StackStructure();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (Utility.anagram(strArray[i]+ " ", strArray[j]+ " ")) {
					stack.push(strArray[i]);
					stack.push(strArray[j]);
				}
			}
		}
		stack.print();

	}

	/**
	 * Purpose: Print Anagram from Queue
	 * 
	 * @param strArray
	 */
	public static void queueAnagram(int[] strArray) {
		// TODO Auto-generated method stub
		QueueStructure queue=new QueueStructure();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (Utility.anagram(strArray[i]+ " ", strArray[j]+ " ")) {
					queue.insert(strArray[i]);
					queue.insert(strArray[j]);
				}
			}
		}
		queue.print();


	}


	public static int maxDay(int month,int year)
	{
		if(month==1 || month==3 || month==5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		else if(month ==4 || month == 6|| month == 9|| month ==11)
		{
			return 30;
		}
		else
		{
			if(isLeapYear(year))
			{
				return 29;
			}
			else
			{
				return 28;
			}
		}

	}

	public static void calenderWithStack(int month, int year) {
		// TODO Auto-generated method stub

		StackCalender10 week = new StackCalender10();
		int start = Utility.dayOfWeek(month,1, year);
		int maxDay = Utility.maxDay(month, year);
		int numberOfObject;
		int date = 0;
		if(maxDay + start>35)
		{
			numberOfObject = 6;
		}
		else
		{
			numberOfObject = 5; }
		for(int i = 0; i < numberOfObject;i++)
		{
			week.add(new StackCalender10());
		}
		for(int i = 0; i < numberOfObject;i++)
		{
			StackCalender10 stack =week.dataAtPosition(i);
			if(i==0)
			{
				for(int j = 0; j <start; j++)
				{
					stack.add(" ");
				}
				for(int j = start;j<7;j++)
				{
					stack.add(++date);
				}
			}
			else
			{
				for(int j = 0; j <7;j++)
				{
					stack.add(++date);
					if(date == maxDay)
					{
						break;
					}
				}	
			}
		}
		System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
		for(int i = 0; i < numberOfObject; i++)
		{
			StackCalender10 stack =  week.dataAtPosition(i);
			int length = stack.size();
			for(int j = 0; j <length; j++)
			{

				String s1 = stack.dataAtPosition(j).toString();
				System.out.print(s1);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

	@SuppressWarnings("unchecked")
	public void writeFile(File file) {
		try {
			FileWriter writer = new FileWriter(file);
			JSONObject object1 = new JSONObject();
			//input for rice
			System.out.println("Enter the name of rice: ");
			String name = scanner.next();
			System.out.println("Enter the weight of rice: ");
			double weight = scanner.nextDouble();
			System.out.println("Enter the price of rice: ");
			double price = scanner.nextDouble();
			object1.put("name", name);
			object1.put("weight", weight);
			object1.put("price", price);


			//input for pulses
			JSONObject object2 = new JSONObject();
			System.out.println("Enter the name of pulse: ");
			name = scanner.next();
			System.out.println("Enter the weight of pulse: ");
			weight =scanner.nextDouble();
			System.out.println("Enter the price of pulse: ");
			price =scanner.nextDouble();
			object2.put("name", name);
			object2.put("weight", weight);
			object2.put("price", price);
			System.out.println("Enter ");


			//input for wheats
			JSONObject object3 = new JSONObject();
			System.out.println("Enter the name of wheats: ");
			name = scanner.next();
			System.out.println("Enter the weight of wheats: ");
			weight = scanner.nextDouble();
			System.out.println("Enter the price of wheats: ");
			price =scanner.nextDouble();
			object3.put("name", name);
			object3.put("weight", weight);
			object3.put("price", price);

			JSONObject items = new JSONObject();
			items.put("rice", object1);
			items.put("pulse", object2);
			items.put("wheat", object3);

			writer.write(JSONValue.toJSONString(items));

			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("rawtypes")
	public void readFile(File file) {
		try {


			FileReader reader = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONObject object =(JSONObject) parser.parse(reader);
			Iterator iterator = object.keySet().iterator();
			while(iterator.hasNext())
			{
				String key = (String)iterator.next();
				JSONObject object1 = (JSONObject) object.get(key);
				Iterator iterator1 = object.keySet().iterator();
				while(iterator1.hasNext())
				{
					String key1 = (String)iterator1.next();

				}System.out.println();
				System.out.println("Total cost of "+object1.get("name") + " is: "
						+ Double.parseDouble(object1.get("weight").toString())
						* Double.parseDouble(object1.get("price").toString()));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	static String message="Hello <<Name>>, We have your full name as <<Full Name>> in our system. "
			+ "your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification "
			+ "Thank you BridgeLabz 01/01/2016.";
	static String fName;
	static String lName;
	static String mNumber="0";
	static String date;

	public static void firstName() 
	{
		System.out.println("Enter The First Name :");
		fName=scanner.next();


	}

	public static void fullName()
	{
		System.out.println("Enter The Last Name :");
		lName=scanner.next();


	}


	public static void mobileNumber() 
	{
		System.out.println("Enter The Mobile Number :");
		mNumber=scanner.next();
		if (!isTenDigit(mNumber)) 
		{
			System.out.println("valid");


		}else
		{
			System.out.println("Please enter 10 digit number again");
		}
	}


	public static void Date() 
	{

		Date date = new Date();
		String d = new SimpleDateFormat().format(date);
		String d1[] = d.split(" ");

		message = message.replace("01/01/2016", d1[0]);

	}
	//is ten digits validation System.out.println();
	public static boolean isTenDigit(String number)
	{
		String matcher="[0-9]";
		if((number.matches(matcher))){
			return true;

		}
		return false;
	}



	public static String RegexReplace()
	{
		String firstName="<<Name>>";
		String fullName="<<Full Name>>";
		String mobileno="xxxxxxxxxx" ;
		String Date="12/02/2018";

		//Regex to replace first Name 
		Pattern pattern = Pattern.compile(firstName);
		Matcher matcher = pattern.matcher(message);
		message=matcher.replaceAll(fName); 
		System.out.println();
		//Regex to replace full Name
		pattern = Pattern.compile(fullName);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(fName+" "+lName);

		//Regex to replace mobile number
		pattern = Pattern.compile(mobileno);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(mNumber);	
		System.out.println();
		Date date = new Date(0);
		String temp = date.toString();
		//Regex to replace Date
		pattern = Pattern.compile(Date);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(temp);
		return message;
	}

	/**
	 * Purpose: Print the Stock Report.
	 * 
	 * @param number
	 */
	@SuppressWarnings("unchecked")
	public static void stockReport(int number) { JSONArray jsonArray = new JSONArray();
	String[] array = new String[number];
	int share[] = new int[number];
	int amount[] = new int[number];
	int total[] = new int[number];
	System.out.println("Enter Company Names: ");
	int totalStock=0;
	for(int i=0; i<number; i++){

		array[i] =scanner.next();
	}


	for(int k=0; k<number; k++){
		System.out.println("Enter the number of shares for "+array[k]+" and share amount");
		share[k] = scanner.nextInt();
		amount[k] = scanner.nextInt();
	}

	for(int j=0; j<number; j++){
		total[j] = share[j]*amount[j];
	}
	System.out.println();
	System.out.println("*******************Stock Report**************************");
	System.out.println();
	System.out.println("  Company Name   Shares   Price   total of each");
	System.out.println();
	PrintWriter printWriter =null;
	try {
		printWriter = new PrintWriter("/home/bridgeit/Programs/files/stock.json");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	for(int l=0; l<number; l++)
	{
		System.out.println("  "+array[l]+"        "+share[l]+"       "+amount[l]+"     "+total[l]+"/-");	
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Company Name",array[l]);
		jsonObject.put("Shares",share[l]);
		jsonObject.put("Price",amount[l]);
		jsonObject.put("total",total[l]);
		jsonArray.add(jsonObject);

	}	

	printWriter.write(jsonArray.toJSONString());
	printWriter.flush();
	printWriter.close();
	System.out.println();
	for(int m=0; m<number; m++){

		totalStock+= share[m]*amount[m];
	}
	System.out.println("Total stock is: "+totalStock);

	}
	/**
	 * 
	 */
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void createAcc()  
	{
		File file = new File("/home/bridgeit/Programs/files/stock.json");
		if(file.exists())
		{
			@SuppressWarnings("unused")
			JSONArray arr = new JSONArray();
			Scanner scan1 = new Scanner(System.in);
			boolean check= true;
			while (check==true)
			{	
				System.out.println("Want to add user: y or n");
				char ch = scan1.next().charAt(0); 
				if(ch=='y')
				{	
					Scanner scan = new Scanner(System.in);
					 
					try {
						FileReader fr = new FileReader(file);
					
					JSONParser parser = new JSONParser();
					JSONArray arr1 = (JSONArray) parser.parse(fr);
					JSONObject json = new JSONObject();
			        System.out.println("Enter name");
			        String name = scan.nextLine();
			        System.out.println("Enter balance");
			        int bal = scan.nextInt();
			        json.put("Name",name);
			        json.put("Balance",bal);
			        json.put("ShareCount", 100);
			    
			        arr1.add(json);
			      	FileWriter fw = new FileWriter(file);
			        fw.write(JSONArray.toJSONString(arr1));
			        fw.flush();
			        fw.close();
		
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else
				{
					check=false;
				}
			}
			
		}
		else
		{
			System.out.println("File does not exits");
		}
	}
	

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void buyShare()  {
		File file = new File("/home/bridgeit/Programs/files/stock.json");
		File file1 = new File("/home/bridgeit/Programs/files/stock1.json");
		if (file.exists() && file1.exists()) {
			Scanner scan = new Scanner(System.in);
			// reading stock file
			
			try {
				FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fr);
			// reading stock1 file

			FileReader sf = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(sf);

			System.out.println("Enter the user");
			String name = scan.nextLine();
			Iterator<?> itr = stock.iterator();
			Iterator<?> itr1 = share.iterator();
			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject obj = (JSONObject) itr.next();
				if (obj.get("Name").equals(name)) {
					System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
					String sym = scan.nextLine();
					/*
					 * obj.put("Share symbol", sym); if(obj.get("Share Symbol").equals(sym)) {
					 */
					while (itr1.hasNext()) {
						JSONObject obj1 = (JSONObject) itr1.next();
						if (obj1.get("Symbol").equals(sym)) {
							System.out.println("Enter the amount");
							int amt = scan.nextInt();
							int bal = Integer.parseInt(obj.get("Balance").toString());
							int price = Integer.parseInt(obj1.get("Price").toString());
							int noShare = Integer.parseInt(obj.get("ShareCount").toString());
							int stockShare = Integer.parseInt(obj1.get("Count").toString());
							int numofshare = amt / price;
							int newbal = bal - amt;
							int sharecountcus = noShare + numofshare;
							int sharecountstock = stockShare - numofshare;
							obj.remove("Balance");
							obj.remove("ShareCount");
							obj1.remove("Count");

							obj.put("Balance", newbal);
							obj.put("ShareCount", sharecountcus);
							obj1.put("Count", sharecountstock);
							Date d = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
							System.out.println("Date " + date);
							flag = true;
							break;
						}
					}
					
				}
				FileWriter fs = new FileWriter(file);
				fs.write(JSONValue.toJSONString(stock));
				fs.flush();
				fs.close();
			}
			if (flag == false) {
				System.out.println("User name not exits");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			System.out.println("File does not exits");
		}
		
	}
	
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void saleShare() 
	{
		
		File file = new File("/home/bridgeit/Programs/files/stock.json");
		File file1 =new File("/home/bridgeit/Programs/files/stock1.json");
		if(file.exists() && file1.exists())
		{
			Scanner scan = new Scanner(System.in);
			// reading stock file
			FileReader fr;
			try {
				fr = new FileReader(file);
			
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fr);
			//reading share file
			
			FileReader sf = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(sf);
			
			System.out.println("Enter the user");
			String name = scan.nextLine();
			Iterator<?> itr = stock.iterator();
			Iterator<?> itr1 = share.iterator();
			boolean flag = false;
			while (itr.hasNext())
			{
				JSONObject obj=(JSONObject) itr.next();
				if(obj.get("Name").equals(name))
				{
					System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
					String sym = scan.nextLine();
					System.out.println("Enter the number of share to sale");
					int count= scan.nextInt();
					//obj.put("Share Symbol", sym);
					while(itr1.hasNext())
					{
						JSONObject obj1 = (JSONObject) itr1.next();
						if(obj1.get("Symbol").equals(sym))
						{	
							int bal =  Integer.parseInt(obj.get("Balance").toString());
							int price = Integer.parseInt(obj1.get("Price").toString());
							int noShare =  Integer.parseInt(obj.get("ShareCount").toString());
							int stockShare = Integer.parseInt(obj1.get("Count").toString());
							int saleprize = count*price;
							int newbal = bal+saleprize;
							int sharecountcus = noShare-count;
							int sharecountstock = stockShare+count;
							obj.remove("Balance");
							obj.remove("ShareCount");
							obj1.remove("Count");
							
							obj.put("Balance",newbal);
							obj.put("ShareCount",sharecountcus);
							obj1.put("Count", sharecountstock);
							Date d = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
							System.out.println("Date "+date);
							flag = true;
							break;
						}
						
					}
				}

				FileWriter fs = new FileWriter(file);
				try {
					fs.write(JSONValue.toJSONString(stock));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fs.flush();
				fs.close();
			}
			if(flag == false)
			{
				System.out.println("User name not exits");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		else
		{
			System.out.println("File Does not exits");
		}
	}
		
	
	/**
	 * 
	 */
	public static <E> void display() {
		File file = new File("/home/bridgeit/Programs/files/stock.json");

		try {
			FileReader fr = new FileReader(file);

			JSONParser parser = new JSONParser();
			JSONArray arr1 = (JSONArray) parser.parse(fr);
			@SuppressWarnings("unchecked")
			Iterator <E>itr = arr1.iterator();
			while (itr.hasNext())
			{
				JSONObject obj = (JSONObject) itr.next();
				System.out.println(obj);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

 /**
 * @param suits
 * @param ranks
 */
   public void deckOfCards(String[] suits, String[] ranks) {
		int lengthOfCards = suits.length * ranks.length;
		String deck[] = new String[lengthOfCards];
		for (int i = 0; i < ranks.length; i++) 
		{
			for (int j = 0; j < suits.length; j++) 
			{
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
			}
		}

		for (int i = 0; i < lengthOfCards; i++)
		{
			int r = i + (int) (Math.random() * (lengthOfCards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		String arr[][] = new String[suits.length][9];
		for (int i = 0; i < suits.length ; i++)
		{
			System.out.println("**********Player " + (i + 1)+"**********");
			System.out.println();
			for (int j = 0; j < 9; j++)
			{
				arr[i][j] = deck[i + j];
				System.out.println("    "+arr[i][j] + ", ");
			}
			System.out.println();
		}
		
	}

public void deckOfCardsInQueue(String[] suits, String[] ranks) {
	QueueStructure cardQueue = new QueueStructure();
	int lengthOfCards = suits.length * ranks.length;
	String[] deck = new String[lengthOfCards];
	for (int i = 0; i < ranks.length; i++) {
		for (int j = 0; j < suits.length; j++) {
			deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
		}
	}
	for (int i = 0; i < lengthOfCards; i++) {
		int r = i + (int) (Math.random() * (lengthOfCards-i));
		String temp = deck[r];
		deck[r] = deck[i];
		deck[i] = temp;
	}
	String arr[][]=new String[suits.length][9];
	for(int i=0; i<suits.length; i++)
	{
		//  System.out.println("Player "+(i+1));
		for(int j=0; j<9; j++)
		{
			arr[i][j]=deck[i+j];
			cardQueue.push(arr[i][j]);
		}
		
		System.out.println();
	}	
	
}

public void editDetails() {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				Scanner scan = new Scanner(System.in);
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				Iterator<?> itr = array.iterator();
				System.out.println("Enter the person name to edit details");
				String name = scan.nextLine();
				boolean flag = false;
				while (itr.hasNext()) {
					JSONObject obj = (JSONObject) itr.next();
					if (obj.get("firstname").equals(name)) {
						System.out.println("What you want to edit");
						String edit = scan.nextLine();
						System.out.println("Enter the new " + edit + " to update.");
						String change = scan.nextLine();
						obj.remove(edit);
						obj.put(edit, change);
						System.out.println("Edited Successfully.");
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("Person not found");
				}
				FileWriter fw = new FileWriter(file);

				fw.write(JSONArray.toJSONString(array));

				fw.flush();
				fw.close();

			} else {
				System.out.println("File can not edit");
			}
		} else {
			System.out.println("File Does not exits");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void sort() {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				Scanner scan = new Scanner(System.in);
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				System.out.println("Enter column name to sort book");
				String str = scan.nextLine();
				//Sort sort=new Sort();
				Collections.sort(array, new Sort(str));
				Iterator<?> itr = array.iterator();
				while (itr.hasNext()) {
					JSONObject obj1 = (JSONObject) itr.next();
					System.out.println("firstname : " + obj1.get("firstname") + " " + "lastname : "
							+ obj1.get("lastname") + " " + "address: " + obj1.get("address") + " " + "city : "
							+ obj1.get("city") + " " + "state : " + obj1.get("state") + " " + "zip: "
							+ obj1.get("zip") + " " + "mobile: " + obj1.get("mobile"));
				}
				FileWriter fw = new FileWriter(file);
				fw.write(JSONArray.toJSONString(array));
				fw.flush();
				fw.close();

			} else {
				System.out.println("File can not edit");
			}
		} else {
			System.out.println("File Does not exits");
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void deletePerson() throws IOException, ParseException {
	try {
		Scanner scan = new Scanner(System.in);
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead()) {
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				System.out.println("Enter the user");
				String name = scan.nextLine();
				Iterator<?> iterator = array.iterator();
				boolean flag = false;
				while (iterator.hasNext()) {
					JSONObject jsonObject = (JSONObject) iterator.next();

					if (jsonObject.get("firstname").equals(name)) {
						array.remove(jsonObject);
						System.out.println("Deleted Successfully.");
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("User not found.");
				}
				if (file.canWrite()) {
					FileWriter fw = new FileWriter(file);
					fw.write(JSONArray.toJSONString(array));
					fw.flush();
					fw.close();
				} else {
					System.out.println("File does not haveedit permission");
				}

			} else {
				System.out.println("File can't read");
			}
		} else {
			System.out.println("File does not exits in disk.");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

@SuppressWarnings("unchecked")
public void addPerson() throws IOException, ParseException {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {

			if (file.canRead() && file.canWrite()) {
				Scanner scan = new Scanner(System.in);
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				JSONObject json = new JSONObject();
				System.out.println("Enter First Name:");
				String firstname = scan.nextLine();
				System.out.println("Enter Last Name:");
				String lastname = scan.nextLine();
				System.out.println("Enter Address:");
				String address = scan.nextLine();
				System.out.println("Enter City:");
				String city = scan.nextLine();
				System.out.println("Enter State:");
				String state = scan.nextLine();
				System.out.println("Enter ZIP:");
				String zip = scan.nextLine();
				System.out.println("Enter Mobile Number:");
				String mobile = scan.nextLine();

				json.put("firstname", firstname);
				json.put("lastname", lastname);
				json.put("address", address);
				json.put("city", city);
				json.put("state", state);
				json.put("zip", zip);
				json.put("mobile", mobile);
				array.add(json);
				System.out.println("Added Successfully.");
				FileWriter fw = new FileWriter(file);
				fw.write(JSONArray.toJSONString(array));
				fw.flush();
				fw.close();

			}

			else {
				System.out.println("File can't read and write");
			}
		} else {
			System.out.println("File not exits on disk.");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void displayDetails() throws IOException, ParseException {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				Iterator itr = array.iterator();
				while (itr.hasNext()) {
					JSONObject obj = (JSONObject) itr.next();
					System.out.println("firstname : " + obj.get("firstname") + " " + "lastname : "
							+ obj.get("lastname") + " " + "address: " + obj.get("address") + " " + "city : "
							+ obj.get("city") + " " + "state : " + obj.get("state") + " " + "zip: " + obj.get("zip")
							+ " " + "mobile: " + obj.get("mobile"));

				}
			} else {
				System.out.println("File can't have read permissions.");
			}
		} else {
			System.out.println("File does not exits on disk.");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void fixAppointment()
{
	try
	{
	
		Scanner scan = new Scanner(System.in);
		File file = new File ("/home/bridgeit/Programs/files/doctor.json");
		File file1 = new File ("/home/bridgeit/Programs/files/patient.json");
		if(file.exists() && file.exists())
		{
			if(file.canWrite() && file.canRead() && file1.canWrite() && file1.canRead())
			{
				JSONParser parser = new JSONParser();
				FileReader doctor = new FileReader(file);
				JSONArray docArray = (JSONArray) parser.parse(doctor);

				FileReader patient = new FileReader(file1);
				JSONArray patArray = (JSONArray) parser.parse(patient);

				Iterator<?> iterator = patArray.iterator();
				System.out.println("Enter the Patient id to get appointment");
				String pid = scan.nextLine();
				boolean flag=false;
				while (iterator.hasNext())
				{
					JSONObject object = (JSONObject) iterator.next();
					String key = object.get("Id").toString();
					if (pid.equals(key))
					{
						System.out.println("Enter the doctor id to assign patient");
						String did = scan.nextLine();
						Iterator<?> iterator1 = docArray.iterator();

						while (iterator1.hasNext())
						{
							JSONObject object1 = (JSONObject) iterator1.next();
							String key1 = object1.get("Id").toString();
							if (key1.equals(did))
							{
								JSONArray arr = (JSONArray) object1.get("Patient");

								if (arr.size()==2)
								{
									System.out.println("Doctor appointment is full ... Take appointment next day.");
									break;
								}
								else
								{
									arr.add(object);
									FileWriter write = new FileWriter(file);
									write.write(JSONValue.toJSONString(docArray));
									write.flush();
									write.close();
									flag = true;
									break;
								}
							}
						}
						break;
					}
				}
				if(flag==false)
				{
					System.out.println("Wrong user id");
				}
			}
			else
			{
				System.out.println("File can not read or write");
			}
		}
		else
		{
			System.out.println("File Not exits in disk.");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void patientDetails() 
{
	try
	{
		File file = new File("/home/bridgeit/Programs/files/patient.json");
		if(file.exists())
		{
			if(file.canRead() && file.canWrite())
			{
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				Iterator<?> itr = array.iterator();
				
				while (itr.hasNext())
				{
					JSONObject obj = (JSONObject) itr.next();
					
						System.out.println("Name : "+obj.get("Name")+"\tID : "+obj.get("Id")+"\tAge : "+obj.get("Age")+"\tMob: "+obj.get("Mob"));
					
				}
			}
			else
			{
				System.out.println("File can't have read permissions.");
			}
		}
		else
		{
			System.out.println("File does not exits on disk.");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}


@SuppressWarnings("unchecked")
public static void addPatient() 
{
	try
	{
		Scanner scan = new Scanner(System.in);
		File file = new File("/home/bridgeit/Programs/files/patient.json");
		if(file.exists())
		{
			if(file.canRead() && file.canWrite())
			{
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				JSONObject json = new JSONObject();
		        System.out.println("Enter Patient Name:");
		        String name = scan.nextLine();
		        System.out.println("Enter Id No:");
		        String id = scan.nextLine();
		        System.out.println("Enter Mobile number:");
		        String mob = scan.nextLine();
		        System.out.println("Enter age:");
		        String age = scan.nextLine();
		        Iterator<?> itr = array.iterator();
				
				while (itr.hasNext())
				{
					JSONObject obj = (JSONObject) itr.next();
					String key = obj.get("Id").toString();
					if(key.equals(id))
					{
						System.out.println("The id Number "+id+" is already assingn to other patient plz enter different id number");
						System.out.println("Enter Id No:");
						id = scan.nextLine();
					}
					
				}
		        json.put("Name",name);
		        json.put("Id", id);
		        json.put("Mob", mob);
		        json.put("Age", age);
		        
		        array.add(json);
		        System.out.println("Added Successfully.");
		        FileWriter fw = new FileWriter(file);
		        fw.write(JSONArray.toJSONString(array));
		        fw.flush();
		        fw.close();
				
			}
			else
			{
				System.out.println("File can't have read permissions.");
			}
		}
		else
		{
			System.out.println("File does not exits on disk.");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}


public static void doctorsDetails() 
{
	try
	{
		Scanner scan = new Scanner(System.in);
		File file = new File("/home/bridgeit/Programs/files/doctor.json");
		if(file.exists())
		{
			if(file.canRead() && file.canWrite())
			{
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				Iterator <?>itr = array.iterator();
				
				while (itr.hasNext())
				{
					JSONObject obj = (JSONObject) itr.next();
					System.out.println("Name : "+obj.get("Name")+"\tID : "+obj.get("Id")+"\tSpecialization : "+obj.get("Specialization")+"\t\tAvailability : "+obj.get("Availability"));
		
				}
			}
			else
			{
				System.out.println("File can't have read permissions.");
			}
		}
		else
		{
			System.out.println("File does not exits on disk.");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}


@SuppressWarnings("unchecked")
public static void addDoctor() 
{
	try
	{
		File file = new File("/home/bridgeit/Programs/files/doctor.json");
		if(file.exists())
		{
			
			if(file.canRead() && file.canWrite())
			{
				Scanner scan = new Scanner(System.in);
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fr);
				JSONObject json = new JSONObject();
		        System.out.println("Enter Doctor Name:");
		        String name = scan.nextLine();
		        System.out.println("Enter Id No:");
		        String id = scan.nextLine();
		        System.out.println("Enter Specialization:");
		        String specialization = scan.nextLine();
		        System.out.println("Enter Availability:");
		        String availability = scan.nextLine();
		        Iterator<?> itr = array.iterator();
		    	while (itr.hasNext())
				{
					JSONObject obj = (JSONObject) itr.next();
					String key = obj.get("Id").toString();
					if(key.equals(id))
					{
						System.out.println("The id Number "+id+" is already assingn to other Dcotor plz enter different id number");
						System.out.println("Enter Id No:");
						id = scan.nextLine();
					}
					
				}
		        json.put("Name",name);
		        json.put("Id", id);
		        json.put("Specialization", specialization);
		        json.put("Availability", availability);
		        
		        array.add(json);
		        System.out.println("Added Successfully.");
		        FileWriter fw = new FileWriter(file);
		        fw.write(JSONArray.toJSONString(array));
		        fw.flush();
		        fw.close();
			}
		
			else
			{
				System.out.println("File can't read and write");
			}
		}
		else
		{
			System.out.println("File not exits on disk.");
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

public void appointmentDetails() 
{
	try
	{
		Scanner scan = new Scanner(System.in);
		File file = new File ("/home/bridgeit/Programs/files/doctor.json");
		if(file.exists() && file.exists())
		{
			if(file.canWrite() && file.canRead())
			{
				JSONParser parser = new JSONParser();
				FileReader doctor = new FileReader(file);
				JSONArray docArray = (JSONArray) parser.parse(doctor);
				Iterator<?> iterator = docArray.iterator();
				System.out.println("Enter Doctor id to view appintment");
				String id = scan.next();
				boolean flag = false;
				while (iterator.hasNext())
				{
					JSONObject obj = (JSONObject) iterator.next();
					String id1 = obj.get("Id").toString();
					if(id1.equals(id))
					{
						JSONArray patient1 =(JSONArray) obj.get("Patient");
						Iterator<?> itr = patient1.iterator();
						while(itr.hasNext())
						{
							JSONObject patient = (JSONObject) itr.next();
							System.out.println("Name : "+patient.get("Name")+"\tID : "+patient.get("Id")+ "\tAge : "+patient.get("Age")+"\tMob : "+patient.get("Mob"));
							flag=true;
						}
					}
				}
				if(flag==false)
				{
					System.out.println("Wrong Doctor id...Plz Try again");
				}
			}
			else
			{
				System.out.println("File can not read or write");
			}
		}
		else
		{
			System.out.println("File Not exits in disk.");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

/**
 * @param array
 * @return its a generic method for insertion sorting and it give the sorted
 *         array and sorted string
 */
public <T extends Comparable<T>> T[] insertionSortString(T[] array) {
	for (int i = 1; i < array.length; i++) {
		for (int j = i; j > 0; j--) {
			if ((array[j - 1]).compareTo(array[j]) > 0) {
				T temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
	}
	return array;
}
/**
 * @param array
 * @return its a generic method for bubble sorting and it give the sorted array
 *         and sorted string
 */
public static <T extends Comparable<T>> T[] bubbleSortInt(T[] array) {
	for (int i = 1; i < array.length; i++) {
		for (int j = 0; j < array.length - i; j++) {
			if (array[j].compareTo(array[j + 1]) > 0) {
				T temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
	}
	return array;

}

/**
 * @param array
 * @param num
 * @return generic binary search
 */
public <T extends Comparable<T>> T[] binarySearchInt(T[] array, T num) {
	int size = array.length;

	int start, end, mid, count = 0;

	start = 0;
	end = size - 1;

	while (start <= end) {
		mid = (start + end) / 2;
		if (num.compareTo(array[mid]) == 0) {
			System.out.println("Search found at position :" + (mid + 1));
			count++;
			break;
		}
		if (num.compareTo(array[mid]) < 0)
			end = mid - 1;
		else
			start = mid + 1;
	}
	if (count == 0)
		System.out.println("Search not found");
	return array;

}

public static <T> void print(T[] array, int number) {
	for (int j = 0; j < number; j++) {
		System.out.print(array[j] + " ");
	}
}
}

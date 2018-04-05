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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.DataStructure.BankingQueueStructure;
import com.bridgeit.DataStructure.LinkedListStructure;
import com.bridgeit.DataStructure.OrderedListStructure;
import com.bridgeit.DataStructure.QueueStructure;
import com.bridgeit.DataStructure.StackCalender;
import com.bridgeit.DataStructure.StackStructure;
import com.bridgeit.DataStructure.palindromeDequeueStructure;
import com.bridgeit.ObjectOriented.Stack;

import java.util.Date;
import java.util.regex.Matcher;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
public class Utility {

	static Scanner scanner = new Scanner(System.in);


	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	public static String inputString()
	{
		try
		{
			return scanner.next();
		}
		catch(Exception e)
		{
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
	public static long inputDouble() {
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
	 * Purpose:Print Win Percentage
	 * 
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void grambler(int stake, int goal, int trials) {
		//int lbets = 0;
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
	 * @param temprature
	 * @param speed
	 * @param windChill
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

		 String string3 = string1.replaceAll("\\s", "");
	     String string4 = string2.replaceAll("\\s", "");
		for (int i=0;i<string3.length();i++)
	
		
		if(string3.length() != string4.length()){
			status = false;
		} else {
			char [] ArrayS1 = string3.toLowerCase().toCharArray(); 
			Arrays.sort(ArrayS1);
			char ArrayS2[] = string4.toLowerCase().toCharArray(); 
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
			for (int j = i + 1; j < n ; j++) {
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
		String input = null;
		System.out.println("Is your number:" + middle);
        System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input = inputString();
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
				input = inputString();
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
	// merge sort method
		/**
		 * @param array
		 * @param low
		 * @param high
		 *           
		 */
		public static void sort(int array[], int low, int high) {
			if (low < high) {

				int middle = (low + high) / 2;

				sort(array, low, middle);
				sort(array, middle + 1, high);

				merge(array, low, middle, high);
			}
		}

		/**
		 * @param array
		 * @param low
		 * @param middle
		 * @param high
		 *            
		 */
		public static void merge(int array[], int low, int middle, int high) {

			int n1 = middle - low + 1;
			int n2 = high - middle;

			int array1[] = new int[n1];
			int array2[] = new int[n2];

			for (int i = 0; i < n1; ++i)
				array1[i] = array[low + i];
			for (int j = 0; j < n2; ++j)
				array2[j] = array[middle + 1 + j];

			int i = 0, j = 0;

			int k = low;
			while (i < n1 && j < n2) {
				if (array1[i] <= array2[j]) {
					array[k] = array1[i];
					i++;
				} else {
					array[k] = array2[j];
					j++;
				}
				k++;
			}

			while (i < n1) {
				array[k] = array1[i];
				i++;
				k++;
			}

			while (j < n2) {
				array[k] = array2[j];
				j++;
				k++;
			}
		}



	/**
	 * Purpose:Print Monthly Payment
	 * 
	 * @param principal
	 * @param rate
	 * @param year
	 */
	@SuppressWarnings("unused")
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
		//int count = 0;
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
	static double balance = 1000;

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
	public void celTofar(double cel) {
	double far=(cel*(9.0/5))+32;
	System.out.println("\nFahrenheit : "+far);
	}
	public void farTocel(double far) 
	{
		double cel=((far-32)*(5.0/9));
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
		int hash = -1;
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
		System.out.println("Enter the key to search");
		int search = inputInteger();
        hash= search % 11;
		if(hashmap.containsKey(hash))
		{
			LinkedListStructure linkedlist=hashmap.get(hash);
			if(linkedlist.search(search))
			{
				
				linkedlist.remove(search);
				Utility.writeFileinteger(hashmap);

				System.out.println(search+" Element found and removed from the list");
				
			}
			else
			{
				linkedlist.add(search);
				System.out.println(search+"element Not found and added to the list");
				Utility.writeFileinteger(hashmap);
			}
		}
		else
		{
			hashmap.put(hash, new LinkedListStructure());
			LinkedListStructure linkedlist=hashmap.get(hash);
			linkedlist.add(search);
			/*hashmap.put(hash, new LinkedListStructure());
			LinkedListStructure linkedlist=hashmap.get(hash);
			if(!linkedlist.search(search))
			{
				linkedlist.add(search);	
			}	 
			
			Utility.writeFileinteger(hashmap);
			System.out.println("Element Added");
*/
		}
		Set<Integer> keys = hashmap.keySet(); 
		for(Integer key1: keys)
		{ 
			LinkedListStructure value = hashmap.get(key1);
			System.out.print(key1+"->");
			value.printlist();
			System.out.println();
		}
		
	}

	/**
	 * Purpose: Write in file
	 * 
	 * @param search
	 */
	public static<T> void writeFileinteger(T search) { 
		String string = search.toString();
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Programs/files/writehashing");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(string);

			write.close();
			
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
					System.out.printf("%4d ",array2D[r][s]);
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
		QueueStructure<Integer> queue=new QueueStructure<Integer>();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (anagram(strArray[i]+ " ", strArray[j]+ " ")) {
					queue.insert(strArray[i]);
					queue.insert(strArray[j]);
				}
			}
		}
		queue.print();


	}


	/**
	 * Purpose:Print Max Days
	 * 
	 * @param month
	 * @param year
	 * @return
	 */
	public static int maxDay(int month,int year) {
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

	/**
	 * Purpose:Print Calendar Using Stack
	 * 
	 * @param month
	 * @param year
	 */
	@SuppressWarnings("rawtypes")
	public static void calenderWithStack(int month, int year) {
		StackCalender week = new StackCalender();
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
			week.add(new StackCalender());
		}
		for(int i = 0; i < numberOfObject;i++)
		{
			StackCalender stack =(StackCalender) week.dataAtPosition(i);
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
			StackCalender stack =  (StackCalender) week.dataAtPosition(i);
			int length = stack.size();
			for(int j = 0; j <length; j++)
			{

				String string = stack.dataAtPosition(j).toString();
				System.out.print(string);
				System.out.print("\t");
			}
			System.out.println();
		}

	}
	
	
	/**
	 * @throws IOException
	 * @throws ParseException
	 */
	static String file1="/home/bridgeit/Programs/files/dataManagement.json";
	static JSONArray jsonArray=new JSONArray();
	static JSONObject jsonObject=new JSONObject();
	
	public static void writefile() throws IOException, ParseException 
	{
		FileReader fileReader = new FileReader(file1);
		BufferedReader bufferReader = new BufferedReader(fileReader);

		if (bufferReader.readLine() == null) {
			addInventoryObject(jsonArray);
		} else {
			jsonArray = getCurrentInventoryObject();
			addInventoryObject(jsonArray);
		}
      
		bufferReader.close();
		
	}

	/**
	 * @param jsonInventoryArray
	 */
	private static void addInventoryObject(JSONArray jsonInventoryArray) 
	{
		
		System.out.print("Enter the Number that you are want to store Inventory :");
		int number = inputInteger();
		String array[] = new String[number];

		for (int i = 0; i < array.length; i++) {
			System.out.print(+ (i + 1) + ".Enter the Inventory name : ");
			array[i] = inputString();
		}

		for (String name : array) {
			System.out.print("Enter the number of types for " + name + " : ");
			int count = inputInteger();
			for (int p = 0; p < count; p++) {
				JSONObject jsonObject = new JSONObject();
				System.out.print("Enter Name of " + name + " : ");
				String value = inputString();
				jsonObject.put("name", value);
				System.out.print("Enter Weight of " + name + "     : ");
				double weight = inputDouble();
				jsonObject.put("weight",weight);
				System.out.print("Enter Price of " + name + "      : ");
				double price = inputDouble();
				jsonObject.put("price",price);
				jsonObject.put("total",weight * price);
				jsonInventoryArray.add(jsonObject);
			}
			
		}

		jsonObject.put("Inventory_Data", jsonInventoryArray);

		PrintWriter printWriter = null;

		try {
			printWriter = new PrintWriter(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printWriter.write(jsonObject.toJSONString());
		printWriter.close();
	
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	private static JSONArray getCurrentInventoryObject() throws FileNotFoundException, IOException, ParseException 
	{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file1));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Inventory_Data");
		return jsonArray;
	}
	
	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void dataManagement() throws FileNotFoundException, IOException, ParseException {

		double totalAmount = 0;
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file1));
		JSONObject outer = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) outer.get("Inventory_Data");
		JSONObject compareObj;
		String name = "", price = "", total = "", weight = "";
		System.out.println();
		
		System.out.println("Inventory_Name | Inventory_Weight  | Inventory_Price | Inventory_Total");

		for (int i = 0; i < jsonArray.size(); i++) {
			compareObj = (JSONObject) jsonArray.get(i);
			name = (String) compareObj.get("name");
			weight =  compareObj.get("weight").toString();
			price = compareObj.get("price").toString();
			total =  compareObj.get("total").toString();
			totalAmount += Double.valueOf(total);
			System.out.printf("  %10s %10s %30s %10s ", name, weight, price, total);
			System.out.println();
		}
		System.out.println(" Total Amount in the Inventory  : " + totalAmount);

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
		fName=inputString();

	}

	public static void fullName()
	{
		System.out.println("Enter The Last Name :");
		lName=inputString();


	}
	public static void mobileNumber() 
	{
		System.out.println("Enter The Mobile Number :");
		mNumber=inputString();
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
	/**
	 * @return: Updated String
	 * 
	 */
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
		share[k] = inputInteger();
		amount[k] = inputInteger();
	}

	for(int j=0; j<number; j++){
		total[j] = share[j]*amount[j];
	}
	System.out.println();
	System.out.println("*************Stock Report****************");
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
	 * Purpose: Create Account
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void createAcc()  
	{
		File file = new File("/home/bridgeit/Programs/files/stock.json");
		if(file.exists())
		{
			@SuppressWarnings("unused")
			JSONArray array = new JSONArray();
			boolean check= true;
			while (check==true)
			{	
				System.out.println("Want to add user: y or n");
				char choice = scanner.next().charAt(0); 
				if(choice=='y')
				{	
					try {
						FileReader fileReader = new FileReader(file);
					
					JSONParser jsonparser = new JSONParser();
					JSONArray jsonArray = (JSONArray) jsonparser.parse(fileReader);
					JSONObject jsonObject = new JSONObject();
			        System.out.println("Enter name");
			        String name = inputString();
			        System.out.println("Enter balance");
			        int balance = inputInteger();
			        jsonObject.put("Name",name);
			        jsonObject.put("Balance",balance);
			        jsonObject.put("ShareCount", 100);
			    
			        jsonArray.add(jsonObject);
			      	FileWriter fileWriter = new FileWriter(file);
			      	fileWriter.write(JSONArray.toJSONString(jsonArray));
			      	fileWriter.flush();
			      	fileWriter.close();
		
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
	 * Purpose: Buy Share
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void buyShare()  {
		String file ="/home/bridgeit/Programs/files/stock.json";
		String file1 = "/home/bridgeit/Programs/files/stock1.json";
		if (file.contains(file) && file1.contains(file1)) {
			// reading stock file
			
			try {
				FileReader fileReader = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stockArray = (JSONArray) parser.parse(fileReader);
			// reading stock1 file

			FileReader fileReader1 = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray shareArray = (JSONArray) parser1.parse(fileReader1);

			System.out.println("Enter the user");
			String name =inputString();
			Iterator<?> iterator = stockArray.iterator();
			Iterator<?> iterator1 = shareArray.iterator();
			boolean flag = false;
			while (iterator.hasNext()) {
				JSONObject jsonObject = (JSONObject) iterator.next();
				if (jsonObject.get("Name").equals(name)) {
					System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
					String symbol = inputString();
					/*
					 * obj.put("Share symbol", sym); if(obj.get("Share Symbol").equals(sym)) {
					 */
					while (iterator1.hasNext()) {
						JSONObject jsonObject1 = (JSONObject) iterator1.next();
						if (jsonObject1.get("Symbol").equals(symbol)) {
							System.out.println("Enter the amount");
							int amount = inputInteger();
							int balance = Integer.parseInt(jsonObject.get("Balance").toString());
							int price = Integer.parseInt(jsonObject1.get("Price").toString());
							int noOfShare = Integer.parseInt(jsonObject.get("ShareCount").toString());
							int stockShare = Integer.parseInt(jsonObject1.get("Count").toString());
							int numofshare = amount / price;
							int newbalance = balance - amount;
							int sharecountcus = noOfShare + numofshare;
							int sharecountstock = stockShare - numofshare;
							jsonObject.remove("Balance");
							jsonObject.remove("ShareCount");
							jsonObject1.remove("Count");

							jsonObject.put("Balance", newbalance);
							jsonObject.put("ShareCount", sharecountcus);
							jsonObject1.put("Count", sharecountstock);
							Date date1 = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(date1);
							System.out.println("Date " + date);
							flag = true;
							break;
						}
					}
					
				}
				FileWriter filewritwer = new FileWriter(file);
				filewritwer.write(JSONValue.toJSONString(stockArray));
				filewritwer.flush();
				filewritwer.close();
			}
			if (flag == false) {
				System.out.println("User name not exits");
			}
			FileWriter filewritwer1 = new FileWriter(file1);
			filewritwer1.write(JSONValue.toJSONString(shareArray));
			filewritwer1.flush();
			filewritwer1.close();
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
	 * Purpose: Sales Share
	 * 
	 */
	
	public static void saleShare() 
	{
		
		File file = new File("/home/bridgeit/Programs/files/stock.json");
		File file1 =new File("/home/bridgeit/Programs/files/stock1.json");
		if(file.exists() && file1.exists())
		{
			// reading stock file
			FileReader fileread;
			try {
				fileread = new FileReader(file);
			
			JSONParser parser = new JSONParser();
			JSONArray stockArray = (JSONArray) parser.parse(fileread);
			//reading stock1 file
			
			FileReader fileread1 = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray shareArray = (JSONArray) parser1.parse(fileread1);
			
			System.out.println("Enter the user name to share sale");
			String name = inputString();
			Iterator<?> iterator = stockArray.iterator();
			Iterator<?> iterator1 = shareArray.iterator();
			boolean flag = false;
			while (iterator.hasNext())
			{
				JSONObject jsonObject=(JSONObject) iterator.next();
				if(jsonObject.get("Name").equals(name))
				{
					System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
					String symbol = inputString();
					System.out.println("Enter the number of share to sale");
					int count= inputInteger();
					//obj.put("Share Symbol", sym);
					while(iterator1.hasNext())
					{
						JSONObject jsonObject1 = (JSONObject) iterator1.next();
						if(jsonObject1.get("Symbol").equals(symbol))
						{	
							int balance =  Integer.parseInt(jsonObject.get("Balance").toString());
							int price = Integer.parseInt(jsonObject1.get("Price").toString());
							int noOfShare =  Integer.parseInt(jsonObject.get("ShareCount").toString());
							int stockShare = Integer.parseInt(jsonObject1.get("Count").toString());
							int saleprize = count*price;
							int newBalance = balance+saleprize;
							int sharecountcus = noOfShare-count;
							int sharecountstock = stockShare+count;
							jsonObject.remove("Balance");
							jsonObject.remove("ShareCount");
							jsonObject1.remove("Count");
							
							jsonObject.put("Balance",newBalance);
							jsonObject.put("ShareCount",sharecountcus);
							jsonObject1.put("Count", sharecountstock);
							Date date1 = new Date();
							String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(date1);
							System.out.println("Date "+date);
							flag = true;
							break;
						}
						
					}
				}

				FileWriter filewrite = new FileWriter(file);
				try {
					filewrite.write(JSONValue.toJSONString(stockArray));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				filewrite.flush();
				filewrite.close();
			}
			if(flag == false)
			{
				System.out.println("User name not exits");
			}
			FileWriter fileWriter = new FileWriter(file1);
			fileWriter.write(JSONValue.toJSONString(shareArray));
			fileWriter.flush();
			fileWriter.close();
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
	 * Purpose: Display Details
	 * 
	 */
	public static <E> void display() {
		File file = new File("/home/bridgeit/Programs/files/stock.json");

		try {
			FileReader filereader = new FileReader(file);

			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(filereader);
			Iterator <E>iterator = array.iterator();
			while (iterator.hasNext())
			{
				JSONObject jsonObject = (JSONObject) iterator.next();
				System.out.println(jsonObject);
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
 * 
 * @param suits
 * @param ranks
 */
@SuppressWarnings("rawtypes")
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
		int shuffle = i + (int) (Math.random() * (lengthOfCards-i));
		String temp = deck[shuffle];
		deck[shuffle] = deck[i];
		deck[i] = temp;
	}
	String array[][]=new String[suits.length][9];
	for(int i=0; i<suits.length; i++)
	{
		 System.out.println("***Player*** "+(i+1));
		for(int j=0; j<9; j++)
		{
			array[i][j]=deck[i+j];
			cardQueue.push(array[i][j]);
		}
		
		System.out.println();
	}	
	
}

/**
 * Purpose: Edit Details From File
 * @param <T>
 * 
 */

public <T> void editDetails() {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				FileReader fileread = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fileread);
				Iterator<T> itrator = array.iterator();
				System.out.println("Enter the person name to edit details");
				String name = inputString();
				boolean flag = false;
				while (itrator.hasNext()) {
					JSONObject jsonObject = (JSONObject) itrator.next();
					if (jsonObject.get("firstname").equals(name)) {
						System.out.println("which column  you want to edit");
						String edit = inputString();
						System.out.println("Enter the new " + edit + " to update.");
						String change = inputString();
						jsonObject.remove(edit);
						jsonObject.put(edit, change);
						System.out.println("Edited Successfully.");
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("Person not found");
				}
				FileWriter filewrite = new FileWriter(file);

				filewrite.write(JSONArray.toJSONString(array));

				filewrite.flush();
				filewrite.close();

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

/**
 * Purpose: Sort File
 * 
 */

public void sort() {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				FileReader fileread = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fileread);
				System.out.println("Enter column name to sort book");
				String string = inputString();
				//Sort sort=new Sort();
				Collections.sort(array, new Sort(string));
				Iterator<?> iterator = array.iterator();
				while (iterator.hasNext()) {
					JSONObject object = (JSONObject) iterator.next();
					System.out.println("firstname : " + object.get("firstname") + " " + "lastname : "
							+ object.get("lastname") + " " + "address: " + object.get("address") + " " + "city : "
							+ object.get("city") + " " + "state : " + object.get("state") + " " + "zip: "
							+ object.get("zip") + " " + "mobile: " + object.get("mobile"));
				}
				FileWriter filewrite = new FileWriter(file);
				filewrite.write(JSONArray.toJSONString(array));
				filewrite.flush();
				filewrite.close();

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

/**
 * Purpose: Delete Person
 * @param <T>
 * 
 * @throws IOException
 * @throws ParseException
 */
public <T> void deletePerson() throws IOException, ParseException {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead()) {
				FileReader fileread = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fileread);
				System.out.println("Enter the name to delete user");
				String name = inputString();
				Iterator<T> iterator = array.iterator();
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
					FileWriter filewrite = new FileWriter(file);
					filewrite.write(JSONArray.toJSONString(array));
					filewrite.flush();
					filewrite.close();
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

/**
 * Purpose: Add Person Details
 * 
 * @throws IOException
 * @throws ParseException
 */

public void addPerson() throws IOException, ParseException {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {

			if (file.canRead() && file.canWrite()) {
				FileReader fileread = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fileread);
				JSONObject jsonobject = new JSONObject();
				System.out.println("Enter First Name:");
				String firstname = inputString();
				System.out.println("Enter Last Name:");
				String lastname = inputString();
				System.out.println("Enter Address:");
				String address = inputString();
				System.out.println("Enter City:");
				String city = inputString();
				System.out.println("Enter State:");
				String state = inputString();
				System.out.println("Enter ZIP:");
				String zip = inputString();
				System.out.println("Enter Mobile Number:");
				String mobile = inputString();

				jsonobject.put("firstname", firstname);
				jsonobject.put("lastname", lastname);
				jsonobject.put("address", address);
				jsonobject.put("city", city);
				jsonobject.put("state", state);
				jsonobject.put("zip", zip);
				jsonobject.put("mobile", mobile);
				array.add(jsonobject);
				System.out.println("Added Successfully.");
				FileWriter filewrite = new FileWriter(file);
				filewrite.write(JSONArray.toJSONString(array));
				filewrite.flush();
				filewrite.close();

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

/**
 * Purpose: Display Details
 * 
 * @throws IOException
 * @throws ParseException
 */
@SuppressWarnings("rawtypes")
public void displayDetails() throws IOException, ParseException {
	try {
		File file = new File("/home/bridgeit/Programs/files/addressBook.json");
		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				FileReader fileread = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray array = (JSONArray) parser.parse(fileread);
				Iterator iterator = array.iterator();
				while (iterator.hasNext()) {
					JSONObject object = (JSONObject) iterator.next();
					System.out.println("firstname : " + object.get("firstname") + " " + "lastname : "
							+ object.get("lastname") + " " + "address: " + object.get("address") + " " + "city : "
							+ object.get("city") + " " + "state : " + object.get("state") + " " + "zip: " + object.get("zip")
							+ " " + "mobile: " + object.get("mobile"));

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

public static void writeFileinteger1(LinkedListStructure<String> linkedlist) {
		String string = linkedlist.toString();
		System.out.println("String : "+string);
		try {
			FileWriter fileWriter = new FileWriter("/home/bridgeit/Programs/files/FileForBinarySearch");
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(string);
			bufferWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
static String path="/home/bridgeit/Programs/files/orderList";
/**
 * @param list1
 */
public static void writeFileinteger2(String[] list1) {
	
		
	StringBuilder builder = new StringBuilder();
	for(String s : list1) {
	    builder.append(s+" ");
	}
	String string = builder.toString();
		try {
			FileWriter fileWriter = new FileWriter(path);
			BufferedWriter BufferWrite = new BufferedWriter(fileWriter);
			BufferWrite.write(string);
			BufferWrite.flush();
			BufferWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

/**
 * 
 * @param string
 */
public static void pallindrom(String string) {
	char[]array=string.toCharArray();
	int size=array.length-1;
	palindromeDequeueStructure dequeueStructure=new palindromeDequeueStructure(20);

	for(int i=0;i<array.length;i++)
	{
		dequeueStructure.addFront(array[i]);
	}

	String String="";

	for(int i=0;i<=size;i++)
	{
		char c=dequeueStructure.removeFront();
		String=String+c;
	}
	System.out.println("Reversed - "+String);
	if(string.equals(String))
	{
		System.out.println("String is Palindrome ");
	}
	else
	{
		System.out.println(" String Is not a palindrome ");
	}
	
	
}

/**
 * purpose: Sort Element
 * 
 * @param words
 */
public static void orderList(String[] words) {
	OrderedListStructure<Integer> orderlist = new OrderedListStructure<>();
	for(int i=0;i<words.length;i++)
	{
		orderlist.add(Integer.parseInt(words[i]));
	}
	System.out.println("\nYour list size:==>>" +orderlist.size()); 
	
	String list[]=orderlist.sortList(orderlist); 
	
	Utility.writeFileinteger2(list);
	
	
	System.out.println("\nEnter the value to search: ");
	int search = Utility.inputInteger();
	if(orderlist.search(search))
	{
		System.out.println("Integer is present");
		orderlist.remove(search);
		System.out.println("Your list size:==>>" +orderlist.size());
		
	}
	else
	{
		//System.out.println("Enter the position: ");
		//int pos = scanner.nextInt();
		orderlist.add( search);
		System.out.println("Integer added");
		System.out.println("Your list size:==>>" +orderlist.size());
	
		orderlist.printlist();
	}
String[] list1=orderlist.sortList(orderlist); 
	
	Utility.writeFileinteger2(list1);
	
}

/**
 * Purpose: Check Entered Expression is Balanced or NotS
 * 
 * @param expression
 */
public static void balenced(String expression) { 
	int len = expression.length();
	StackStructure stack = new StackStructure();
	for (int i = 0; i < len; i++)
	{    
	    char ch = expression.charAt(i);

		if (ch == '(')
		{
		   stack.push(i);
		}
			else if (ch == ')')
			{
				try
				{
				    long p = (stack.pop() + 1);
				    System.out.println("')' at index "+(i+1)+" Balanced with '(' at index "+p);
				}
				catch(Exception e)
				{
				    System.out.println("')' at index "+(i+1)+" is UnBalanced");
				}
			}            
	}
	while (!stack.isEmpty() )
	{
	     System.out.println("'(' at index "+(stack.pop() +1)+" is UnBalanced");
	}                          
	
}

/**
 * Purpose:Banking Transactions
 * 
 * 
 */
public static void bank() {
	int choice;
	BankingQueueStructure queueStructure=new BankingQueueStructure();
	do {
		System.out.println("\n1.For enter to Queue\n2.Procede with Transaction");
		System.out.println("Enter choice");
		choice=Utility.inputInteger();
		if(choice==1)
			queueStructure.add();
		if(choice==2&&queueStructure.empty())
			System.out.println("First Enter into Queue");
	
	
		int option;
	if(choice==2)
	{
		do
		{
	     System.out.println("Select your operation in Bank \n1.Deposite \n.2 WithDraw \n3.Check Balance \n4.Exit ");
	     System.out.println("Enter option");
	      option =Utility.inputInteger();
	
	switch (option)
	{
	case 1:
		    System.out.println("Enter the amount to deoposite");
		    double amunt=inputDouble();
		    queueStructure.exit();
		    Utility.enqueue(amunt);
		    break;
	
	case 2:
		   System.out.println("Enter the amount to withdraw");
		   double amuntw=inputDouble();
		   queueStructure.exit();
		   Utility.dequeue(amuntw);
		   break;
	
	case 3:
		   Utility.checkbalance();
		   break;
		   
	case 4:
		//qs.add();
		  System.exit(option);
		  
	
	
  default:
	      System.out.println("Invalid choice");
		}
		
		}while(option<4);
	}
	}while(choice<3);
		
	
}

/**
 * Purpose: Print Calendar
 * 
 * @param month
 * @param year
 */
public static void calenderWithStack1(int month, int year) {
	String[] months= {"January", "February", "March","April", "May", "June", "July",
			 "August", "September", "October", "November", "December" };                              
	            
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	          
	if (month == 2 && Utility.isLeapYear(year)) days[month] = 29;     
    
	// print calendar header
    System.out.println("   " + months[month] + " " + year);
    System.out.println(" S  M Tu  W Th  F  S");
 
    int d = Utility.dayOfWeek(month, 1, year);          
    for (int i = 0; i < d; i++)
           System.out.print("   ");
       for (int i = 1; i <= days[month]; i++) {
           System.out.printf("%2d ", i);
           if (((i + d) % 7 == 0) || (i == days[month])) 
           	System.out.println();
       }
  
}

/**
 * Purpose:Search Word in File If found Then remove It Otherwise Add 
 * 
 * @param words
 */
public static void unorderList(String[] words) {
	LinkedListStructure<String> linkedlist = new LinkedListStructure<>();

	for(int i=0;i<words.length;i++)
	{
		linkedlist.add(words[i]);
	}
	
	//System.out.println("Your list size: "+linkedlist.size());
    System.out.println("Enter the word to search: ");
    String search = inputString();
	if(linkedlist.search(search))
	{
		System.out.println("Word is present in the linked list");
		linkedlist.remove(search);
		Utility.writeFileinteger1(linkedlist);
		System.out.println("remove successfully");
	}
	else
	{
		linkedlist.append(search);
		Utility.writeFileinteger1(linkedlist);
		System.out.println("Word added");
		
	}
	linkedlist.printlist();
	
}

/**
 * @param month
 * @param year
 * @param start
 * @param maxDay
 */
@SuppressWarnings("rawtypes")
public static void weekDay(int month, int year, int start, int maxDay) {
	int numberOfObject;
	Queue week  = new LinkedList<LinkedList>();
	int date = 0;
	if (maxDay + start > 35) {
		numberOfObject = 6;
	} else {
		numberOfObject = 5;
	}
	for (int i = 0; i < numberOfObject; i++) {
		week.add(new LinkedList<>());
	}
	for (int i = 0; i < numberOfObject; i++) {
		Queue queue = (Queue) week.poll();
		if (i == 0) {
			for (int j = 0; j < start; j++)
			{
				queue.add(" ");
			}
			for(int j = start;j<7;j++)
			{
				queue.add(++date);
			}
		}
		else
		{
			for(int j = 0; j <7;j++)
			{
				queue.add(++date);
				if(date == maxDay)
				{
					break;
				}
			}
			
		}
		week.add(queue);
	}
	System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat");
	for(int i = 0; i < numberOfObject; i++)
	{
		Queue queue = (Queue) week.poll();
		int length = queue.size();
		for(int j = 0; j <length; j++)
		{
			System.out.print(queue.poll());
			System.out.print("\t");
		}
		System.out.println();
	}
	
}

/**
 * Purpose: 
 * 
 */
@SuppressWarnings({ "rawtypes", "unused" })
public static void shareCompany() {
	Stack stack = new Stack();
	com.bridgeit.ObjectOriented.Queue queue = new com.bridgeit.ObjectOriented.Queue();
	
	File file = new File("/home/bridgeit/Programs/files/companyshare.json");
	FileReader fileread;
	try {
		fileread = new FileReader(file);
	
	JSONParser parser = new JSONParser();
	JSONArray array;
    array = (JSONArray) parser.parse(fileread);
	Iterator iterator = array.iterator();
	
	System.out.println("Enter the share symbol");
	String symbol = Utility.inputString();
	while(iterator.hasNext())
	{
		JSONObject object = (JSONObject) iterator.next();
		if(object.containsKey(symbol))
		{
			System.out.println("Share symbol already their in list");
			System.out.println("To add share press 1 and To remove share press 2");
			int choice = Utility.inputInteger();
			switch(choice)
			{
			case 1 : 
						System.out.println("Enter the number of share want to buy");
						int num_share = Utility.inputInteger();
						JSONObject object2 = (JSONObject) object.get(symbol);
						int key = Integer.parseInt(object.get("NumOfShare").toString());
						int new_shares_count = key + num_share;
						object.remove("NumOfShare");
						object.remove(num_share);
						object.put("NumOfShare", new_shares_count);
						FileWriter writer = new FileWriter(file);
						writer.write(JSONValue.toJSONString(array));
						writer.flush();
						writer.close();
						System.out.println("symbol remove successfully from file");
					
				break;
			case 2 : 	System.out.println("Enter the amount of share to sale");
						int amt = Utility.inputInteger();
						JSONObject object1 = (JSONObject) object.get(symbol);
						int share_amt = Integer.parseInt(object1.get("ShareAmt").toString());
						int num_share1 = Integer.parseInt(object1.get("NumOfShare").toString());
						int new_shares_count1 = num_share1 - (amt/share_amt);
						object1.remove("NumOfShare");
						object1.put("NumOfShare", new_shares_count1);
						FileWriter writer1 = new FileWriter(file);
						writer1.write(JSONValue.toJSONString(array));
						writer1.flush();
						writer1.close();
				break;
			}
			
		}
		else
		{
			JSONObject object2 = new JSONObject();
			System.out.println("Enter number of share");
			int num = Utility.inputInteger();
			System.out.println("Enter share amount");
			int amount = Utility.inputInteger();
			object.put("NumOfShare",num );
			object.put("ShareAmt",amount);
			object.put(symbol,object);
			System.out.println("Added succesfull");
			stack.push(symbol);
			stack.display();
			queue.insert(symbol);
			queue.display();
			FileWriter filewrite = new FileWriter(file);
			filewrite.write(JSONValue.toJSONString(array));
			filewrite.flush();
			filewrite.close();
		}
	}
	}
	catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (org.json.simple.parser.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


/**
 * @param filename
 * @return
 */
public static JSONObject readFromJsonFile1(String filename)
{
	Object obj;
	JSONObject jsonObject = null;
	try
	{
		obj = new JSONParser().parse(new FileReader(filename));
		jsonObject = (JSONObject) obj;
	}
	catch(IOException | ParseException e)
	{
		e.printStackTrace();
	}
	
   
	return jsonObject; 
}
/**
 * @param fileName
 * @param jsonObject
 */
public static void writeJsonObjectToFile2(String fileName, JSONObject jsonObject) 
{
	PrintWriter printWriter;
	try {
		printWriter = new PrintWriter(fileName);
		printWriter.write(jsonObject.toJSONString());
		printWriter.flush();
		printWriter.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
			
					/**
					 * @throws IOException
					 * @throws Exception
					 */
					public void addDoctors() throws IOException, Exception {
					File file = new File("/home/bridgeit/Programs/files/doctor.json");
					FileReader filereader = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array1 = (JSONArray) parser.parse(filereader);
					JSONObject jsonobject = new JSONObject();
					System.out.println("Enter number of doctors :");
					int num0fDoctor = inputInteger();

					for (int i = 0; i < num0fDoctor; i++) {

					System.out.println("Enter name of doctor");
					String name = inputString();
					jsonobject.put("Doctor_Name", name);
					System.out.println("Enter I.D doctor");
					String id = inputString();
					jsonobject.put("Doctor_ID", id);
					System.out.println("Enter Specialization of doctor");
					String specilization = scanner.next();
					jsonobject.put("Doctor_Specialization", specilization);
					System.out.println("Enter Availablity of doctor");
					String available = scanner.next();
					jsonobject.put("Doctor_Availiablity", available);
					array1.add(jsonobject);
					}
					try {
					System.out.println("Data has been uploaded :");
					FileWriter jsonFileWriter = new FileWriter(file);
					jsonFileWriter.write(JSONArray.toJSONString(array1));
					jsonFileWriter.flush();
					jsonFileWriter.close();
					System.out.println("Doctor Added:" + array1);
					} catch (IOException e) {
					System.out.println("exception");
					}
					}
					
					
					/**
					 * Purpose:display doctor details
					 */
					public void displayDoctorDetails() {
						
						
						try {
							File file = new File("/home/bridgeit/Programs/files/doctor.json");
							if (file.exists()) {
								if (file.canRead() && file.canWrite()) {
									FileReader fileread = new FileReader(file);
									JSONParser parser = new JSONParser();
									JSONArray array = (JSONArray) parser.parse(fileread);
									Iterator iterator = array.iterator();
									while (iterator.hasNext()) {
										JSONObject object = (JSONObject) iterator.next();
										//System.out.println("hiii"+object.get("available"));
										System.out.println("Doctor_Availiablity : " + object.get("Doctor_Availiablity") + " " + "Doctor_Specialization : "
												+ object.get("Doctor_Specialization") + " " + "Doctor_ID: " + object.get("Doctor_ID") + " " + "Doctor_Name: "
												+ object.get("Doctor_Name") );

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

				

					/**
					* Add Patients record by name, id,mobile number and age
					* 
					* @throws IOException
					* @throws Exception
					*/
					public void addPatients() throws IOException, Exception {
						File file = new File("/home/bridgeit/Programs/files/Patient.json");
						FileReader filereader = new FileReader(file);
						JSONParser parser = new JSONParser();
						JSONArray array = (JSONArray) parser.parse(filereader);
						JSONObject jsonobject = new JSONObject();
						System.out.println("Enter number of Patients: ");
						int num0fPatients = inputInteger();
						for (int i = 0; i < num0fPatients; i++) {

					System.out.println("Enter name of Patient");
					String name = inputString();
					jsonobject.put("Patient_Name", name);

					System.out.println("Enter I.D Patient");
					String id = inputString();
					jsonobject.put("Patient_ID", id);

					System.out.println("Enter mobile number of Patient");
					long mobileNumber = scanner.nextLong();
					jsonobject.put("Patient_mobileNumber", mobileNumber);

					System.out.println("Enter Patient age");
					int age = inputInteger();
					jsonobject.put("Patient_ID", age);
					array.add(jsonobject);
					}
					try {
					System.out.println("Data has been uploaded :");
					FileWriter jsonFileWriter = new FileWriter(file);
					jsonFileWriter.write(JSONArray.toJSONString(array));
					jsonFileWriter.flush();
					jsonFileWriter.close();
					System.out.println("Patient Added:" + array);
					} catch (IOException e) {
					System.out.println("exception");

					}

					}

					/**
					 * Purpose: search Doctor by there name
					 * 
					 * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchDoctor() throws Exception {

					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/doctor.json"));
					System.out.println("Search Doctor_Name :");
					String name = inputString();
					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					} catch (IOException e) {
					System.out.println("exception");
					}
					}

					/**
					 * @throws Exception
					 */
					public void searchDoctorm() throws Exception {

					System.out.println("enter the choice");
					System.out.println("1.search doctor by name");
					System.out.println("2.search doctor by id");
					System.out.println("3.search doctor by specialization");
					System.out.println("4.search doctor by availability");
					int choice = inputInteger();
					switch (choice) {
					case 1:
					      searchbyName();
					      break;
					case 2:
					      searchbyID();
					      break;
					case 3:
					      searchbySpecialization();
					      break;
					case 4:
					      searchbyAvailability();
					      break;
					default:
					     System.out.println("invalid");

					}
					}



					/**
					 * Purpose: search by Name
					 * 
				     * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchbyName() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/doctor.json"));
					System.out.println("Search Doctor_name :");
					String name = inputString();

					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_Name").equals(name)) {

					System.out.println("Doctor_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					}

					catch (IOException e) {
					System.out.println("exception");
					}

					}

					/**
					 *  Purpose: search by ID
					 * 
					 * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchbyID() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/doctor.json"));
					System.out.println("Search doctor_ID :");
					String id = inputString();
					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_ID").equals(id)) {

					System.out.println("doctar_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					}

					catch (IOException e) {
					System.out.println("exception");
					}

					}

					/**
					 *  Purpose: search doctor by Specialization
					 * 
					 * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchbySpecialization() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/doctor.json"));
					System.out.println("Search doctor by specialization:");
					String name = inputString();

					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_Specialization").equals(name)) {

					System.out.println("Doctor_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					} catch (Exception e) {
					System.out.println(" ");
					}
					}

					/**
					 * Purpose: search doctor by Availability
					 * 
					 * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchbyAvailability() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/doctor.json"));
					System.out.println("Search doctor by availability :");
					String name = inputString();

					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_Availiablity").equals(name)) {

					System.out.println("doctor_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					} catch (IOException e) {
					System.out.println("exception");
					}
					}

					/**
					 * Purpose: search patient by there name
					 * 
					 * @throws Exception
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public void searchPatient() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/Patient.json"));
					System.out.println("Search Patient_Name :");
					String name = inputString();

					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Patient_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					}

					catch (IOException e) {
					System.out.println("exception");
					}

					}

					/**
					 * Purpose: search Patient by Name
					 * 
					 * @throws Exception 
					 */
					@SuppressWarnings({ "rawtypes", "unused" })
					public static void searchPatientbyName() throws Exception {
					try {
					JSONParser parser = new JSONParser();
					JSONArray array = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Programs/files/Patient.json"));
					System.out.println("Search Patient_Name :");
					String name =scanner.next();

					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Patient_Name").equals(name)) {

					System.out.println("Patient_founded" + jsonobject);

					} else {
					flag = false;
					}

					}
					}

					catch (IOException e) {
					System.out.println("exception");
					}

					}
				
					/**
					* take an appointment of doctor with date and generate report
					* 
					* @throws Exception
					* @throws IOException
					*/
					@SuppressWarnings({ "rawtypes", "unused" })
					public void takeAppointment1() throws IOException, Exception {
					File file = new File("/home/bridgeit/Programs/files/doctor.json");
					FileReader filereader = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array1 = (JSONArray) parser.parse(filereader);
					System.out.println("Please enter Patient_Name");
					String patient_name = inputString();
					System.out.println("Enter the date for appointment");
					String stringDate = inputString();
					System.out.println("Enter Doctor name for to take an Appointment");
					String doctername = inputString();

					String doctorInfo = null;
					try {
					JSONArray array = (JSONArray) parser.parse(new FileReader(file));
					Iterator iterator = array.iterator();

					boolean flag = false;
					while (iterator.hasNext()) {
					JSONObject jsonobject = (JSONObject) iterator.next();
					if (jsonobject.get("Doctor_Name").equals(doctername)) {

					System.out.println("Doctor_founded" + jsonobject);

					}

					flag = false;
					}
					doctorInfo = doctername;

					JSONArray array2 = new JSONArray();

					JSONObject jsonobject = (JSONObject) parser.parse(new FileReader("/home/bridgeit/Programs/files/Appointment.json"));
					JSONArray appointmentFileObj = (JSONArray) jsonobject.get("Doctor_name");
					JSONObject object = new JSONObject();

					if ((object.containsKey(doctername)) && (appointmentFileObj.size() < 5)) {

						object.put("Doctor_name", doctername);

						object.put("Patient_Name", patient_name);
						object.put("Booking Date ", (stringDate));
					    appointmentFileObj.add(object);
					    jsonobject.put("Doctor_name", appointmentFileObj);
					    FileWriter filewriter = new FileWriter("/home/bridgeit/Programs/files/Appointment.json");
					    filewriter.write(JSONObject.toJSONString(jsonobject));
					    filewriter.flush();
					    filewriter.close();
					}
					System.out.println("hello " + patient_name + " Your Appointment is fixed With Doctor " + doctorInfo + " on: "
					+ (stringDate));

					} catch (IOException e) {
					System.out.println("exception");
					}
					}
			
		
					/**
					 * @param treeset
					 */
					public static void twoDimentionlPrimeAnagramNumber(TreeSet<Integer> treeset) {

						int row = 0, column = 0, i, j, number = 100;
						Object integerArray[] = treeset.toArray();
						String stringArray[][] = new String[10][25];
						for (i = 0; i < 10; i++) {
							for (j = 0; j < 25; j++) {
								stringArray[i][j] = "";
							}
						}
						for (i = 0; i < integerArray.length; i++) {
							int temperaroy = (int) integerArray[i];
							if (temperaroy > number) {
								number = number + 100;
								row++;
								column = 0;
							}
							stringArray[row][column++] = Integer.toString(temperaroy);
						}

						System.out.println("Anagram numbers are: ");
						for (i = 0; i < 10; i++) {
							for (j = 0; j < 25; j++) {
								System.out.print(stringArray[i][j] + "\t");
							}
							System.out.println();
						}
					}


					/**
					 * @param arrayList
					 * @return anagram array list
					 */
					public static TreeSet<Integer> anagramInArraylist(ArrayList<Integer> arrayList) {
						TreeSet<Integer> treeSet = new TreeSet<>();
						for (int i = 0; i < arrayList.size() - 1; i++) {
							for (int j = i + 1; j < arrayList.size(); j++) {
								if (anagram(arrayList.get(i)+" ", arrayList.get(j)+" ")) {
									treeSet.add(arrayList.get(i));
									treeSet.add(arrayList.get(j));
								}
							}
						}
						return treeSet;
					}
					

					/**
					 * @return
					 */
					@SuppressWarnings("rawtypes")
					Queue cardQueue = new java.util.LinkedList<>();

					public String[] assignDeckOfCards() {
						String[] suit = { "Club", "Diamond", "Heart", "Spade" };
						String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
						String[] deckOfCards = new String[52];
						int index = 0;
						for (int i = 0; i < suit.length; i++) {
							for (int j = 0; j < rank.length; j++) {
								deckOfCards[index++] = suit[i] + " " + rank[j];
							}
						}
						return deckOfCards;
					}

					/**
					 * @param deckCards
					 * @return
					 */
					public String[] shuffle(String[] deckCards) {
						for (int i = 0; i < deckCards.length; i++) {
							int random = (int) (Math.random() * (52));
							String temp = deckCards[i];
							deckCards[i] = deckCards[random];
							deckCards[random] = temp;
						}
						return deckCards;
					}

					/**
					 * @param deckOfShuffleCards
					 * @param noOfPlayers
					 * @param noOfCards
					 * @return
					 */
					public String[][] distribute(String[] deckOfShuffleCards, int noOfPlayers, int noOfCards) {
						int index = 0;
						String[][] distributedCards = new String[noOfPlayers][noOfCards];
						for (int i = 0; i < noOfPlayers; i++) {
							for (int j = 0; j < noOfCards; j++) {
								distributedCards[i][j] = deckOfShuffleCards[index++];
							}
						}
						return distributedCards;
					}

					/**
					 * @param cardsOfPlayers
					 * @param noOfPlayers
					 * @param noOfCards
					 */
					public void printDistibutedCards(String[][] cardsOfPlayers, int noOfPlayers, int noOfCards) {
						for (int i = 0; i < noOfPlayers; i++) {
							System.out.println("*** player*** " + (i + 1));
							for (int j = 0; j < noOfCards; j++) {
								System.out.println(cardsOfPlayers[i][j]);
							}
							System.out.println();
						}
					}

					private void sort(String[] cards) {
						char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
						for (int i = 0; i < rank.length; i++) {
							for (int j = 0; j < cards.length; j++) {
								String card = cards[j];
								char cardRank = card.charAt(card.length() - 1);
								if (cardRank == rank[i])
									cardQueue.add(card);
							}
						}
					}

					/**
					 * @param playerCards
					 * @param noOfPlayers
					 * @param noOfCards
					 */
					public void printSortedCards(String[][] playerCards, int noOfPlayers, int noOfCards) {
						String[] cards = new String[noOfCards];
						for (int i = 0; i < noOfPlayers; i++) {
							for (int j = 0; j < noOfCards; j++) {
								cards[j] = playerCards[i][j];
							}
							cardQueue.add("***Player*** " + (i + 1));
							sort(cards);
						}
						printSortedQueue(cardQueue);
					}

					@SuppressWarnings("rawtypes")
					private void printSortedQueue(Queue cardQueue2) {
						for (int i = 0; i < 40; i++) {
							if (i % 10 == 0) {
								System.out.println();
							}
							System.out.println(cardQueue2.remove());
						}

					}

				
					

	// TODO Auto-generated method stub
	
								

}
	




package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.xml.soap.Node;

import com.bridgeit.DataStructure.LinkedListStructure;
import com.bridgeit.DataStructure.OrderedListStructure;

public class Utility {

	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public int inputInteger() {
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
	 * Purpose:Print Leap Year or Not
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
				lbets++;
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
		System.out.println("Avg bets = " + 1.0 * lbets / trials);
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
		System.out.println("Start Time is: " + START_TIMER % 1200 + " Seconds");
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
	public static void extendPrime(int[] strArray) {
		// TODO Auto-generated method stub
		System.out.println("\nprime number That Are Anagarm:");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (Utility.anagram(strArray[i]+ " ", strArray[j]+ " ")) {
					System.out.println(strArray[i] + " -> " + strArray[j]);
				}
			}
		}
		
		
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
		String[] words = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[] = {};
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
	 * Purpose:
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
		 * @param words
		 */
		@SuppressWarnings("unchecked")
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
					@SuppressWarnings("rawtypes")
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
		    System.out.println("New Hash:"+hash);

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
			
		}

		/**
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
		 * @param array
		 */
		public void prime2D(int[][] array) {
			int initial=2,temp=100;
			int i,j,k;
			for(i=0; i<10; i++) {
				int size=0;
				for(j=initial; j<temp; j++)
				{
					boolean flag=true;
					for(k=2; k<j; k++)
					{
						if(j%k==0)
						{
							flag=false;
							break;
						}					
					}
					if(flag==true)
					{
						size++;
					}
				}
				array[i]=new int[size];
				j=0;
				int m;
				for(m=initial; m<temp; m++)
				{
					boolean temp1=true;
					for(int q=2; q<m; q++)
					{
						if(m%q==0)
						{
							temp1=false;
							break;
						}
					}
					
					if(temp1==true)
					{
						array[i][j]=m;
						System.out.print(array[i][j]+"  ");
						j++;
					}
				}
				System.out.println();
				initial=temp;
				temp=temp+100;
			}


			
		}

	

}

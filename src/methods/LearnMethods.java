package methods;

import java.util.Scanner;

public class LearnMethods {

	public static void main(String[] args) {
		
	// create a method that takes an array of integer and return their sum
		
	int[] randomNumber = new int[5];
	
	randomNumber[0] = 3;
	randomNumber[1] = 2;
	randomNumber[2] = 1;
	randomNumber[3] = 7;
	randomNumber[4] = 3;
	
	int sumOfRandomNumber = addRandomNunber(randomNumber);
	
	System.out.println("the sum of number in the randomNumber is: " + sumOfRandomNumber) ;
		
	System.out.println(multiplyStringByNumber("Hello", 3));

	}

	public static int addRandomNunber (int[] array) {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum;
	}
	
	public static String multiplyStringByNumber (String x, int i) {
		String result = "";
		for (int j =1; j <= i; j ++) {
			result += x;
		}
		return result;
	}
	
}	


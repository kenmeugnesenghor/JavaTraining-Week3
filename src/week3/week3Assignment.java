package week3;

public class week3Assignment {

	public static void main(String[] args) {
		
		// Question 1 of creating an array of integers
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 44}; // 44 added to the given array
		
		int firstMinusLast = ages[ages.length -1] - ages[0];
		
		System.out.println(firstMinusLast); // Printing 41 on the screen
		
		double sumOfAges = 0;
		for (int i = 0; i < ages.length; i++) {
			sumOfAges += ages[i];
		}
		
		double averageOfAges = sumOfAges / ages.length;
		
		System.out.println(averageOfAges); // printing 30.44444444443 on the screen
		
		// Question 2a) printing the average characters of an array of strings
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double totalNamesCharacters = 0;
		
		for (String name : names) {
			totalNamesCharacters += name.length();
		}
		
		double averageNumbersOfNames = totalNamesCharacters / names.length;
		
		System.out.println(averageNumbersOfNames); // printing 3.8333333335 on the screen
		
		// Question 2b) concatenating the entries of the names array
		
		String concatenationOfNames = "";
		
		for (String name : names) {
			concatenationOfNames += name + " ";
		}
		
		System.out.println(concatenationOfNames); // printing "Sam Tommy Tim Sally Bulk Bob"
		
		// Question 5 Creating the nameLengths array
		
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		 // Question 6 Sum of element in the nameLengths array
		
		int sumOfNameLengths = 0;
		for (int element : nameLengths) {
			sumOfNameLengths += element;
		}
		
		System.out.println(sumOfNameLengths ); // printing 23 on the screen
		
		// Question 7 testing the output of the multiplyAString method
		
		System.out.println(multiplyAString("Hello", 3));
		
		// Question 8: testing the output of the createFullName method
		
		System.out.println(createFullName("John", "Smith")); // printing "John Smith"
		
		// Question 9: testing the output of the greaterThan100 method
		
		int[] range = {12, 35, 34, 1};
		
		System.out.println(greaterThan100(range)); // printing false
		
		//Question 10 and 11
		
		double[] values = {12.1, 32.0, 5, 0.9};
		double[] numbers = {23.0, 35.6, 46.4};
		
		System.out.println(averageOfAnArrayOfDouble(values)); // printing 12.5 for question 10
		
		System.out.println(isAverageOfFirstArrayGreaterThanAverageOfSecondArray(numbers, values)); // printing true for question 11
		
		// Question 12: testing the output of the willBuyDring method
		
		System.out.println(willBuyDrink(true, 9.6)); // printing false since 9.6 is less than 10.5
		
		//Question 13: checking the existInTheArray method using the string array names and a string "Senghor"
		
		System.out.println(existInTheArray(names, "Senghor")); // printing false

	}
	
		// method of question 7
		
		public static String multiplyAString (String word, int n) {
			String result = "";
			for (int i = 1; i <= n; i++) {
				result += word;
			}
			return result;
		}
		
		// method of question 8
		
		public static String createFullName (String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
		// method of question 9
		
		public static boolean greaterThan100 (int[] array) {
			int sum = 0;
			for (int value : array) {
				sum += value;
			}
			return sum > 100;
		}
		
		// method of question 10
		
		public static double averageOfAnArrayOfDouble (double[] array) {
			double sum = 0;
			for (double element : array) {
				sum += element;
			}
			return sum / array.length;
		}
		
		// method of question 11
		
		public static boolean isAverageOfFirstArrayGreaterThanAverageOfSecondArray (double[] firstArray, double[] secondArray) {
			return averageOfAnArrayOfDouble (firstArray) > averageOfAnArrayOfDouble (secondArray);
		}
		
		// method of question 12
		
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket > 10.5 ) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// This method of mine takes and array of string and check if a given string is listed inside the array
		
		public static boolean existInTheArray (String[] arrayOfStrings, String string) {
			boolean result = false;
			
			for (String member : arrayOfStrings) {
				if (member == string) {
					result = true;
					break;
				}
			}
			
			return result;
		}
			
	

}

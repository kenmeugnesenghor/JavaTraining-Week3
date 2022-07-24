package arrays;

import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
		
		String[] students = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter the names of student Nbr " + i);
			students[i] = sc.nextLine();
		}
		
		for (String student : students) {
			System.out.println(student);
		}
	}

}

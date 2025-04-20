package LearningJava;

import java.util.Scanner;

public class reverseSentence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		String reversestr = reverse(inputString);
		System.out.println("reverse of input string is:" + reversestr);
		in.close();
	}

	public static String reverse(String inputString) {
		if (inputString.isEmpty()) {
			return inputString;
		}
		return reverse(inputString.substring(1)) + inputString.charAt(0);
	}
}

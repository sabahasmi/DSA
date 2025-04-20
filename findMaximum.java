package LearningJava;

import java.util.Scanner;

public class findMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of input:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("You Entered: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		int maxiElement =findMax(arr,n); 
		System.out.println(maxiElement);
		sc.close();

	}

	public static int findMax(int arr[], int n) {
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}

package LearningJava;

import java.util.Scanner;

public class standerdFormula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " Element:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("You Entered:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int SD=StanderedDeviation(arr,n);
		System.out.println("Standred Deviation of(deffirece between array):"+SD);
		sc.close();
	}
	public static int StanderedDeviation(int arr[],int n) {
		int sum=0;
		int standeredDeviation=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int mean=sum/n;
		for(int i=0;i<n;i++) {
			standeredDeviation+=Math.pow(arr[i]-mean,2);
		}
		return (int) Math.sqrt(standeredDeviation/n);
	}
}

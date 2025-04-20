package LearningJava;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows and the Cols:");
		int r, c;
		r = sc.nextInt();
		c = sc.nextInt();
		int[][] matrix1 = new int[r][c];
		int[][] matrix2 = new int[r][c];
		// Taking Input of 1st matrix
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		// Taking Input of 2st matrix
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		int[][] sum = addigMatrix(matrix1, matrix2);

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
		
		sc.close();
	}
	public static int[][] addigMatrix(int a[][],int b[][]) {
		int r=a.length;
		int c=a[0].length;
		
		int [][]sum =new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
}

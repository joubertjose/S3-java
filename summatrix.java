package array;

import java.util.Scanner;

public class summatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no of columns");
		int cols = sc.nextInt();
		int [][] matrix = new int[rows][cols];
		int [][] transpose = new int[rows][cols];
		
		System.out.println("Enter the matrix elements");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				transpose[i][j] = matrix[i][j];
				}
		}
		
	}
	

}
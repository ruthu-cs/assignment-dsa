package assignment;

import java.util.Scanner;

public class CreateandPrintmatrix {
	int matrix[][];
	int row, column;
	void create() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Number of rows :");
		row = Integer.parseInt(in.nextLine());
		System.out.println("Number of columns :");
		column = Integer.parseInt(in.nextLine());
		matrix = new int[row][column];
		System.out.println("Enter the data :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
	}
	void display() {
		System.out.println("\nThe Matrix is :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
 
class CreateMatrix {
	public static void main(String args[]) {
		CreateandPrintmatrix obj = new CreateandPrintmatrix();
		obj.create();
		obj.display();
	}
}

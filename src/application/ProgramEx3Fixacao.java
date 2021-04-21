package application;

import java.util.Scanner;

public class ProgramEx3Fixacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set Line and Column: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		System.out.println("Set Matrix numbers: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("What number are you looking for? ");
		int number = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (number == mat[i][j]) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j+1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i+1 < mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

	
}

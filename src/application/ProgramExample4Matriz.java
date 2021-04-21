package application;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class ProgramExample4Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Abaixo a demonstração de construção de um arranjo bimencional que
		// caracateriza uma matriz no java.
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matriz:  ");
		for (int k = 0; k < n; k++) {
			for (int k2 = 0; k2 < n; k2++) {
				System.out.print(mat[k][k2] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Main Diagonal");
		for (int k = 0; k < n; k++) {
			System.out.print(mat[k][k] + " ");
		}

		System.out.println();

		// Abaixo além de encontrar os números negativos, estamos codificando o laço for
		// de maneira diferente, considerando linhas e colunas sem enrigecer com a
		// variável n, ou seja, independente dos valores de n que podem ser distintos
		// entre linhas e colunas o for funcionaria.
		int countNegative = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					countNegative += 1;
				}
			}
		}

		System.out.print("Negative numbers = " + countNegative);

		sc.close();
	}

}

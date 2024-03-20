package aula_16;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor da matriz: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);

		sc.close();
	}
}

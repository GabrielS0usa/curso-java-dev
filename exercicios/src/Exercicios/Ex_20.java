package Exercicios;

import java.util.Scanner;

public class Ex_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade a ser lida: ");
		int n = sc.nextInt();

		for (int j = 1; j <= n; j++) {
			System.out.println("Digite a primeira média: ");
			double m1 = sc.nextDouble();
			System.out.println("Digite a segunda média: ");
			double m2 = sc.nextDouble();
			System.out.println("Digite a terceira média: ");
			double m3 = sc.nextDouble();

			double med = (m1 * 2.0 + m2 * 3.0 + m3 * 5.0) / 10;

			System.out.printf("%.1f%n", med);

		}

		sc.close();
	}
}

package Exercicios;

import java.util.Scanner;

public class Ex_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de números a serem lidos: ");
		int n, in = 0, out = 0;
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite o " + i + "° valor: ");
			int y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}

package Exercicios;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}

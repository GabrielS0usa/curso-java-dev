package Exercicios;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, resultado;

		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		d = sc.nextInt();
		sc.nextLine();

		resultado = (a * b) - (c * d);

		System.out.println("A diferença é: " + resultado);

		sc.close();
	}

}

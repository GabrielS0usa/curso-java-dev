package Exercicios;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double r, tt, resultado;

		tt = 3.14159;

		System.out.println("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		sc.nextLine();

		resultado = tt * (Math.pow(r, 2));

		System.out.printf("O valor da área do circulo é %.4f %n", resultado);

		sc.close();

	}

}

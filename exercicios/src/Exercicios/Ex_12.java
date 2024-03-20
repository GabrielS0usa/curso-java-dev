package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite um valor: ");
		Double v1 = sc.nextDouble();
		
		if (v1 > 0 && v1 <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if (v1 > 25 && v1 <= 50) {
			System.out.println("Intervalo [25,50]");
		}else if (v1 > 50 && v1 <= 75) {
			System.out.println("Intervalo [50,75]");
		}else if (v1 > 75 && v1 <= 100) {
			System.out.println("Intervalo [75,100]");
		}else {
			System.out.println("Opção invalida!");
		}
		
		sc.close();
	}
}

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double h, v, resultado;
		
		System.out.println("Digite o número do funcionario: ");
		n = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		h = sc.nextDouble();
		System.out.println("Digite o valor da hora trabalhada: ");
		v = sc.nextDouble();
		
		resultado = v * h ;
		
		System.out.println("número = " + n);
		System.out.printf("Salario = %.2f%n", resultado);
		
		
		
		sc.close();
	}

}

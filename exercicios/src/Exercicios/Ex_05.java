package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int p1, p2, q1, q2;
		double v1, v2, resultado;
		
		System.out.println("Digite o número da peça: ");
		p1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		q1 = sc.nextInt();
		System.out.printf("Digite o valor da peça %d: \n", p1);
		v1 = sc.nextDouble();
		
		System.out.println("Digite o número da peça: ");
		p2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		q2 = sc.nextInt();
		System.out.printf("Digite o valor da peça %d: \n", p2);
		v2 = sc.nextDouble();
		
		resultado = (v1 * q1)+(v2*q2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
		
		sc.close();
	}

}

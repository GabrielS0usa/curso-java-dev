package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Entre com o valor do dolar: ");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar: ");
		double dolar =sc.nextDouble();
		
		double valor = CurrencyConverter.conversor(valorDolar, dolar);
		
		System.out.println();
		System.out.printf("Você terá que pagar: %.2f%n", valor);
		
		sc.close();
	}
}

package aula_06;

import java.util.Scanner;
import java.util.Locale;

public class Aula_06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		String dia;
		
		System.out.println("Digite um dia: ");
		n = sc.nextInt();
		
		switch (n) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Opção Invalida!";
			break;
		}
		System.out.println(dia);
		
	}
}

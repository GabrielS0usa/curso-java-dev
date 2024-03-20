package application;

import entities.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante est = new Estudante();

		System.out.println("Digite o nome do aluno: ");
		est.nome = sc.nextLine();

		System.out.println("Digite a n1 de 0 a 30: ");
		est.n1 = sc.nextFloat();
		if (est.n1 > 30) {
			System.out.println("A nota n1 precisa ser menor que 30!");
			System.exit(0);
		}

		System.out.println("Digite a n2 de 0 a 35: ");
		est.n2 = sc.nextFloat();
		if (est.n2 > 35) {
			System.out.println("A nota n2 precisa ser menor que 35!");
			System.exit(0);
		}

		System.out.println("Digite a n3 de 0 a 35: ");
		est.n3 = sc.nextFloat();
		if (est.n3 > 35) {
			System.out.println("A nota n3 precisa ser menor que 35!");
			System.exit(0);
		}

		if (est.notaFinal() > 60) {
			System.out.printf("Name: %S ", est.nome);
			System.out.printf("\rFinal Grade: %.2f\r", est.notaFinal());
			System.out.println("PASS");
		} else {
			System.out.printf("Name: %S ", est.nome);
			System.out.printf("\rFinal Grade: %.2f\r", est.notaFinal());
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - est.notaFinal()) + " POINTS");
		}

		sc.close();
	}
}

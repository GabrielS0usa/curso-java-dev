package aula_14;

import java.util.Locale;
import java.util.Scanner;

public class Aula_14 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0, avg;
		for (int i=0; i<n; i++) {
			sum +=vect[i];
		}
		
		avg = sum / n;
		
		System.out.println();
		System.out.printf("A média é: %.2f%n", avg);

		sc.close();
	}
}

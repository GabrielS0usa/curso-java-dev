package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products2;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Products2[] vect = new Products2[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double price = sc.nextDouble();
			vect[i] = new Products2(name, price);

		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double svg = sum/vect.length;
		
		System.out.printf("%.2f%n",svg);

		sc.close();
	}

}

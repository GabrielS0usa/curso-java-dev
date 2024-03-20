package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter the width of the rectangle: \r");
		rectangle.width = sc.nextDouble();

		System.out.println();
		System.out.println("Enter the height of the rectangle: \r");
		rectangle.height = sc.nextDouble();

		System.out.println();
		System.out.println(rectangle);

		sc.close();
	}

}

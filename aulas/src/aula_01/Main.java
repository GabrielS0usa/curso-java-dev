package aula_01;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		byte Idade = 20;
		String Nome = "Gabriel";
		double Money = 1200.0;
		int Y = 32;
		double X = 10.35784;
		System.out.println(Y);
		System.out.println("Bom dia!");
		System.out.println(X);
		System.out.printf("%.2f%n", X);
		System.out.printf("%.4f%n", X);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", X);
		System.out.println("Resultado = " + X + " METROS");
		System.out.printf("Resultado = %f METROS. \n", X);
		System.out.printf("%s tem %d e ganha R$%.2f.\n\n", Nome, Idade, Money);
		
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double	price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ $%.2f\n", product1, price1);
		System.out.printf("%s, which price is $ $%.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}

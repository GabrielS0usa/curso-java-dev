package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.println("Entre com o nome do funcionário");
		func.name = sc.nextLine();
		
		System.out.println("Entre com o sálario bruto do funcionario: ");
		func.grossSalary = sc.nextDouble();
		System.out.println();
		
		System.out.println("Entre com o desconto do salário: ");
		func.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Funcionario: " + func);
		System.out.println();
		
		System.out.println("Entre com a porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		func.increaseSalary(porcentagem);
		System.out.println();
		
		System.out.println("Updated data: " + func);
		System.out.println();
	
		
		sc.close();
	}

}

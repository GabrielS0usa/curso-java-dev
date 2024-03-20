package Exercicios;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quatidade de linhas: ");
		int l = sc.nextInt();
		System.out.println("Entre com a quatidade de colunas: ");
		int c = sc.nextInt();
		int[][] mat = new int[l][c];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o número que deseja procurar: ");
		int eco = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == eco) {
					System.out.println("Position " + i + ',' + j);
					//left
					if (j > 0) {System.out.println("Left: " + mat[i][j-1]);}
					//up
					if (i > 0) {System.out.println("Up: " + mat[i-1][j]);}
					//Right
					if (j <  mat[i].length-1) {System.out.println("Right: " + mat[i][j+1]);}
					//Right
					if (i < mat.length-1) {System.out.println("Down: " + mat[i+1][j]);}
				}
			}
		}
		
		sc.close();
	}

}

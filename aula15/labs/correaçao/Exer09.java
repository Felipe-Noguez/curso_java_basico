package com.loiane.cursojava.aula15.labs.correa?ao;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com 3 n?meros: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 >= num2 && num2 >= num3) {
			System.out.println("Ordem decrescente ?: " +num1 +", " +num2 + ", "+num3 + ".");
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println("Ordem decrescente ?: " +num2 +", " +num1 + ", "+num3 + ".");
		} else if (num3 >= num2 && num2 >= num1) {
			System.out.println("Ordem decrescente ?: " +num3 +", " +num2 + ", "+num1 + ".");
		} else if (num2 >= num3 && num3 >= num1) {
			System.out.println("Ordem decrescente ?: " +num2 +", " +num3 + ", "+num1 + ".");
		}
		
	}

}

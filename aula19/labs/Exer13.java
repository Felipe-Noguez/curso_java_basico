package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int soma = 0;
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posi��o " + i);
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetA.length; i++) {
			if(vetA[i] % 5 == 0) {
				soma += vetA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i>vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Soma = " + soma);
		
		
	}

}

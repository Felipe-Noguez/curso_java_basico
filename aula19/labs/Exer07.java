package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];
		
		for(int i=0; i<vetA.length; i++) {
			System.out.println("Entre com o valor do vetor A, posi��o " + i + " + ");
			vetA[i] = input.nextInt();
		}
		
		for(int i=0; i<vetB.length; i++) {
			System.out.println("Entre com o valor do vetor B, posi��o " + i + " = ");
			vetB[i] = input.nextInt();
			
			vetC[i] = vetA[i] - vetB[i]; 
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i=0; i<vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i=0; i<vetC.length; i++) {
			System.out.print(vetC[i] + " ");
		}
	}

}

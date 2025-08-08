package exerciciosDeEstrutura;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é 
		 * negativo ou não*/
		
		Scanner sc = new Scanner(System.in);	
		int x;
		
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}

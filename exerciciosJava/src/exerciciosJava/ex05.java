package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/ 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1, p2, q1, q2; //obs, p1 = peça 1; p2 = peça 2; q1 = quantidade peça 1...
		double vlrP1, vlrP2, total;
		
		System.out.println("Digite o codigo da peca 1: ");
		p1 = sc.nextInt();
		System.out.println("Digite o numero de pecas: ");
		q1 = sc.nextInt();
		System.out.println("Digite o valor de cada peca: ");
		vlrP1 = sc.nextDouble();
		
		
		System.out.println("Digite o codigo da peca 2: ");
		p2 = sc.nextInt();
		System.out.println("Digite o numero de pecas: ");
		q2 = sc.nextInt();
		System.out.println("Digite o valor de cada peca: ");
		vlrP2 = sc.nextDouble();
		
		total = q1 * vlrP1 + q2 * vlrP2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
						
		sc.close();
		
	}

}

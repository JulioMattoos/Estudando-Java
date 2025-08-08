package exerciciosDeEstrutura;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/ 
		
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double vlr;
		
		System.out.println("CODIGO    ESPECIFICAÇÃO      PREÇO");
		System.out.println("1         Cachorro Quente    R$4.00");
		System.out.println("2         X-Salada           R$4.50");
		System.out.println("3         X-Bacon            R$5.00");
		System.out.println("4         Torrada Simples    R$2.00");
		System.out.println("5         Refrigerante       R$1.50");
		
		System.out.println("Digite o código do item que deseja:");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qtd = sc.nextInt();
		
		if(cod == 1) {
			vlr = qtd * 4.0;
		}
		else if(cod == 2) {
			vlr = qtd * 4.5;
		}
		else if(cod == 3) {
			vlr = qtd * 5.0;
		}
		else if(cod == 4) {
			vlr = qtd * 2.0;
		}
		else{
			vlr = qtd * 1.5;
		}
		
		System.out.printf("Total: R$%.2f", vlr);
		
		
		sc.close();

	}

}

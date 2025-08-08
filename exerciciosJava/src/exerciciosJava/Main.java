package exerciciosJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		float a, b, soma;
		
		System.out.println("Vamos fazer a soma de dois numeros!");
		System.out.println("Digite o primeiro numero: ");
		
		a = sc.nextInt();
		System.out.println("Agora digite o segundo numero: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma de " + a  + " + " + b + " = " + soma);
		
		sc.close();
		

	}

}

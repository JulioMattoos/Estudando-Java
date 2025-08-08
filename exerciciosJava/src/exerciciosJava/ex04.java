package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hrTrabalhada; 
		double salario, vlrHr;
		
		System.out.println("Digite seu numero: ");
		numero = sc.nextInt();
		
		
		System.out.println("Quantidade de horas trabalhadas: ");
		hrTrabalhada = sc.nextInt();
		
		System.out.println("Quanto recebe por hora? ");
		vlrHr = sc.nextDouble();
		
		salario = vlrHr * hrTrabalhada;
		
		System.out.println("Numero" + numero);
		System.out.printf("Seu salario e: U$ %.2f%n", salario);
		
		
		
		sc.close();
	}

}

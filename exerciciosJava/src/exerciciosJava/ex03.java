package exerciciosJava;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c,d, DIFERENCA;
		
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		c = sc.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		d = sc.nextInt();
		
		DIFERENCA = (a * b - c * d);
		
		System.out.println("A diferenca entre os produtos: " + DIFERENCA);
		
		sc.close();
		
	}

}

package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		/*Double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);*/
		
		/*char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x);*/
		
		String x;
		int y;
		Double z;
		
		System.out.println("Qual o seu nome? ");
		x = sc.next();
		System.out.println("Ola " + x + " é um prazer te conhecer!!");
		System.out.println(x + " Quantos anos você tem? ");
		y = sc.nextInt();
		System.out.println("Uau, eu tenho 21 anos");
		System.out.println("E qual sua altura?");
		z = sc.nextDouble();
		System.out.println("Eu tenho 1.79 :)\n\n");
		
		System.out.println("Seus dados: ");
		System.out.println("Nome: " + x);
		System.out.println("Idade: " + y);
		System.out.printf("Altura: %.2f", z);
		
		
		sc.close();
		
		
		/* Ler string = sc.next
		 * 
		 * Ler numeros inteiros = sc.nextInt
		 * 
		 * Ler ponto flutuante = sc.nextDouble 
		 * 
		 * Ler Texto até quebra de linha = sc.nextLine(); obs: se usar apenas o next ele vai ler
		 * somente a primeira palavra, não a linha inteira
		 * 
		 * Ler caractere = sc.next().char(0) -> lembrando que 0 é a primeira posição, EX: Julio -> J(0) u(1)
		 * obs: para considerar separador de decimais com ponto, ANTES da declaração do Scanner
		 * faça/; Locale.setDefault(Locale.US);*/
	}

}

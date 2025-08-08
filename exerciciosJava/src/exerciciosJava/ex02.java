package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da 
		 * área deste círculo com quatro casas decimais conforme exemplos.
		 * 
		Fórmula da área: area = π . raio ^2
		Considere o valor de π = 3.14159 */
		
		 /* A = Math.pow(x, y); -> Variavel A recebe o resultado de x elevado a Y
		 */
		
		double a, r, pi = 3.14159;
		
		System.out.println("Vamos calcular a area de um circulo!!");
		System.out.println("Digite o valor do raio: ");
		
		r = sc.nextDouble();
		
		a = pi * r * r ;
		
		System.out.printf("Area = %.4f%n", a);
		
		sc.close();

	}

}

package estruturaCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		//Encadeiamento de estruturas condicionais:
		
		System.out.println("Que horas são? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde");
		}
		else{
			System.out.println("Boa noite");
		}
		
		
		
		
		/*Estrutura condicional Composta:
		System.out.println("Que horas são? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else{
			System.out.println("Boa tarde");
		}*/
		
	
		//Estrutura condicional Simples:
		
		
		/*System.out.println("Bom dia");
		
		if(x > 0) {
			System.out.println("Boa tarde");
		}
		
		if(x < 0) {
			System.out.println("Boa noite");
		}*/
				
		sc.close();
	}
	
	// Regra: se condição for verdadeira -> executa bloco de comandos
	// se condição for falsa -> pula bloco de comandos

}

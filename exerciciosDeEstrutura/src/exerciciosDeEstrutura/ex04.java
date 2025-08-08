package exerciciosDeEstrutura;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 * sabendo que o mesmo podecomeçar em um dia e terminar em outro, tendo uma duração 
		 * mínima de 1 hora e máxima de 24 horas.*/ 
		
		Scanner sc = new Scanner(System.in);
		
		int hrInicial, hrFinal, duracao;
		
		System.out.println("Digite a hora inicial do jogo:");
		hrInicial = sc.nextInt();
		System.out.println("Digite a hora que o jogo terminou:");
		hrFinal = sc.nextInt();
		
		if(hrInicial < hrFinal) {
			duracao = hrFinal - hrInicial;
		}
		else {
			duracao = 24 - hrInicial + hrFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		 
		
		sc.close();
	}

}

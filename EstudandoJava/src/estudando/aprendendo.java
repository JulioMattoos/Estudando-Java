package estudando;

public class aprendendo {

	public static void main(String[] args) {
		
		double B, h, area, resultado;
		int a, b;
		
		
		a = 5;
		b = 2;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		//boa pratica: sempre que usar float e o numero for inteiro utilizar o .0, EX: 6.0
		//se utilizar float colocamos o "f" no final, EX: b = 6f;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);
		 
		//resultado = (double) a / b -> Casting = faz convesão de valores, a e b são inteiros 
		//resultado é quebrado então precisamos fazer isso para converter de inteiro para decimal
	}

}

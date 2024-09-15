package A01;

public class uchiha extends ninja {  //extends ninja = herança da classe ninja
	
	
	public void sharinhganAtivado() {
			System.out.println("Sharingan Ativado");	
		}
	
	
	@Override //Polimorfismo - Override quer dizer que o ninja uchiha pode jogar uma kunai "Normal" e do elemento fogo
	public void kunai() {
		System.out.println("Sou um ninja e posso jogar uma Kunai de FOGO");
	}
	
	public void kunai(int nivelChacra) {
		
		if(nivelChacra > 2) {
			System.out.println("Susano ativado");
		}else if(nivelChacra < 1) {
			System.out.print("Eu só consigo usar o Charingan");
		}else{
			System.out.print("Estou sem chacra");
		}
	}
	

}

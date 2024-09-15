package A01;

public class ninja extends a01 {
	
	private String nome;
	private String aldeia;
	private int idade;
	
	public void kunai() {
		System.out.println("Sou um ninja e posso jogar uma Kunai!");
	}
	
	
	//Criar geter para mostrar ao usuario
	
	public String getNome() {
		return nome;
	}
	
	
	//setter para setar valores a variavel
	
	public void setNome(String nome) {
		this.nome = nome;  //this para referencia que nome recebe nome declarado no metodo private.nome
	}


	int getIdade() {
		return idade;
	}



	void setIdade(int idade) {
		this.idade = idade;
	}



	private String getAldeia() {
		return aldeia;
	}



	private void setAldeia(String aldeia) {
		this.aldeia = aldeia;
	}

}

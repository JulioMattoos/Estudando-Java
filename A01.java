package A01;

public class a01 {

	public static void main(String[] args) {
		
		
		//obj 1
		uzumaki naruto = new uzumaki();
		naruto.setNome("Naruto Uzumaki");
		naruto.getNome();
		naruto.setIdade(16);
		naruto.getIdade();
		System.out.println("Meu nome é: " + naruto.getNome() + " e tenho " + naruto.getIdade() + " anos");
		naruto.temBiju = true;
		naruto.kunai();

		
		//obj 2
		uchiha julio = new uchiha();
		julio.setNome("Julio Mattos");
		julio.getNome();
		julio.setIdade(20);
		julio.getIdade();
		System.out.println("Meu nome é: " + julio.getNome() + " e tenho " + julio.getIdade() + " anos");
		julio.kunai();
		julio.kunai(1);
		
		
		
		
	}
	
	

}

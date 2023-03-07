package println_Vs_Printf_P2;

public class printlnVsPrintfP2 {
	

	public static void main(String[] args) {
		
		String nome = "Yuri Daniel";
		String sobrenome = "Uchoa Fernandes";
		int idade = 19;
		double peso = 69.87;
		
		System.out.println("Meu nome e " + nome + " " + sobrenome + " e tenho " + idade + " anos meu peso e " + peso);
		
		System.out.printf("Eu me chamo %s %s e tenho %d anos meu peso e %f %n",nome,sobrenome,idade,peso);
		

	}
}
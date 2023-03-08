package verificador_De_Idade;

public class verificador {
	
	public static void main(String[] args) {
		
		int idade = 16;
		String res = (idade >= 18)? "Maior de idade" : "Menor de idade";
		System.out.println(res);
		
		if(idade < 18) {
			System.out.println("Menor de idade");
		} else if(idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Idade invalida/Erro");
		}
	}

}

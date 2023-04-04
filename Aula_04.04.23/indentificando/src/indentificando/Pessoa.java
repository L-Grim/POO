package indentificando;

enum genero {HOMEM, MULHER}

public class Pessoa {
	
	genero genero;
	String nome;
	int idade;
	double peso;
	double altura;
	int CPF;
	String estado;
	String cidade;
	boolean vivo;
	
	void vivendo() {
		vivo = true;
	}
	
	void morto() {
		vivo = false;
	}
	
	String localizar() {
	String Localizacao = cidade + ", " + estado;
	return Localizacao;
		
	}
	
}

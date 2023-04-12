
public class Aluno {
	
	String nome;
	long matricula;
	int idade;
	
	//Construtor que inicializa todos os parametros da classe
	public Aluno(String atributo1, long atributo2, int atributo3) {
		nome = atributo1;
		matricula = atributo2;
		idade = atributo3;
	}
	
	// Outro que inicializa todos os parametros mas em ordem diferente
	public Aluno(int atributo1, long atributo2, String atributo3) {
		nome = atributo3;
		matricula = atributo2;
		idade = atributo1;
	}
	
	//Construtor que inicializa dois dos parametros da classe
	public Aluno(String atributo1, long atributo2) {
		nome = atributo1;
		matricula = atributo2;
	}
	
	//Construtor que inicializa so um parametro da classe 
	public Aluno(String atributo1) {
		nome = atributo1;
	}
	
}

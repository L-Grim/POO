package poo;

public class Aluno {
	
	String nome;
	long matricula;
	String curso;
	
	Turma turma;

	public Aluno(String nome, Turma turma) {
		this.nome = nome;
		this.turma = turma;
	}

	
}

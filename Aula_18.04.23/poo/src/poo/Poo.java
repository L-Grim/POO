package poo;

public class Poo {

	public static void main(String[] args) {
		
		Turma t1 = new Turma("LMC-3", "POO");
		Aluno al1 = new Aluno("Daniel", t1);
		Aluno al2 = new Aluno("Matheus", t1);
		Aluno al3 = new Aluno("Gesuis", t1);
		Aluno al4 = new Aluno("jose", t1);
		Aluno al5 = new Aluno("alquem", t1);
		
		t1.alunos[1] = al1;
		t1.alunos[2] = al2;
		t1.alunos[3] = al3;
		t1.alunos[4] = al4;
		t1.alunos[5] = al5;
		
	}

}

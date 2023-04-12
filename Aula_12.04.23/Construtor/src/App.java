
public class App {
	
	public static void main(String[] args) {
		// Forma de inicializar os dados que usamos ate agora
		// a1.nome = "Yuri Daniel";
		// a1.id = 100292
		// a1.idade = 19
		
		// Outra forma usando construtores
		Aluno a1 = new Aluno("Yuri Daniel", 100292l, 19);
		System.out.println("Nome : " + a1.nome);
		System.out.println("Matricula : " + a1.matricula);
		System.out.println("Idade : " + a1.idade );
		
		System.out.println("-----------------------------");
		
		Aluno a2 = new Aluno(24, 400561l, "Gezuis");
		System.out.println("Nome : " + a2.nome);
		System.out.println("Matricula : " + a2.matricula);
		System.out.println("Idade : " + a2.idade);
		
		System.out.println("-----------------------------");

		Aluno a3 = new Aluno("Mateus", 987654l);
		System.out.println("Nome : " + a3.nome);
		System.out.println("Matricula : " + a3.matricula);

	}

}

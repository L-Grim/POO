package agenda;

import contatos.Contato;

public class Agenda {
	
	contatos.Contato[] contatos;
	
	void inserir(Contato[] c) {
		contatos = c;
	}
	
	void listarContatos() {
		System.out.println(contatos);
	}


}

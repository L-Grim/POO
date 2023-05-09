package agenda;

import contatos.Contato;

public class Agenda {
	
	Contato contatos[] = new Contato[20];
	
	public void addContato(Contato contato, int index) {
		contatos[index] = contato;
	}
	
	public void listarContatos() {
		
		if (contatos.length == 0) {
			System.out.println("A agenda está vazia.");
		} else {
			System.out.println("------------------------------");
			for (int i = 0; i < contatos.length; i++) {
				System.out.println(contatos[i]);
				System.out.println("------------------------------");
			}
		}
	}
}
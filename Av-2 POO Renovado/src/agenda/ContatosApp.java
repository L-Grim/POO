package agenda;

import contatos.Contato;
import contatos.Endereco;
import contatos.Estado; 

public class ContatosApp {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco("Rua Pau Brasil", 210, 40720760, "Fortaleza", Estado.CE);
		Contato c1 = new Contato("Yuri Daniel", 96929657, "yuridaniel.uf@gmail.com", e1);
		
		Endereco e2 = new Endereco("Avenida Pau Brasil", 145, 70900890, "Fortaleza", Estado.CE);
		Contato c2 = new Contato("Matheus", 94568463, "matheus@gmail.com", e2);	
		
		Agenda a1 = new Agenda();
		a1.contatos[1] = c1;
		a1.contatos[2] = c2;
		
		a1.listarContatos();
		}

}

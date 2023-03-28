public class Enum {

	enum Semana {Segunda, Terça, Quarta, Quinta, Sexta, Sabado, Domingo};
	
	public static void main(String[] args) {
		
		Semana[] dias = {Semana.Segunda, Semana.Terça, Semana.Quarta, Semana.Quinta, Semana.Sexta, Semana.Sabado, Semana.Domingo};
		
		for (Semana semana : dias) {
			System.out.println(semana);
			
		};
		
	}
	
}	

public class Matriz_meses {
	
	public static void main(String[] args) {
		
		// Declarando Array vazio com 12 espaços.
		String[] meses = new String[12];
		
		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Março";
		meses[3] = "Abril";
		meses[4] = "maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		// Usando forech.
		for (String mes : meses) {       //		 //		for(<Tipo> <Variavel> : <Nome Array>) {
										 //		 //		
			System.out.println(mes);	 //  OU  //			System.out.println(Variavel)
										 //		 //		
		}								 //		 //		}
		
		//	Outra forma de fazer o loop.
		//		for(int x = 0; x < 12; x++) {
		//			
		//			System.out.println(meses[x]);
		//
		//		}										
		
	}

}

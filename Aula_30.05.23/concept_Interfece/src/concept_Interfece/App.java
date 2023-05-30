package concept_Interfece;

public class App {

	public static void main(String[] args) {

		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		PetShop p1 = new PetShop();
		
		p1.animais_add(g1);
		p1.animais_add(c1);
		
		p1.alimentar(p1.animais);
		
	}

}

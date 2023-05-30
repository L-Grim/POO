package concept_Interfece;

import java.util.ArrayList;

public class PetShop {
	
	ArrayList<Animal> animais = new ArrayList<Animal>();
	
	void animais_add(Animal a) {
		animais.add(a);
	}
	
	public void alimentar(ArrayList<Animal> a) {
		for (Animal animal : a) {
			animal.comer();
		}
	}
 
	public void alimentar (Animal a) {
		a.comer();
	}
	
}

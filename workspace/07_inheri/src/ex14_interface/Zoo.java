package ex14_interface;

public class Zoo {

	private Animal[] animals;
	private int index;
	
	public Zoo(int animalCount) {
		animals=new Animal[animalCount];
	}
	
	
	public void AddAnimal(Animal animal) {
		if(index<animals.length) {
			animals[index]=animal;
		}
	}
	
	public void info() {
		for(Animal animal : animals) {
			if(animal!=null) {
				animal.move();
			}
			
		}
	}
	
}

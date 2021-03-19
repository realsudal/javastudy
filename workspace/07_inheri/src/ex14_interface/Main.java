package ex14_interface;

public class Main {

	public static void main(String[] args) {

		Zoo zoo=new Zoo(10);
		zoo.AddAnimal(new Lion());
		zoo.AddAnimal(new Eagle());
		zoo.AddAnimal(new Shark());
		//zoo.AddAnimal(Lion());
		
		zoo.info();
	}

}

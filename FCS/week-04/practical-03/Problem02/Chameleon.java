public class Chameleon extends Animal {

	//No-parameter construction
	public Chameleon() {}

	//Constructor with parameters
	public Chameleon(String name, double weight, String favouriteFood, int age) {
		super(name,weight,favouriteFood,age);
	}

	//make sound methods
	public void makeSound() {
		System.out.println("Hiss~");
	}

}
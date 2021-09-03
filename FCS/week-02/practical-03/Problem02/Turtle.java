public class Turtle extends Animal {

	//No-parameter construction
	public Turtle() {}

	//Constructor with parameters
	public Turtle(String name, double weight, String favouriteFood, int age) {
		super(name,weight,favouriteFood,age);
	}

	//methods
	public void makeSound() {
		System.out.println("Chirps~");
	}

}
public class Lion extends Animal {

	//No-parameter construction
	public Lion() {}

	//Constructor with parameters
	public Lion(String name, double weight, String favouriteFood, int age) {
		super(name,weight,favouriteFood,age);
	}

	//methods
	public void makeSound() {
		System.out.println("Growl~");
	}

}
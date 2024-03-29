public class Animal {

	private String name;
	private double weight;
	private String favouriteFood;
	private int age;

	//No-parameter construction
	public Animal() {}

	//Constructor with parameters
	public Animal(String name, double weight, String favouriteFood, int age) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		this.age = age;
	}

	//get and set method
	public String getNmae() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
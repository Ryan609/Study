public class PhysicalBook extends Book {

	private int shelf;
	private int aisle;
	private int floor;

	//No-parameter construction
	public PhysicalBook() {}

	//Constructor with parameters
	public PhysicalBook(String title, int year, String publish, int pages, int shelf, int aisle, int floor) {
		super(title,year,publish,pages,shelf,aisle,floor);
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
	}

	//get and set
	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	//Definition method
	public void displayBookLocation() {
		System.out.println("BookLocation: " + getShelf + getAisle + getFloor);
	}

	
}
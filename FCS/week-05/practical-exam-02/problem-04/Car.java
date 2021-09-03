//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: S1
// Year:2021
// Practical Exam Number: 02
//===================================

public class Car {

	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;
	
	//No-parameter construction
	public Car() {}

	//constructor with parameters
	public Car(String model, int numGears, float literTank, int yearManufacture) {
		this.model = model;
		this.numGears = numGears;
		this.literTank = literTank;
		this.yearManufacture = yearManufacture;
	}

	//get and set
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	public float getLiterTank() {
		return literTank;
	}

	public void setLiterTank(float literTank) {
		this.literTank = literTank;
	}

	public int getYearManufacture() {
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
}
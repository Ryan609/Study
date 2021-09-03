//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: s1
// Year: 2021
// Practical Exam Number: 03
//===================================

public abstract class Tool implements Asset {

	public float weight;
	public float value;

	//No-parameter construction method
	public Tool() {}

	//Constructor with parameters
	public Tool(float weight, float value) {
		this.weight = weight;
		this.value = value;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setValue(float value) {
		this.value = value;
	}

	//Rewrite method
	@Override
	public float getValue() {
		return value;
	}

	//abstract method useTool
	public abstract void useTool(int number);
}
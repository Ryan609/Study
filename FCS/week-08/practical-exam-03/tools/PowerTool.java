//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: s1
// Year: 2021
// Practical Exam Number: 03
//===================================
public abstract class PowerTool extends Tool {

	public int power;

	//No-parameter construction method
	public PowerTool() {}
	//Constructor with parameters
	public PowerTool(float weight, float value, int power) {
		super(weight, value);
		this.power = power;
	}

	//get and set method
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
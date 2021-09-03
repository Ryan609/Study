//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: s1
// Year: 2021
// Practical Exam Number: 03
//===================================
public abstract class HandTool extends Tool {

	public boolean sharp;

	//No-parameter construction method
	public HandTool() {}

	//Constructor with parameters
	public HandTool(float weight, float value, boolean sharp) {
		super(weight, value);
		this.sharp = sharp;
	}

	public boolean getSharp() {
		return sharp;
	}

	public void setSharp(boolean sharp) {
		this.sharp = sharp;
	}
	//is Sharp method
	public boolean isSharp() {
		return sharp;
	}
}
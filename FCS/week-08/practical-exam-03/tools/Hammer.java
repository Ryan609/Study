//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: s1
// Year: 2021
// Practical Exam Number: 03
//===================================
public class Hammer extends HandTool {

	//No-parameter construction method
	public Hammer() {}

	//Constructor with parameters
	public Hammer(float weight, float value) {
		super(weight, value, false);
	} 

	//Rewrite method
	@Override
	public void useTool(int number) {
		//Use a for loop to traverse the number of uses
		for (int i = 0; i < number; i++) {
			if (value >= 0) {
				value -= 0.01f;
			} 
		}
		//print text Bang!
		System.out.println("Bang!");
	}
}
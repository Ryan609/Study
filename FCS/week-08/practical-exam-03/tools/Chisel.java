//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: s1
// Year: 2021
// Practical Exam Number: 03
//===================================
public class Chisel extends HandTool {

	//No-parameter construction method
	public Chisel() {}

	//Constructor with parameters
	public Chisel(float weight, float value) {
		super(weight, value, true);
	}

	//Rewrite method
	@Override
	public void useTool(int number) {
		//Use a for loop to traverse the number of uses
		for (int i = 0; i < number; i++) {
			if (value >= 0) {
				value -= 0.02f;
			} 
		}
		//print text Scrape
		System.out.println("Scrape");

	}

}
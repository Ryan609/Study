public class Student extends Person {

	private double[] marks;
	private String[] disciplines;

	//No-parameter construction
	public Student() {}

	//Constructor with parameters
	public Student(String givenName, String lastName, int age, String gender, 
					String citizenShip, double[] marks, String[] disciplines) {

		super(givenName,lastName,age,gender,citizenShip);
		this.marks = marks;
		this.disciplines = disciplines;
	}

	//get and set.
	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines
	}

	//methods
	//averageMarks methods
	public double averageMarks() {
		double sum = 0;
		double average = 0;
		for (i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		average = sum/marks.length;
		return average;
	}

	//display disciplines methods
	public void displayDisciplines() {
		System.out.print("Disciplines: [")
		//Use a for loop to print subjects in order
		for (i = 0; i < disciplines.length; i++) {
			//Determine whether it is the last data
			if (i = disciplines.length - 1) {
				System.out.print(disciplines[i]);
			} else {
				System.out.print(disciplines[i] + ",");
			}
		}
		System.out.println("]");
	}


}
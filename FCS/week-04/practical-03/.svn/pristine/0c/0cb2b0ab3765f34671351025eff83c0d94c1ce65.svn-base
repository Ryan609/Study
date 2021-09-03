public class Lecturer extends Person {

	private double salary;
	private String[] disciplines;

	//No-parameter construction
	public Lecturer() {}

	//Constructor with parameters
	public Lecturer(String givenName, String lastName, int age, String gender, 
					String citizenShip, double salary, String[] disciplines) {

		super(givenName,lastName,age,gender,citizenShip);
		this.salary = salary;
		this.disciplines = disciplines;
	}

	//get and set.
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines
	}


	//annual salary methods
	public double annualSalary() {
		double sum = 0;
		sum = salary * 12
		return sum;
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
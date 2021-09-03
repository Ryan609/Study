import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Student {

	private String name;
	private int physic;
	private int chemistry;
	private int math;
	private double average;

	//No-argument constructor
	public Student() {}
	//Constructor with parameters
	public Student(String name, int physic, int chemistry, int math) {
		this.name = name;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
		this.average = (this.physic + this.chemistry + this.math) / 3;
	}
	//get and set method
	public String getName () {
		return this.name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getPhysic () {
		return this.physic;
	}

	public void setPhysic (int physic) {
		this.physic = physic;
	}

	public int getChemistry () {
		return this.chemistry;
	}

	public void setChemistry (int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath () {
		return this.math;
	}

	public void setMath (int math) {
		this.math = math;
	}

	public double getAverage () {
		return this.average;
	}

	public void setAverage () {
		this.average = (this.physic + this.chemistry + this.math) / 3;
	}
	//Create the sortstudent method
	public static Student[] sortStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1-i; j++) {
				//Determine whether the current student's average mark is lower than the next student
				if (students[j].getAverage() < students[j+1].getAverage()) {
					//if true，call swap method to swap element
					swap(students, j, j+1);
					//If the average mark are equal, use the physic mark to judge
				} else if (students[j].getAverage() == students[j+1].getAverage()) {
					if (students[j].getPhysic() < students[j+1].getPhysic()) {
						//if true，call swap method to swap element
						swap(students, j, j+1);
						//If the physic mark are equal, use the chemistry mark to judge
					} else if (students[j].getPhysic() == students[j+1].getPhysic()) {
						if (students[j].getChemistry() < students[j+1].getChemistry()) {
							//if true，call swap method to swap element
							swap(students, j, j+1);
							//If the chemistry mark are equal, use the math mark to judge
						} else if (students[j].getChemistry() == students[j+1].getChemistry()) {
							if (students[j].getMath() < students[j+1].getMath()) {
								//if true，call swap method to swap element
								swap(students, j, j+1);
							}
						}	
					}	
				}
			}
		}
		//return result
		return students;
	}

	//Define the swap method
	private static void swap(Student[] students, int i, int j) {
		Student temp = students[j];
		students[j] = students[i];
		students[i] = temp;
	}

}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main extends Student {
	public static void main(String[] args) {
		/*
		Call the read date method to read the file named "students.txt". 
		And stored in the student array
		*/
		Student[] students = readDate("students.txt");
		//Call the sortstudent method to sort the data
		sortStudents(students);
		System.out.println("Sorted students list :");
		//Call the printstudent method to print out the sorted data
		printStudents(students);

	}

	//Create a read date method and return the data
	private static Student[] readDate(String filename) {
		//Create an array to store data
		Student[] students = null;

		try {
			//Create a collection object to student information.
			ArrayList<Student> array = new ArrayList<>();
			//Create a scanner object for scanning files
			Scanner sc = new Scanner(new File(filename));
			int index = 0;	//Define the number of people stored in the index

			//Use the while loop to determine the line break
			while (sc.hasNext()) {
				String line[] = sc.nextLine().trim().split(" "); //read the line
				//Read each row of data in order
				String name = line[0];
				int physic = Integer.parseInt(line[1]);
				int chemistry = Integer.parseInt(line[2]);
				int math = Integer.parseInt(line[3]); 
				//Store the read data in an array
				array.add(new Student(name, physic, chemistry, math));
			}
			sc.close();	//Close file
			//use for loop arraylist converted to student array
			students = new Student[array.size()];
			for (int i = 0; i < array.size(); i++) {
				students[i] = array.get(i);
			}
		//Catch the error message and exit the program
		} catch (FileNotFoundException e) {
			System.out.println("File error " + filename);
			System.exit(0);
		}
		return students;
	}

	//Create printstudent method
	public static void printStudents(Student[] students) {
		//Print the first row of headings
		System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Student","AverageScore","Physic","Chemistry","Math");
		//Print stored data
		for (Student s:students) {
			System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",s.getName(),s.getAverage(),s.getPhysic(),s.getChemistry(),s.getMath());
		}
	}


}
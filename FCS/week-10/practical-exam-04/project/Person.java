/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/
public abstract class Person{
	protected String name;
	protected int age;
	
	Person(){
		this.name = "unnamed";
		this.age = 0;
	}

	/* implement accessors and mutators */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
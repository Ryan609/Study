public class Student {
	String name;
	int age;
	int period;

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.period = 0;
	}

	public Student(String tmpName, int tmpAge, int tmpPeriod) {
		this.name = tmpName;
		this.age = tmpAge;
		this.period = tmpPeriod;
	}

	public void printStudent() {
		System.out.println("Printing student record");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Period: " + this.period);
	}


    // mutators
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setPeriod(int period){
        this.period = period;
    }
    // accessors
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    int getPeriod(){
        return this.period;
    }
}
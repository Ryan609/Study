public class Student {
	private String name;
	private int age;
	private int period;

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
		System.out.println("Name:   " + getName());
		System.out.println("Age:    " + getAge());
		System.out.println("Period: " + getPeriod());

	}

	// mutators
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPeriod(int period){
        this.period = period;
    }
    // accessors
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getPeriod(){
        return this.period;
    }


}
/*==================================
Foundations of Computer Science
Student: Xinyan Wu
id: a1809534
Semester: s1
Year: 2021
Final Exam
===================================*/

public class Person {
    private String name;
    private int age;

    // Base constructor
    public Person() {
        this.name = "anon";
        this.age = 0;
    }

    // Parameters Constructor 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get and set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Create toString method
    public String toString() {
        //return text and value.
        return "Person: " + getName() + " is age: " + getAge();
    }

    
}
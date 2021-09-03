//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: S1
// Year:2021
// Practical Exam Number: 02
//===================================

public class Character {

	private String name;
	private int age;
	private String gender;
	private String occupation;
	private String familyRole;
	private float rate;

	//No-parameter construction
	public Character() {}

	//constructor with parameters
	public Character(String name, int age, String gender, String occupation, String familyRole, float rate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.familyRole = familyRole;
		this.rate = rate;
	}

	//get and set
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getFamilyRole() {
		return familyRole;
	}

	public void setFamilyRole(String familyRole) {
		this.familyRole = familyRole;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
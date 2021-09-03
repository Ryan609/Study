public class Patient extends Person {

	private String diagnostic;
	private String inTime;
	private String prevTime;

	//No-parameter construction
	public Patient() {}

	//Constructor with parameters
	public Patient(String givenName, String lastName, int age, String gender, 
					String citizenShip, String diagnostic, String inTime, String prevTime) {

		super(givenName,lastName,age,gender,citizenShip);
		this.diagnostic = diagnostic;
		this.inTime = inTime;
		this.prevTime = prevTime;
	}

	//get and set.
	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime
	}

	public String getPrevTime() {
		return prevTime;
	}

	public void setPrevTime(String inTime) {
		this.prevTime = prevTime
	}




}
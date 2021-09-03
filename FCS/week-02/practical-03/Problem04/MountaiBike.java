public class MountaiBike extends Bicycle {

	private String suspension;
	private String forks;

	//No-parameter construction
	public MountaiBike() {}
	//Constructor with parameters
	public MountaiBike(String color, int year, int numberGear,boolean is_serviced, String inDate, 
						String outDate, String serviceResponsible, String suspension, String forks) {

		super(color,year,numberGear,is_serviced,inDate,outDate,serviceResponsible);
		this.suspension = suspension;
		this.forks = forks;
	}
	
	//get and set 
	public String getSuspension() { return suspension; }
	public void setSuspension(String suspension) { this.suspension = suspension; }

	public String getForks() { return forks; }
	public void setForks(String forks) { this.forks = forks; }



}
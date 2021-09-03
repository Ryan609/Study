public class ElectricBike extends Bicycle {

	private String battery;

	//No-parameter construction
	public ElectricBike() {}
	//Constructor with parameters
	public ElectricBike(String color, int year, int numberGear,boolean is_serviced, 
						String inDate, String outDate, String serviceResponsible, String battery) {
		super(color,year,numberGear,is_serviced,inDate,outDate,serviceResponsible);
		this.battery = battery;
	}

	//get and set 
	public String getBattery() { return battery; }
	public void setBattery(String battery) { this.battery = battery; }

	//Definition method
	public void chargeBike() {

	}
}
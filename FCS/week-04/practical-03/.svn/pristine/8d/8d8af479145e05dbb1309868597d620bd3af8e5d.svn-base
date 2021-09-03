import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		//Create a collection object to store vehicle information
		ArrayList<ElectricBike> array = new ArrayList<ElectricBike>();
		ArrayList<MountaiBike> array1 = new ArrayList<MountaiBike>();
		ArrayList<RoadBike> array2 = new ArrayList<RoadBike>();
		ArrayList<Hibrid> array3 = new ArrayList<Hibrid>();

		//Return to the main interface again with loop completion
		while (true) {
			//Write the main interface with output statements
			System.out.println("-----Welcome to the Store-----");
			System.out.println("1: Add repair information");
			System.out.println("2: View information");
			System.out.println("3: exit");
			System.out.println("------------------------------");

			//Use scanner to enter data by keyboard
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();

			//Use switch statement to complete the choice of operation
			switch (line) {
				case "1":
					//Choose vehicle type
					System.out.println("Add repair information");
					System.out.println("1. ElectricBike");
					System.out.println("2. MountainBike");
					System.out.println("3. RoadBike");
					System.out.println("4. Hibrid");
					System.out.println("-----------------------");
					//Determine the type of choice
					int chioce = sc.nextInt();
					if(chioce == 1) {
						addEInformation(array);
					} else if (chioce == 2) {
						addMInformation(array1);
					} else if (chioce == 3) {
						addRInformation(array2);	
					} else if (chioce == 4) {
						addHInformation(array3);
					}
					break;
				case "2":
					//Choose vehicle type
					System.out.println("View information");
					System.out.println("1. ElectricBike");
					System.out.println("2. MountainBike");
					System.out.println("3. RoadBike");
					System.out.println("4. Hibrid");
					System.out.println("----------------");
					//Determine the type of choice
					int chioce1 = sc.nextInt();
					if(chioce1 == 1) {
						findEInformation(array);
					} else if (chioce1 == 2) {
						findMInformation(array1);
					} else if (chioce1 == 3) {
						findRInformation(array2);
					} else if (chioce1 == 4) {
						findHInformation(array3);
					}
					break;
				case "3":
					System.out.println("Thank you");
					System.exit(0);
			}
		}
	}

	//Define a method for add ElectricBike information
	public static void addEInformation(ArrayList<ElectricBike> array) {
		//Enter the data required by the vehicle object, display a prompt message, and enter
		Scanner sc = new Scanner(System.in);
		//Create an ElectricBike object, and assign the entered data to the member variables of the ElectricBike object
		ElectricBike a = new ElectricBike();
		System.out.println("Please enter vehicle information");
		System.out.print("color: ");
		a.setColor(sc.nextLine());
		System.out.print("year: ");
		a.setYear(sc.nextInt());
		System.out.print("numberGears: ");
		a.setNumberGears(sc.nextInt());
		System.out.print("is_serviced(True or False): ");
		a.setIs_serviced(sc.nextBoolean());
		sc.nextLine();
		System.out.print("inDate: ");
		a.setInDate(sc.nextLine());
		System.out.print("outDate: ");
		a.setOutDate(sc.nextLine());
		System.out.print("serviceResponsible: ");
		a.setServiceResponsible(sc.nextLine());
		System.out.print("Battery (is it normal): ");
		a.setBattery(sc.nextLine());

		//Add the ElectricBike object to the array
		array.add(a);
		System.out.println("Added successfully");
	}
	//Define a method for find ElectricBike information
	public static void findEInformation(ArrayList<ElectricBike> array) {
		//Display information
		System.out.println("color\tyear\tnumberGears\tis_serviced\tinDate\toutDate\tserviceResponsible\tBattery");
		//Take out the data in the array and display it in the corresponding format
		for(int i = 0; i < array.size(); i++) {
			ElectricBike a = array.get(i);
			System.out.println(a.getColor()+"\t"+a.getYear()+"\t"+a.getNumberGears()+"\t\t"+a.getIs_serviced()+"\t\t"+a.getInDate()+"\t"+
								a.getOutDate()+"\t"+a.getServiceResponsible()+"\t\t\t"+a.getBattery());

		}
	}

	//Define a method to add MountainBike vehicle information
	public static void addMInformation(ArrayList<MountaiBike> array1) {
		//Enter the data required by the vehicle object, display a prompt message, and enter
		Scanner sc = new Scanner(System.in);
		//Create an MountaiBike object, and assign the entered data to the member variables of the MountaiBike object
		MountaiBike b = new MountaiBike();
		System.out.println("Please enter vehicle information");
		System.out.print("color: ");
		b.setColor(sc.nextLine());
		System.out.print("year: ");
		b.setYear(sc.nextInt());
		System.out.print("numberGears: ");
		b.setNumberGears(sc.nextInt());
		System.out.print("is_serviced(True or False): ");
		b.setIs_serviced(sc.nextBoolean());
		sc.nextLine();
		System.out.print("inDate: ");
		b.setInDate(sc.nextLine());
		System.out.print("outDate: ");
		b.setOutDate(sc.nextLine());
		System.out.print("serviceResponsible: ");
		b.setServiceResponsible(sc.nextLine());
		System.out.print("suspension: ");
		b.setSuspension(sc.nextLine());
		System.out.print("forks: ");
		b.setForks(sc.nextLine());

		//Add the MountaiBike object to the array1
		array1.add(b);
		System.out.println("Added successfully");
	}
	//Define a method to find MountainBike vehicle information
	public static void findMInformation(ArrayList<MountaiBike> array1) {
		//Display information
		System.out.println("color\tyear\tnumberGears\tis_serviced\tinDate\toutDate\tserviceResponsible\tsuspension\tforks");
		//Take out the data in the array and display it in the corresponding format
		for(int i = 0; i < array1.size(); i++) {
			MountaiBike b = array1.get(i);
			System.out.println(b.getColor()+"\t"+b.getYear()+"\t"+b.getNumberGears()+"\t\t"+b.getIs_serviced()+"\t\t"+b.getInDate()+"\t"+
								b.getOutDate()+"\t"+b.getServiceResponsible()+"\t\t\t"+b.getSuspension()+"\t\t"+b.getForks());

		}
	}

	//Define a method to add RoadBike vehicle information
	public static void addRInformation(ArrayList<RoadBike> array2) {
		//Enter the data required by the vehicle object, display a prompt message, and enter
		Scanner sc = new Scanner(System.in);
		//Create an RoadBike object, and assign the entered data to the member variables of the RoadBike object
		RoadBike c = new RoadBike();
		System.out.println("Please enter vehicle information");
		System.out.print("color: ");
		c.setColor(sc.nextLine());
		System.out.print("year: ");
		c.setYear(sc.nextInt());
		System.out.print("numberGears: ");
		c.setNumberGears(sc.nextInt());
		System.out.print("is_serviced(True or False): ");
		c.setIs_serviced(sc.nextBoolean());
		sc.nextLine();
		System.out.print("inDate: ");			
		c.setInDate(sc.nextLine());
		System.out.print("outDate: ");
		c.setOutDate(sc.nextLine());			
		System.out.print("serviceResponsible: ");
		c.setServiceResponsible(sc.nextLine());
		System.out.print("tyres: ");
		c.setTyres(sc.nextLine());

		//Add the RoadBike object to the array2
		array2.add(c);
		System.out.println("Added successfully");
	}
	//Define a method to find RoadBike vehicle information
	public static void findRInformation(ArrayList<RoadBike> array2) {
		//Display information
		System.out.println("color\tyear\tnumberGears\tis_serviced\tinDate\toutDate\tserviceResponsible\ttyres");
		//Take out the data in the array and display it in the corresponding format
		for(int i = 0; i < array2.size(); i++) {
			RoadBike c = array2.get(i);
			System.out.println(c.getColor()+"\t"+c.getYear()+"\t"+c.getNumberGears()+"\t\t"+c.getIs_serviced()+"\t\t"+c.getInDate()+"\t"+
								c.getOutDate()+"\t"+c.getServiceResponsible()+"\t\t\t"+c.getTyres());

		}
	}

	//Define a method to add HibridBike vehicle information
	public static void addHInformation(ArrayList<Hibrid> array3) {
		//Enter the data required by the vehicle object, display a prompt message, and enter
		Scanner sc = new Scanner(System.in);
		//Create an HibridBike object, and assign the entered data to the member variables of the HibridBike object
		Hibrid d = new Hibrid();
		System.out.println("Please enter vehicle information");
		System.out.print("color: ");
		d.setColor(sc.nextLine());
		System.out.print("year: ");
		d.setYear(sc.nextInt());
		System.out.print("numberGears: ");
		d.setNumberGears(sc.nextInt());
		System.out.print("is_serviced(True or False): ");
		d.setIs_serviced(sc.nextBoolean());
		sc.nextLine();
		System.out.print("inDate: ");
		d.setInDate(sc.nextLine());
		System.out.print("outDate: ");
		d.setOutDate(sc.nextLine());
		System.out.print("serviceResponsible: ");
		d.setServiceResponsible(sc.nextLine());
		System.out.print("suspension: ");
		d.setSuspension(sc.nextLine());

		//Add the RoadBike object to the array2
		array3.add(d);
		System.out.println("Added successfully");
	}

	//Define a method to add HibridBike vehicle information
	public static void findHInformation(ArrayList<Hibrid> array3) {
		//Display information
		System.out.println("color\tyear\tnumberGears\tis_serviced\tinDate\toutDate\tserviceResponsible\tsuspension");
		//Take out the data in the array and display it in the corresponding format
		for(int i = 0; i < array3.size(); i++) {
			Hibrid d = array3.get(i);
			System.out.println(d.getColor()+"\t"+d.getYear()+"\t"+d.getNumberGears()+"\t\t"+d.getIs_serviced()+"\t\t"+d.getInDate()+"\t"+
								d.getOutDate()+"\t"+d.getServiceResponsible()+"\t\t\t"+d.getSuspension());

		}
	}


}
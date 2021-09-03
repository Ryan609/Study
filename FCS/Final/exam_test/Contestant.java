
public class Contestant extends MyMean {
	private String name;
	private String suburb;
	private int age;
    private double[] skils;

    public Contestant(String name, String suburb, int age) {
        this.name = name;
        this.suburb = suburb;
        this.age = age;
    }
 
	public Contestant(String name, String suburb, int age, double[] skils) {
        this.name = name;
        this.suburb = suburb;
        this.age = age;
        this.skils = skils;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSkils() {
        return skils;
    }

    public void setSkils(double[] skils) {
        this.skils = skils;
    }

    @Override
    public double getMean() {
		return ((skils[0] + skils[1] + skils[2]+skils[3]+skils[4])/5);
	}
}
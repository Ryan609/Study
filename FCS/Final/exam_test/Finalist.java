import java.text.DecimalFormat;
public class Finalist extends Contestant {
    private String moto;

    public Finalist(String name, String suburb, int age, String moto) {
        super(name, suburb, age);
        this.moto = moto;
    }

    public Finalist(String name, String suburb, int age, double[] skils, String moto) {
        super(name, suburb, age, skils);
        this.moto = moto;
	}

    public String getMoto() {
        return moto;
    }
    public void setMoto(String moto) {
        this.moto = moto;
    }

    public void display() {
        System.out.println("------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Suburb: " + getSuburb());
        System.out.println("Age: " + getAge());
        System.out.println("Moto: " + getMoto());
        System.out.println("---------Skils----------");
        double[] skils = getSkils();
        System.out.println("Balance: " + skils[0]);
        System.out.println("Jump: " + skils[1]);
        System.out.println("Coordination: " + skils[2]);
        System.out.println("Strength: " + skils[3]);
        System.out.println("Aesthetics: " + skils[4]);
        System.out.println("Mean: " + getMean());
        System.out.println("------------------------");
    }   
}
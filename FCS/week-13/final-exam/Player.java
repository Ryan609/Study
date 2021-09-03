/*==================================
Foundations of Computer Science
Student: Xinyan Wu
id: a1809534
Semester: s1
Year: 2021
Final Exam
===================================*/

public class Player extends Person {
    private int id;
    private int numWins;
    private int numPlayed;
    static int numId = 0;

    //Base constructor
    public Player() {

    }
    
    //Parameters Constructor
    public Player(String name, int age, int numWins, int numPlayed) {
        super(name, age);
        this.numWins = numWins;
        this.numPlayed = numPlayed;
        this.id = ++numId;
    }

    //get and set Methods.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }

    public int getNumPlayed() {
        return numPlayed;
    }

    public void setNumPlayed(int numPlayed) {
        this.numPlayed = numPlayed;
    }

    //Creat win method.
    public void win() {
        setNumWins(getNumWins() + 1);
        setNumPlayed(getNumPlayed() + 1);
    }

    //Creat lose method.
    public void lose() {
        setNumPlayed(getNumPlayed() + 1);
    }

    //Creat getRanking methods.
    public int getRanking() {
        // If the player is zero, return 0 directly
        if (getNumPlayed() == 0) {
            return 0;
            // If it is not 0, calculate the result according to the formula and return
        } else {
            return getNumPlayed() * (getNumWins() / getNumPlayed());
        }
    }

    //creat toString method.
    public String toString() {
        //ruturn name, age,id and Rank.
        return super.toString() + " Id: " + this.id + " Ranking: " + getRanking();
    }

    


}

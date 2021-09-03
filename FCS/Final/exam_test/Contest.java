import java.util.LinkedList;

public class Contest {
    private final int MAX_NUMBER = 5;
    private LinkedList<Finalist> finalists;

    public Contest() {
        this.finalists = new LinkedList<>();
    }

    public void addFinalist(Finalist finalist) {
        finalists.add(finalist);
        if (finalists.size() > MAX_NUMBER) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void sortFinalist() {
        Finalist temp;
        for (int i = 0; i < finalists.size(); i++) {
            for (int j = 0; j < finalists.size(); j++) {
                if (finalists.get(i).getMean() > finalists.get(j).getMean()) {
                    temp = finalists.get(i);
                    finalists.set(i, finalists.get(j));
                    finalists.set(j, temp);
                }
            }
        }
    }

    public void printFinalists() {
        for (int i = 0; i < finalists.size(); i++) {
            
            System.out.println();
            finalists.get(i).display();
            
        }
    }


}

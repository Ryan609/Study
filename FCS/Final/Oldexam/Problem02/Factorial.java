public class Factorial {

    public int find(int x) {
        if (x < 0) {
            throw new UnsupportedOperationException("No defined");
        } else if (x == 0 || x == 1) {
                return 1;
        }   
        return x * find(x - 1);      
    }
}

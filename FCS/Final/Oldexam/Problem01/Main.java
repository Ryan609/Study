public class Main {
    public static void main(String[] args) {
        BasicProgram b = new BasicProgram();

        System.out.println(b.sum(5,10));
        System.out.println(b.div(20,3));
        int[] array = {1,2,3,6,8};
        b.displayArray(array);
    }
}

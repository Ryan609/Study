import java.lang.*;
import java.nio.channels.UnsupportedAddressTypeException;

public class BasicProgram {

    public int sum(int a, int b) {
        return a + b;
    }

    public double div(int a, int b) {
        //double num;
        if (b == 0) {
            throw new UnsupportedOperationException("Not possible division by zero");
        } else {
            //num = a / b;
            return a / b;
        }
    }

    public void displayArray(int[] array) {
        if (array.length == 0) {
            throw new UnsupportedOperationException("No elements");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + ",");
                }
            }
            System.out.println("]");
        }
    }

}

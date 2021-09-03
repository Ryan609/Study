public class DataStructure implements Struturable {
    
    //@Override
    public int[] sort(int[] array) {
        if (array.length == 0) {
            throw new UnsupportedOperationException("No elements");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] < array[j+1]) {
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
        }
        return array;
    }

    //@Override
    public int ssearch(String[] array, String value) {

    }
}

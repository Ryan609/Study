import java.util.Random;

public class Problem02{
    public static void main(String[] args) {
        //Create an object.
        Random number = new Random();
           int sum = 0;

        //Use loop to get 10 random numbers within 20
        for(int i = 1; i < 11; i++) {
            int num = number.nextInt(20);
            //Print out the random number obtained
            System.out.print("Number " + num + ": " ); 
            sum += num;

            /*Use nested loops to obtain symbols equal to 
            the number of random numbers*/
            for (int star = 0; star < num; star++){
                System.out.print( "*");  
            }
                System.out.println();
        }
        
            //Calculate and print out the average
            int mean = sum/10;
            System.out.print("Average " + mean + ": " ); 
            //Use nested loops to get a sign equal to the average
            for (int star = 0; star < mean; star++){
                System.out.print( "*");  
            }
                System.out.println();
    }
}
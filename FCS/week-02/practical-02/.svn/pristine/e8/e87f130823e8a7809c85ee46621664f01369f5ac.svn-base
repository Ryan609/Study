import java.util.Random;

public class Problem05{
    public static void main(String[] args) {

	//Create an object.
        Random number = new Random();
	int sum = 0;
		
        //Use loop to get 10 random numbers within 20
	for(int i = 1; i < 11; i++) {
	    int num = number.nextInt(20);
            //Print out the random number obtained
	    System.out.print("Number " + num + ": ");
	    sum += num;

            /*Use nested loops to obtain symbols equal to 
            the number of random numbers*/
	    for(int sign = 0; sign < num; sign++) {

                /*Use siwitch statements to divide random numbers 
                in different ranges and Use different symbols*/
                switch(num){
                    //o, for numbers between (0,5];   
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.print("o");
                        break;
                    //x, for numbers between (5, 10];
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        System.out.print("x");
                        break;
                    //s, for numbers between (10, 15];    
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        System.out.print("s");
                        break;
                    //*, for numbers bigger than 15;    
                    default:
                        System.out.print("*");
                }
	    }
		    System.out.println();
	}
            //Calculate and print out the average
	    int mean = sum/10;
	    System.out.print("Average " + mean + ": ");
            //Use nested loops to get a sign equal to the average
	    for (int sign = 0; sign < mean; sign++) {
		System.out.print( "*");	
	    }
		System.out.println();
    }
}

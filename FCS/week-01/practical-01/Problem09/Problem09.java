import java.util.Scanner;

class Problem09 {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
         //Print text on the screen and get the String type entered by the user
         System.out.print("Please enter dog's name: "); 
         String name = input.nextLine();

         //Print text on the screen and get the int type entered by the user
         System.out.print("Please enter dog's age: "); 
         int age = input.nextInt();


      Scanner input1 = new Scanner(System.in);//Clear the cache above
        
         //Print text on the screen and get the String type entered by the user
    	   System.out.print("Please enter dog's favorite food: "); 
    	   String favorite_food = input1.nextLine();
    	
         //Print text on the screen and get the int type entered by the user
         System.out.print("Please enter dog's height(cm): "); 
         int height = input1.nextInt();

         //Print text on the screen and get the int type entered by the user
         System.out.print("Please enter dog's weight(Kg): "); 
         int weight = input1.nextInt();


      Scanner input2 = new Scanner(System.in);//Clear the cache above

         //Print text on the screen and get the String type entered by the user
         System.out.print("Please enter dog's favorite toy: "); 
         String favorite_toy = input2.nextLine();

         //Print text on the screen and get the String type entered by the user
         System.out.print("Please enter owner's name: "); 
         String owners_name = input2.nextLine();

    	
        //Print the information entered above
        System.out.println("Dog's name is " + name);
        System.out.println("Dog's age is " + age);
        System.out.println("Dog's favorite food is " + favorite_food);
        System.out.println("Dog's height is " + height + "cm"); 
        System.out.println("Dog's weight is " + weight + "Kg"); 
        System.out.println("Dog's favorite toy " + favorite_toy); 
        System.out.println("Dog's owner's name " + owners_name); 
  }
}
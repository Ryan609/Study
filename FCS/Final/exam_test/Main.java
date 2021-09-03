public class Main {
    public static void main(String[] args) {
        Contest finalContest = new Contest();
        try{
            double[] skills1 = {5.5,4.3,6.5,3.4,7};
            finalContest.addFinalist(new Finalist("John Doe","Suburb1",30,skills1,"I can bounce higher than anyone else"));
            double[] skills2 = {6.4,3.3,9.8,3.4,7};
            finalContest.addFinalist(new Finalist("James Williams","Suburb2",25,skills2,"I am the strongest man"));
            double[] skills3 = {5.5,3.3,10.0,3.4,7};
            finalContest.addFinalist(new Finalist("Albert Thomas","Suburb3",38,skills3,"Coordination leads to success"));
            double[] skills4 = {5.9,3.3,7.4,8.0,6.8};
            finalContest.addFinalist(new Finalist("Louis Philip","Suburb4",32,skills4,"I can balance anything with ease"));
            double[] skills5 = {3.3,3.1,10.00,4.9,5.9};   
            finalContest.addFinalist(new Finalist("Lina Roy","Suburb5",34,skills5,"I can jump higher that anyone else"));
        
            System.out.println("Before sorting : ");
            finalContest.printFinalists();
            finalContest.sortFinalist();
            System.out.println("After sorting : ");
            finalContest.printFinalists();
        
        }catch(IndexOutOfBoundsException e){
            System.out.println("ERROR : Max of 5 Finalists allowed");
        }

    }
}

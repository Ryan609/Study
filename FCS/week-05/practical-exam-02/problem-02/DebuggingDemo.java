//==================================
// Foundations of Computer Science
// Student: Xinyan Wu
// id: a1809534
// Semester: S1
// Year:2021
// Practical Exam Number: 02
//===================================

public class DebuggingDemo {

    public void bugMethod() {
    	//The array is indexed from 0, and 5 exceeds the index of the array
         int num[] = {1, 2, 3, 4};
         System.out.println(num[5]);
     }



    //ans is a float type, and the return type is also a float type, and the method is an int type.
    public int bugMethod2() {
            int ans = 0;
            System.out.println("This method had a bug!");
            return ans;
    }




}
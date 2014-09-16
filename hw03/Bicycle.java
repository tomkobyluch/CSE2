//Tom Kobyluch
//9-10-14
//Bicycle

import java.util.Scanner;       //call scanner to use for input

class Bicycle{   //class setup
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        int wheeldiameter = 27; //var for wheel diameter
        double PI = 3.14159;    //var for value of pi
        
        System.out.print("Enter the amount of seconds:");    //prompt user for input
        int countstime = scan.nextInt();    //store input as countstime
        System.out.print("Enter the amount of counts:");    //prompt user for input
        int ncounts = scan.nextInt();       //store input as ncount
        
        double circumference = (PI)*(wheeldiameter)*ncounts;    //calculate circumference and store it
        double distance = (circumference/12)/5280;      //calculate distance and store it
        double minutes = countstime/60;     //calulate minutes and store it
        double hours = minutes/60;      //calculate hoiurs and store it
        double mph = distance/hours;        //calculate miles per hour and store it
        
        System.out.printf("The distance was %1.2f miles and is took %1.2f minutes.\n",distance,minutes);        //print out distance and time
        System.out.printf("The average mph was %1.2f.",mph);        // print out miles per hour
    }
}
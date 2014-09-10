//Tom Kobyluch
//9-10-14
//Bicycle

import java.util.Scanner;

class Bicycle{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        //String s = in.nextLine();//or scan.next();
        
        int wheeldiameter = 27;
        double PI = 3.14159;
        
        System.out.print("Enter the amount of seconds:");
        int countstime = scan.nextInt();
        System.out.print("Enter the amount of counts:");
        int ncounts = scan.nextInt();
        
        double circumference = (PI)*(wheeldiameter)*ncounts;
        double distance = (circumference/12)/5280;
        double minutes = countstime/60;
        double hours = minutes/60;
        double mph = distance/hours;
        
        System.out.printf("The distance was $%1.2f and is took $%1.2f minutes.\n",distance,minutes);
        System.out.printf("The average mph was $%1.2f.",mph);
    }
}
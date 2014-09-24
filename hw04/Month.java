//Tom Kobyluch
//9-23-14
//Month

import java.util.Scanner;       //call scanner to use for input

class Month{
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        System.out.println("Enter integer of month:");    //prompt user for input
        int monthnum; //create var for number of month
         if(scan.hasNextInt()){//if input is integer, continue
            monthnum = scan.nextInt();     //store input as var 
            if(monthnum>0&&monthnum<=12){//checks if input is within range
            switch(monthnum){//switch statement
                case 1:  System.out.print("January has 31 days");//print out num days in month
                         break;
                case 2:  System.out.println("Enter the year:");    //prompt user for input
                         if(scan.hasNextInt()){ // checks if year is int, then continues
                            int year = scan.nextInt();    //store input as var
                            int days=28;//days in non leap year 
                            if(year%4==0){days = 29;};//if leap year 28 days
                            System.out.print("February has " +days+ " days");//print out num days in month and inputted year
                            break;
                         }else{System.out.print("Not an integer");  //if year isnt int, it returns that message
                         break;}
                case 3:  System.out.print("March has 31 days");//print out num days in month
                         break;
                case 4:  System.out.print("April has 30 days");//print out num days in month
                         break;
                case 5:  System.out.print("May has 31 days");//print out num days in month
                         break;
                case 6:  System.out.print("June has 30 days");//print out num days in month
                         break;
                case 7:  System.out.print("July has 31 days");//print out num days in month
                         break;
                case 8:  System.out.print("August has 31 days");//print out num days in month
                         break;
                case 9:  System.out.print("September has 30 days");//print out num days in month
                         break;
                case 10:  System.out.print("October has 31 days");//print out num days in month
                         break;
                case 11:  System.out.print("November has 30 days");//print out num days in month
                         break;
                case 12:  System.out.print("December has 31 days");//print out num days in month
                         break;
                }
            }else{System.out.println("Not between 1 and 12");}//if month number is not within range
        }else{
            System.out.println("Error: You didn't enter an integer.");//if month number isnt integer
            return;
        }
        
    }
}
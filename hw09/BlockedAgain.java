//Tom Kobyluch
//11-4-14
//HW9
//This program takes a number between 1 and 9 from the user and prints blocks of those numbers out. THe number is rejected if not int or in range
//We ise methods for sub processes to learn about using

import java.util.Scanner;   //import scanner for inputs
public class BlockedAgain{  //create class
    public static void main(String []s){    //create main method to run otehr methods
        int m;  //variable to store users input
        //force user to enter int in range 1-9, inclusive.
        m = getInt();   //stores m as the users input with method, injt betweeen 1-9
        allBlocks(m);   //outputs blocks of numbers based on the users input using method
    }
    
    public static int getInt(){ //method to obtain users input. 
        Scanner scan = new Scanner(System.in);  //create new scanner
        int input = 0;  //variable to store input from scanner
        boolean control = false;    //a control to stop the int check loop, when the user enters a valid input it stops
        boolean checkInt;   //variable that is returned by method that checks whether input is integer
        while(control == false){//int check loop, for repeating if invalid input
            System.out.println("Enter int between 1 and 9: ");  //Prompt user
            checkInt = checkInt(scan);  //call checkInt method to get boolean 
            if(checkInt == false){  //if input is not int, clear scanner and try again
                System.out.println("Not Int, try again.");  //Prompt user to try again
                scan.next();    //clear scanner to re-get boolean
            }
            if(checkInt == true){   //if input is int the first check is good and go on to range check
                input = scan.nextInt(); //store the users input officialy
                boolean control2 = false; //control for range
                boolean checkRange; // var for range boolean
                while(control2 == false){//range loop, for repeating if invalid input
                    checkRange = checkRange(input); //calls checkRange method to ensure int is between 1 and 9
                    if(checkRange == false){    //if its not between 1 and 9 
                        System.out.println("Not in range, try again."); //tell user to re-try
                        control2 = true;    // and break back into the checkint loop, the main non nested one
                    }
                    if(checkRange == true){ //if it is within range
                        control2 = true;    //break out of nested loop
                        control = true; //break out of main loop because no more re-trying requitred
                    }
                }
            }
        }
        
        return input; //return input 
    }

    public static boolean checkInt(Scanner scan){   //method for checking whether input is integer
        boolean checkInt = scan.hasNextInt();   //stores integer or not as boolean checkInt
        return checkInt;    //returns that boolean
    }

    public static boolean checkRange(int input){    //method for check whether input is within range 1-9
        boolean checkRange = true;  //assume it is in range unless
        if(input < 1 || input > 9){ //if not within range
            checkRange = false; //set boolean to false
        }
        return checkRange;  //return boolean
    }
    
    public static void allBlocks(int input){    //methods for outputing blocks of numbers 
        int counter = 0;    //create counter to control loop
        while(counter<=input){  //loop will display blocks of numbers one by one 
            String block = block(counter, input);   //store current number block with hyphens and spaces
            System.out.print(block);  //output that block
            counter++;  //add one to counter, stops when adds to input
        }
    }
    
    public static String block(int counter, int input){ //method that creates the block of numbers for one number at a time
        String block = "";  //something to add onto
        String numberofspaces = line(counter, input);   //calls line methods to get the proprer number of spaces
        for(int n = 0;n<counter;n++){ //this loop controls how many lines of the number there are
            block += "\n"+ numberofspaces;    //new line with spaces
            for(int t = 0;t<((counter*2)-1);t++){ //this loop prints the amount of the number on one line
                block+=counter;    //print, not println, to string the numbers together
            }
        }
        block+="\n" + numberofspaces;//new line and spaces to add hyphens
        for( int j=1;j<=((counter*2)-1);j++){ //loop to add hyphens until it matches the number *2 -1
            block += "-";     //compound hyphens based on input
        }
        return block;// return the string of lines of numbers with the proper spaces
    }
    
    public static String line(int counter, int input){  //methods for calculating number of spaces in front of each line
        String numberofspaces = "";     //variable for storing number of spaces
        for(int u = 0; u<input; u++){ //calc max number of spaces infront of 1
            numberofspaces+=" ";     //compound spaces based on input
        }
        for( int s=1;s<counter;s++){  //take of spaces infront of next numbers to create pyramid
            numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1); //substitute the string with a string with one less space for the next set of numbers, this creats pyramid
        }
        return numberofspaces;  //return the string, with the correct amount of spaces for that line
    }
}
                
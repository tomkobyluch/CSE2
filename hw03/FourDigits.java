//Tom Kobyluch
//9-16-14
//FourDigits

import java.util.Scanner;   //call scanner to use for input

class FourDigits{   //class setup
    public static void main(String[] args){ //main method
        
        /* 
            Summary of method used: Number entered is 5.0099. First you convert it to integer which is 5. Then multiply 5.0099 by 10000 to get 50099 
            then subtract your integer (5) times 10000. So 50099 - 50000 to get your output 99. But you need 0's infront. To do this I first got the number of digits in
            99 using a for loop. Then I used 3 if statements to put in filler 0's as needed. 
        */
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        System.out.println("Enter number:");    //prompt user for input
        double num = scan.nextDouble();     //store input as num
        String filler = "";     //the variable for the filler 0's
        int intnum = (int)num; //get a integer version of the inputed number
        int finalnum = (int)((num*10000)-(intnum*10000));   //this is the first 4 decimal numbers without any 0's infront, the casting to int is to remove .0 at end. Note: By converting it to an integer and unwanted decimals are cut off that would have been there from a input with more than 4 decimal places
        int numdig,finalnumtemp = finalnum;     //variable to store number of digits in finalnum, i also make finalnumtemp because i need to modiffy finalnum but also need the original number for later
	    for (numdig=0;finalnumtemp>0;++numdig){     //loop to find number of digits, the loop runs and divides finalnum by 10 until finalnum is less than 0, each run adds to numdig
		    finalnumtemp/=10;
	    }
        if(numdig == 3){filler = "0";}       //if there are 3 non 0 digits in our output, one 0's will be placed in front of them
        if(numdig == 2){filler = "00";}     //if there are 2 non 0 digits in our output, two 0's will be placed in front of them
        if(numdig == 1){filler = "000";}        //if there are 1 non 0 digits in our output, three 0's will be placed in front of them
        
        System.out.println("The 4 digits are " + filler + finalnum);        //outputs the digits
        
        //Note: Advanced java method could probably have been used but this is the first way that popped into my head and works well
        
    }
}
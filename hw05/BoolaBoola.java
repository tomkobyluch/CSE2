//Tom Kobyluch
//9-30-14
//BoolaBoola = Program creates 3 random booleans and 2 random operators between && or ||. Then it string them together like true||false&&false and asks user what is =,
//then ouputs whether user is correct

import java.util.Scanner;   //calls for scanner
import java.util.Random;    //calls for random

class BoolaBoola    //creates class
{
   public static void main(String[] args)   //creates main method
   {
       Scanner scan  = new Scanner(System.in);  //new instance of scanner for my inputs
       Random rand = new Random();  //new instance of random that i imported
       boolean bool1 = rand.nextBoolean();  //stores true or false randomly in variable
       boolean bool2 = rand.nextBoolean();  //stores true or false randomly in variable
       boolean bool3 = rand.nextBoolean();  //stores true or false randomly in variable
       boolean finalbool = true;    //a variable to store the correct answer
       String operator1="",operator2="";    //for ouputing operators
       if(rand.nextInt(2) == 0) //if else statment set first operator to either && or ||
       {
           operator1 = " && ";
       }
       else
       {
           operator1 = " || ";
       }
       if(rand.nextInt(2) == 0)//if else statment set second operator to either && or ||
       {
           operator2 = " && ";
       }
       else
       {
           operator2 = " || ";
       }
       if(operator1 == " && " && operator2 == " && ")// if statement taht checks both the operators strings and uses the real operators to get the correct answer
       {
           finalbool = bool1&&bool2&&bool3; //stores answer as finalbool
       }
       else if(operator1 == " || " && operator2 == " && ")// if statement taht checks both the operators strings and uses the real operators to get the correct answer
       {
           finalbool = bool1||bool2&&bool3; //stores answer as finalbool
       }
       else if(operator1 == " || " && operator2 == " || ")// if statement taht checks both the operators strings and uses the real operators to get the correct answer
       {
           finalbool = bool1||bool2||bool3; //stores answer as finalbool
       }
       else if(operator1 == " && " && operator2 == " || ")// if statement taht checks both the operators strings and uses the real operators to get the correct answer
       {
           finalbool = bool1&&bool2||bool3; //stores answer as finalbool
       }
       System.out.println("Does " + bool1 + operator1 + bool2 + operator2 + bool3 + " have the value true(t/T) or false(f/F)?");    //Outputs question
       //Notes for seld : && has higher precedence than ||. && set true is both sides of it are true
       char answer = scan.next().charAt(0); //answer set to next char entered
       if((answer == 't' || answer == 'T') && finalbool == true)    //if user input = correct answer ouput correct
       {
           System.out.println("Correct!"); //output text correct
       }
       else if((answer == 'f' || answer == 'F') && finalbool == false)    //if user input = correct answer ouput correct
       {
           System.out.println("Correct!"); //output text correct
       }
       else
       {
          System.out.println("Wrong"); // output wrong if user is wrong
       }
   } 
}
/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    System.out.println("You entered "+x+"%");
    //print out the proportion remaining for select percentages
    double leftover  = 1 - (x/100);
    if( x > 0 && x < 100){  //when the user enters 7
      System.out.println("The proportion remaining is " + leftover);
    }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
    Code only print out proportion remaining for 5 certain numbers, you have to make it work for all 99.
    This code will store the left over proportion and then print that out as long as the user entered a percent between 0 and 100
 * 
 * 
 * 
 */


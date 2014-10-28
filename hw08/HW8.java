//Tom Kobyluch
//10-28-14
//HW8
//This program prompts the user for various characters and the goal is to ensure the input is a character
//with methods. It also introduces overloading of methods where they have the same name but different arguments.

import java.util.Scanner;   //imoport scanner for getting inuputs
public class HW8{   //create class
  public static void main(String []arg){    //create main method
	char input; //create variable to send and return to the methods
	Scanner scan=new Scanner(System.in);    //create a new instance of scanner
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");  //tell the user to enter one of the chars
	input=getInput(scan,"Cc");  //set input equal to the return of getInput #1 method.
	System.out.println("You entered '"+input+"'");  //output the users input  
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");  //prompt user to input ne of the chars
	input=getInput(scan,"yYnN",5); //give up after 5 attempts. set input equal to the return of getInput #2 method.
	if(input!=' '){ //if input isnt a space...
   	System.out.println("You entered '"+input+"'");  //output the users input
	}
	input=getInput(scan,"Choose a digit.","0123456789");    //set input equal to the return of getInput #3
	System.out.println("You entered '"+input+"'");  //output users input
  }  
  
  public static char getInput(Scanner scan, String Cc){ //create first getInput method
      char input = 'q'; //set input to something to check against later
      String tempinput; //this temporary string is used to check whether the input is 1 character using length()
      while(input == 'q'){  //this loop controls when to stop the method
        while(true){    //this loop infinetly runs until it hits one of the breaks
            tempinput = scan.next();    //sets the input = to tempinput string
            if(tempinput.length() != 1){    //if it isnt 1 character, the loop is broken from and the user is required to enter another input
                System.out.println("not single character, try again");  //prompt uer for another input
                break; //breaks out of loop into main loop to restart everything
            }
            if(!tempinput.equals("C") && !tempinput.equals("c")){   //if the user didnt enter somethin from the list and it is 1 character long they will recieve error
                System.out.println("Not from list Cc, try again"); //prompts user that they entered invalid input and to try again
                break;  //breaks out of loop into main loop to restart everything
            }
            input = tempinput.charAt(0);    //if the above to if statements are false then the char is set to the temporary string so it can be returned as a char
            break;  //breaks out of the loop that makes the user enter another number as they entered a valid number
        }
      }
      return input; //returns the input as char
  }  
  
  public static char getInput(Scanner scan, String letters, int tries){ //create second getInput method
      char input = 'q'; //set input to something to check against later
      String tempinput; //this temporary string is used to check whether the input is 1 character using length()
      int counter = tries;  //the loop will stop when counter is less then 0, which is same thing as the amount of tries they have which is given when the method is run
      while(input == 'q'  && counter > 0){ //loop that controls when to stop if run out of attempts. q is an arbitrary letter to compare against the letters in the list
        while(counter > 0){ //this loop is just for breaking out of so if the input is incorrect it will not be saved
            tempinput = scan.next();      //sets the input = to tempinput string  
            if(tempinput.length() != 1){   //if it isnt 1 character, the loop is broken from and the user is required to enter another input
                counter--;  //takes away one try
                System.out.println("Not a single character, try again. " + counter + " tries left"); //prompts user that they entered invalid input and to try again
                if(counter == 0){   //if no more tries
                    input = ' ';   //set input to space
                    System.out.println("You failed after " +tries+ " tries");   //if tries runs out, tells user they failed
                }
                break; //breaks out of loop into main loop to restart everything
            }
            if(!tempinput.equals("Y") && !tempinput.equals("y") && !tempinput.equals("N") && !tempinput.equals("n")){  //if the user didnt enter somethin from the list and it is 1 character long they will recieve error
                counter--;   //takes away one try
                System.out.println("Not from list [" + letters + "], try again. "  + counter + " tries left."); //prompts user that they entered invalid input and to try again
                if(counter == 0){   //if no more tries
                    input = ' ';    //set input to space
                    System.out.println("You failed after " +tries+ " tries");   //if tries runs out, tells user they failed
                }
                break; //breaks out of loop into main loop to restart everything
            }
            input = tempinput.charAt(0);    //if the above to if statements are false then the char is set to the temporary string so it can be returned as a char
            break;  //breaks out of the loop that makes the user enter another number as they entered a valid number
        }
      }
      return input; //returns the input as char
  }
  
  public static char getInput(Scanner scan, String prompt, String numbers){ //create third getInput method
      char input = 'q'; //set input to something to check against later
      String tempinput; //this temporary string is used to check whether the input is 1 character using length()
      while(input == 'q'){ //loop that controls when to stop if run out of attempts. q is an arbitrary letter to compare against the letters in the list
        while(true){   //this loop infinetly runs until it hits one of the breaks
            System.out.println(prompt + "\nEnter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");   //asks user to enter number from list
            tempinput = scan.next();      //sets the input = to tempinput string  
            if(tempinput.length() != 1){   //if it isnt 1 character, the loop is broken from and the user is required to enter another input
                System.out.println("not single character, try again"); //prompts user that they entered invalid input and to try again
                break; //breaks out of loop into main loop to restart everything
            }
            if(!tempinput.equals("0") && !tempinput.equals("1") && !tempinput.equals("2") && !tempinput.equals("3") && !tempinput.equals("4") && !tempinput.equals("5") && !tempinput.equals("6") && !tempinput.equals("7") && !tempinput.equals("8") && !tempinput.equals("9")){   //if the user didnt enter somethin from the list and it is 1 character long they will recieve error
                System.out.println("Not from list " + numbers+ ", try again.");     //prompts user that they entered invalid input and to try again
                break; //breaks out of loop into main loop to restart everything
            }
            input = tempinput.charAt(0);    //if the above to if statements are false then the char is set to the temporary string so it can be returned as a char
            break;  //breaks out of the loop that makes the user enter another number as they entered a valid number
        }
      }
      return input; //returns the input as char
  }  
  
}



           
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
  
  public static char getInput(Scanner scan, String Cc){
      char input = 'q';
      String tempinput;
      while(input == 'q'){
        while(true){
            tempinput = scan.next();
            if(tempinput.length() != 1){
                System.out.println("not single character, try again");
                break;
            }
            if(!tempinput.equals("C") && !tempinput.equals("c")){
                System.out.println("Not from list cc");
                break;
            }
            input = tempinput.charAt(0);
            break;
        }
      }
      return input;
  }  
  
  public static char getInput(Scanner scan, String letters, int tries){
      char input = 'q';
      String tempinput;
      int counter = tries;
      while(input == 'q'  && counter > 0){ //loop that controls when to stop if run out of attempts. q is an arbitrary letter to compare against the letters in the list
        while(counter > 0){ //this loop is just for breaking out of so if the input is incorrect it will not be saved
            tempinput = scan.next();
            if(tempinput.length() != 1){
                counter--;
                System.out.println("Not a single character, try again. " + counter + " tries left");
                if(counter == 0){
                    input = ' ';
                    System.out.println("You failed after " +tries+ " tries");
                }
                break;
            }
            if(!tempinput.equals("Y") && !tempinput.equals("y") && !tempinput.equals("N") && !tempinput.equals("n")){
                counter--;
                System.out.println("Not from list [" + letters + "], try again. "  + counter + " tries left.");
                if(counter == 0){
                    input = ' ';
                    System.out.println("You failed after " +tries+ " tries");
                }
                break;
            }
            input = tempinput.charAt(0);
            break;
        }
      }
      return input;
  }
  
  public static char getInput(Scanner scan, String prompt, String numbers){
      char input = 'q';
      String tempinput;
      while(input == 'q'){
        while(true){
            System.out.println(prompt + "\nEnter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
            tempinput = scan.next();
            if(tempinput.length() != 1){
                System.out.println("not single character, try again");
                break;
            }
            if(!tempinput.equals("0") && !tempinput.equals("1") && !tempinput.equals("2") && !tempinput.equals("3") && !tempinput.equals("4") && !tempinput.equals("5") && !tempinput.equals("6") && !tempinput.equals("7") && !tempinput.equals("8") && !tempinput.equals("9")){
                System.out.println("Not from list " + numbers);
                break;
            }
            input = tempinput.charAt(0);
            break;
        }
      }
      return input;
  }  
  
}



           
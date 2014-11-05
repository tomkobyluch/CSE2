import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    
    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean control = false;
        boolean checkInt;
        while(control == false){//int check loop, for repeating if invalid input
            checkInt = checkInt(scan);
            if(checkInt == false){
                System.out.println("Not Int, try again.");
                scan.next();
            }
            if(checkInt == true){
                input = scan.nextInt();
                boolean control2 = false; //control for range
                boolean checkRange;
                while(control2 == false){//range loop, for repeating if invalid input
                    checkRange = checkRange(input);
                    if(checkRange == false){
                        System.out.println("Not in range, try again.");
                        control2 = true;
                    }
                    if(checkRange == true){
                        control2 = true;
                        control = true;
                    }
                }
            }
        }
        
        return input;
    }

    public static boolean checkInt(Scanner scan){
        boolean checkInt = scan.hasNextInt();
        return checkInt;
    }

    public static boolean checkRange(int input){
        boolean checkRange = true;
        if(input < 1 || input > 9){
            checkRange = false;
        }
        return checkRange;
    }
    
    public static void allBlocks(int input){
        int counter = 0;
        while(counter<=input){
            String block = block(counter, input);
            System.out.print(block);  
            counter++;
        }
    }
    
    public static String block(int counter, int input){
        String block = "";
        String numberofspaces = line(counter, input);
        for(int n = 0;n<counter;n++){ //this loop controls how many lines of the number there are
            block += "\n"+ numberofspaces;    //new line with spaces
            for(int t = 0;t<((counter*2)-1);t++){ //this loop prints the amount of the number on one line
                block+=counter;    //print, not println, to string the numbers together
            }
        }
        block+="\n" + numberofspaces;//new line and spaces to add hyphens
        for( int j=1;j<=((counter*2)-1);j++){ 
            block += "-";     //compound hyphens based on input
        }
        return block;
    }
    
    public static String line(int counter, int input){
        String numberofspaces = "";     //variable for storing number of spaces
        for(int u = 0; u<input; u++){ //calc max number of spaces infront of 1
            numberofspaces+=" ";     //compound spaces based on input
        }
        for( int s=1;s<counter;s++){  //take of spaces infront of next numbers to create pyramid
            numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1); //substitute the string with a string with one less space for the next set of numbers, this creats pyramid
        }
        return numberofspaces;
    }
}
                
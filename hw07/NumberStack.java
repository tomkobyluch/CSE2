//Tom Kobyluch
//10-21-14
//HW07 - NumberStack
/*The objective of this homework is the print out a pyramid of blocks of numbers, 
the height being defined by the user. Three pyramids are output,
there loops which create them are all different. While, do-while, and for*/

import java.util.Scanner;   //import the scanner class

class NumberStack{  //Create the class 
    public static void main(String[] args){ //create main method
        Scanner scan = new Scanner(System.in);  //create new instance of scanner class
        
        System.out.println("Enter number between 1 and 9: ");
        
        if(scan.hasNextInt()){  //check if the input is an integer
            int input = scan.nextInt();     //store next integer as input
            if(input>0 && input <10){   //check if integer is in range between 1 and 9
                
                System.out.println("\nThe for loop run: "); //display which loop is currently shown
                for(int x = 1;x<=input;x++){            //main for loop
                    String numberofhyphens = "";   //variable for storing number of hyphens
                    String numberofspaces = "";     //variable for storing number of spaces
                    
                    for(int u = 0; u<input; u++){ //calc max number of spaces infront of 1
                        numberofspaces+=" ";     //compound spaces based on input
                    }
                    
                    for( int j=1;j<=((x*2)-1);j++){ //calc number of hyphens
                        numberofhyphens += "-";     //compound hyphens based on input
                    }
                    
                    for( int s=1;s<x;s++){  //take of spaces infront of next numbers to create pyramid
                        numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1); //substitute the string with a string with one less space for the next set of numbers, this creats pyramid
                    }
                    
                    for(int n = 0;n<x;n++){ //this loop controls how many lines of the number there are
                        System.out.print("\n"+numberofspaces);    //new line with spaces
                        for(int t = 0;t<((x*2)-1);t++){ //this loop prints the amount of the number on one line
                            System.out.print(x);    //print, not println, to string the numbers together
                        }
                    }
                    System.out.print("\n" + numberofspaces + numberofhyphens);     //prepare lines for next numbers
                    
                }
                
                
                
                
                
                System.out.println("\nThe while loop run: "); //display which loop is currently shown
                int q = 1;          //main while loop
                while(q<=input){
                    String numberofhyphens = "";   //variable for storing number of hyphens
                    String numberofspaces = ""; //variable for storing number of spaces
                    
                    int l = 0;
                    while(l<input){ //calc max number of spaces infront of 1
                        numberofspaces+=" ";  //compound spaces based on input
                        l++;    //increment counter
                    }
                    
                    int b = 1;
                    while( b<=((q*2)-1)){ //calc number of hyphens
                        numberofhyphens += "-";  //compound hyphens based on input
                        b++;    //increment counter
                    }
                    
                    int f = 1;
                    while( f< q){  //take of spaces infront of next numbers to create pyramid
                        numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1); //substitute the string with a string with one less space for the next set of numbers, this creats pyramid
                        f++;    //increment counter
                    }
                    
                    int m = 0;  //var is counter for number of lines output
                    while(m<q){ //this loop controls how many lines of the number there are
                        int r = 0;  //var is counter for number on numbers output
                        System.out.print("\n"+numberofspaces);  //new line with spaces
                        while(r<((q*2)-1)){ //this loop prints the amount of the number on one line
                            System.out.print(q);    //print, not println, to string the numbers together
                            r++;    //increment counter
                        }
                        m++;    //increment counter
                    }
                    System.out.print("\n" + numberofspaces + numberofhyphens);    //prepare lines for next numbers
                    q++;     //increment counter
                }
                
                
                
                
                
                System.out.println("\nThe do-while loop run: "); //display which loop is currently shown
                
                int v = 1;          //main do - while loop, v is main loop counter
                do{
                    String numberofhyphens1 = "";   //variable for storing number of hyphens
                    String numberofspaces1 = "";    //variable for storing number of spaces
                    
                    int c = 0;
                    do{ //calc max number of spaces infront of 1
                        numberofspaces1+=" ";    //compound spaces based on input
                        c++;    //increment counter
                    }while(c<input);
                    
                    int z = 1;
                    do{ //calc number of hyphens
                        numberofhyphens1 += "-";     //compound hyphens based on input
                        z++;    //increment counter
                    }while( z<=((v*2)-1));    //loop stops when counter z is greater the arithmetic
                    
                    int p = 1;
                    do{  //take of spaces infront of next numbers to create pyramid
                        if(v==1){continue;};
                        numberofspaces1 = numberofspaces1.substring(0,numberofspaces1.length()-1); //substitute the string with a string with one less space for the next set of numbers, this creats pyramid
                        p++;    //increment counter
                    }while( p < v);   //loop stops when p is greater than counter v
                    
                    int o = 0;  //var is counter for number of lines output
                    do{ //this loop controls how many lines of the number there are
                        int h = 0;    //var is counter for number on numbers output
                        System.out.print("\n"+numberofspaces1);   //new line with spaces
                        do{ //this loop prints the amount of the number on one line
                            System.out.print(v);    //print, not println, to string the numbers together
                            h++;    //increment counter
                        }while(h<((v*2)-1));     //loop stops when counter h is greater the arithmetic
                        o++;    //increment counter
                    }while(o<v); //loop stops when counter o is less then the main loop counter v
                    System.out.print("\n" + numberofspaces1 + numberofhyphens1);    //prepare lines for next numbers
                    v++;     //increment counter
                }while(v<=input);   //loop stops when counter v is greater than input
                
                System.out.println();   //makes console look nice
                
            }else{
            System.out.println("Not in range [1-9]");   //output if the input num is not within range
            }
        }else{
        System.out.println("Not an integer");   //output if the input num is not an integer
        }
    }
}
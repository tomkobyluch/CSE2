//Tom Kobyluch
//9-16-14
//Root

import java.util.Scanner;       //call scanner to use for input

class Root{   //class setup
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        System.out.println("Enter a double:");    //prompt user for input
        double num = scan.nextDouble(); //store input as num
        double numcuberoot = Math.pow(num,(0.3333));    //raise num to the 1/3 power
        System.out.println("This is a crude cubed root of that number: " + numcuberoot);    //print out numcuberoot
        System.out.println("This is that crude number cubed: "+ Math.pow(numcuberoot,3));   //print out numcuberoot to the 3rd power
        
    }
}
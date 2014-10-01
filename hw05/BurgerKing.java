//Tom Kobyluch
//9-30-14
//BurgerKing - Prompt user for choice and output that choice

import java.util.Scanner; //call Scanner for inputs

class BurgerKing    //create class
{
    public static void main(String[] args)  //main method
    {
        Scanner scan = new Scanner(System.in);  //create new instance on scanner for my inputs 
        System.out.println("Enter a letter to indicate a choice of \nBurger (B or b) \nSoda (S or s) \nFries (F or f)\n");  //output choices
        char choice = scan.next().charAt(0);    //store next character as a defined variable
        switch(choice)  //created switch statement for the choice of buger, soda, or fries
        {
            case 'B':
            case 'b':
                System.out.println("Enter A or a for \"all the fixins\" \nC or c for cheese \nN or n for none of the above\n"); //output choices
                char burgerchoice = scan.next().charAt(0);    //store next character as a defined variable
                switch(burgerchoice)  //created switch statement for the choice of burger
                {
                    case 'A':
                    case 'a': 
                        System.out.println("You ordered a burger with all the fixings");    //output selected choice
                        break;
                    case 'C':
                    case 'c': 
                        System.out.println("You ordered a burger with cheese");    //output selected choice
                        break;
                    case 'N':
                    case 'n': 
                        System.out.println("You ordered a burger with none of the above");    //output selected choice
                        break;
                    default: 
                        System.out.println("You didn't enter (A,a,C,c,N,or n)");    //output error if user does not enter valid choice
                        break;
                }
                break;
            case 'S':
            case 's':
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");  //output choices
                char sodachoice = scan.next().charAt(0);    //store next character as a defined variable
                switch(sodachoice)  //created switch statement for the choice of soda
                {
                    case 'P':
                    case 'p': 
                        System.out.println("You ordered a Pepsi");     //output selected choice
                        break;
                    case 'C':
                    case 'c': 
                        System.out.println("You ordered a Coke");    //output selected choice
                        break;
                    case 'S':
                    case 's': 
                        System.out.println("You ordered a Sprite");    //output selected choice
                        break;
                    case 'M':
                    case 'm': 
                        System.out.println("You ordered a Mountain Dew");    //output selected choice
                        break;
                    default: 
                        System.out.println("You didn't enter (P,p,C,c,S,s,M,or m)");    //output error if user does not enter valid choice    
                        break;
                }
                break;
            case 'F':
            case 'f':
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)");    //output choices
                char frieschoice = scan.next().charAt(0);    //store next character as a defined variable
                switch(frieschoice)  //created switch statement for the choice of fries
                {
                    case 'L':
                    case 'l': 
                        System.out.println("You ordered large fries");    //output selected choice
                        break;
                    case 'S':
                    case 's': 
                        System.out.println("You ordered small fries");    //output selected choice
                        break;
                    default: 
                        System.out.println("You didn't enter (l,L,s, or S)");    //output error if user does not enter valid choice
                        break;
                }
                break;
            default: 
                System.out.println("You didn't enter (B,b,S,s,F or f)");    //output error if user does not enter valid choice
                break;
        }
    }
}
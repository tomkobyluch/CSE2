import java.util.Scanner;

class BigMac{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = scan.nextInt();
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx):");
        double bigMac$ = scan.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = scan.nextDouble();
        taxRate/=100; //user enters percent, but I want proportion
        
        double cost$;
        int dollars,dimes,pennies; 
        
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +
        " per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);



    }
}
import java.util.Scanner;

class BigMacAgain{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int numbigmacs = 0;
        double bigmacprice = 0.0;
        
        //for burgers
        System.out.println("How many Big Macs?:");
        if(scan.hasNextInt()){
            numbigmacs = scan.nextInt(); 
            System.out.print("You ordered "+ numbigmacs); 
            bigmacprice = numbigmacs * 2.22; 
            System.out.printf(". Total cost of burgers is $%1.2f \n", bigmacprice);
        }else{
            System.out.println("Error: You didn't enter an integer.");
            return;
        }
        
        //for fries
        System.out.println("Would you like fries?");
        double total = bigmacprice + 2.15;
        char friesanswer = scan.next().charAt(0);
        
        switch(friesanswer){
            
            case 'Y': System.out.println("Fries cost $2.15");
            total = bigmacprice + 2.15;
            System.out.printf("Total cost $%1.2f \n", total);
            break;
            
            case 'y': System.out.println("Fries cost $2.15");
            total = bigmacprice + 2.15;
            System.out.printf("Total cost $%1.2f \n", total);
            break;
            
            case 'N': total = bigmacprice;
            System.out.printf("Total cost $%1.2f \n", total);
            break;
            
            case 'n': total = bigmacprice;
            System.out.printf("Total cost $%1.2f \n", total);
            break;
            
            default:System.out.println("Error: Enter Y,y,N,or n.");
            return;
        }
        
    }
}
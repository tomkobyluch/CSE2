public class Arithmetic{    //make new class
    public static void main(String[] args){ //main method, runs all code
        int nsocks = 3; //variable for number of socks
        double sockcost=2.58;   //variable for cost of socks
        int nglasses= 6;    //varialbes for numbers of glasses
        double glassescost = 2.29;  //variable for cost of glasses
        int nenvelopes = 1; //variable for number of envelopes
        double envelopecost = 3.25; //variable for cost of envelopes
        double taxpercent = 0.06;   //variable for percent tax
        
        double totalcost = (0.06*((nsocks*sockcost)+(nglasses*glassescost)+(nenvelopes*envelopecost)));
        
        System.out.print("Cost is $");
        //this line outputs the computation to get the total cost of the purchase after tax
        System.out.printf("%1.2f", totalcost); //one way to cut demimal places
        System.out.println(""); //skips to new line for console to look nice
    }
}
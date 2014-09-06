public class Arithmetic{    //make new class
    public static void main(String[] args){ //main method, runs all code
    
        int nsocks = 3; //variable for number of socks
        double sockcost=2.58;   //variable for cost of socks
        int nglasses= 6;    //varialbes for numbers of glasses
        double glassescost = 2.29;  //variable for cost of glasses
        int nenvelopes = 1; //variable for number of envelopes
        double envelopecost = 3.25; //variable for cost of envelopes
        double taxpercent = 0.06;   //variable for percent tax
        
        double socktotal = nsocks * sockcost;
        double socktax = socktotal * 0.06;
        double glassestotal = nglasses * glassescost;
        double glassestax = glassestotal * 0.06;
        double envelopetotal = nenvelopes * envelopecost;
        double envelopetax = envelopetotal * 0.06;
        double totalcost = ((nsocks*sockcost)+(nglasses*glassescost)+(nenvelopes*envelopecost));
        double totalcostwithtax = totalcost + (totalcost*0.06);
        
        System.out.printf("Total cost of socks is $%1.2f with sales tax of $%1.2f \n", socktotal, socktax);
        System.out.printf("Total cost of glasses is $%1.2f with sales tax of $%1.2f \n", glassestotal, glassestax);
        System.out.printf("Total cost of envelopes is $%1.2f with sales tax of $%1.2f \n", envelopetotal, envelopetax);
        System.out.printf("Total cost without tax is $%1.2f \n", totalcost); //one way to cut demimal place,this line outputs the computation to get the total cost of the purchase after tax
        System.out.printf("Total cost with tax is $%1.2f \n", totalcostwithtax); //one way to cut demimal places, cost with tax
    }
}
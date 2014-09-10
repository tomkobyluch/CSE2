//Tom Kobyluch
//Program that outputs costs of a purchase

public class Arithmetic{    //make new class
    public static void main(String[] args){ //main method, runs all code
    
        int nsocks = 3; //variable for number of socks
        double sockcost=2.58;   //variable for cost of socks
        int nglasses= 6;    //varialbes for numbers of glasses
        double glassescost = 2.29;  //variable for cost of glasses
        int nenvelopes = 1; //variable for number of envelopes
        double envelopecost = 3.25; //variable for cost of envelopes
        double taxpercent = 0.06;   //variable for percent tax
        
        double socktotal = nsocks * sockcost; //variable for sock total
        double socktax = socktotal * 0.06;  //variable for sock tax
        double glassestotal = nglasses * glassescost;   //variable for glasses total    
        double glassestax = glassestotal * 0.06;    //variable for glasses tax
        double envelopetotal = nenvelopes * envelopecost;   //variable for envelopes total
        double envelopetax = envelopetotal * 0.06;  //variable for envelope tax
        double totalcost = ((nsocks*sockcost)+(nglasses*glassescost)+(nenvelopes*envelopecost));    //variable for total cost
        double totalcostwithtax = totalcost + (totalcost*0.06); //variable for total cost with tax
        double totaltax = totalcost * 0.06;
        
        System.out.printf("Total cost of socks is $%1.2f with sales tax of $%1.2f \n", socktotal, socktax); //outputs the string and uses the two variables listed at end in place of the %1.2f, which cuts decimals to 2
        System.out.printf("Total cost of glasses is $%1.2f with sales tax of $%1.2f \n", glassestotal, glassestax); //outputs the string and uses the two variables listed at end in place of the %1.2f, which cuts decimals to 2
        System.out.printf("Total cost of envelopes is $%1.2f with sales tax of $%1.2f \n", envelopetotal, envelopetax); //outputs the string and uses the two variables listed at end in place of the %1.2f, which cuts decimals to 2
        System.out.printf("Total cost without tax is $%1.2f \n", totalcost); //one way to cut demimal place,this line outputs the computation to get the total cost of the purchase after tax
        System.out.printf("Total sales tax is $%1.2f \n", totaltax); //outputs the string and cuts decimals, displays total tax
        System.out.printf("Total cost with tax is $%1.2f \n", totalcostwithtax); //one way to cut demimal places, cost with tax
    }
}
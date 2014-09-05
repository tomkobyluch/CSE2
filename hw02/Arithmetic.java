public class Arithmetic{
    public static void main(String[] args){
        int nsocks = 3;
        double sockcost=2.58;
        int nglasses= 6;
        double glassescost = 2.29;
        int nenvelopes = 1;
        double envelopecost = 3.25;
        double taxpercent = 0.06;
        
        System.out.println("Cost is "+(0.06*((nsocks*sockcost)+(nglasses*glassescost)+(
            nenvelopes*envelopecost))));
    
    }
}
import java.util.Scanner; //call scanner class

class Root{ //declare class
    public static void main(String[] args){ //declare main method
        Scanner scan = new Scanner(System.in);  //creat ne instacne of scanner class
        Double input = scan.nextDouble();   //store the inputted number from the scanner has input
        
        double low = 0,high=1+input,middle=0;   //define initial variables that dont change based on loop
        
        while((high-low)>((1+input)*0.0000001)){    //loop runs if the difference is not less than the original max * a small number
            middle = ((high-low)/2)+low;    //calaculate middle every run of loop for the if statement
            if((middle*middle)>input){  //if the middle squared is greater than the original input, you new high is middle
                high = middle;  //set high = middle
            }else{
                low = middle;   //if if statement false than low is set to middle
            }
        }
        System.out.println("Low: "+low+"\nHigh: "+high+"\n[ "+low+" , "+high+ " ]");    //output low and high, should be close to one another.
    }
}
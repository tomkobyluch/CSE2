//Tom Kobyluch
//9-23-14
//IncomeTax



import java.util.Scanner;       //call scanner to use for input

class IncomeTax{
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        double tax = 0; // create variable for tax
        
        System.out.println("Enter int giving number of thousands:");    //prompt user for input
        int numthous = scan.nextInt();    //store input as var 
        if(numthous < 20){tax = .05;}   //if income less than 20, tax is 5%
        if(numthous >= 20 && numthous < 40){tax = .07;}//if income between 20 and 40, tax is 7%
        if(numthous  >=40 && numthous < 78){tax = .12;}//if income between 40 and 78, tax is 12%
        if(numthous  >=78){tax = .14;}//if income more than 78, tax is 14%
        
        double taxround = Math.floor(((tax*100) * 100) / 100);//store rounded tax to avoid several decimals
        double taxtotal = Math.floor((((numthous*1000)*tax) * 100) / 100);//store total value of the tax and round to avoid decimals
        
        System.out.println("Your tax on $"+(numthous*1000)+" is "+taxround+"% and the tax is $"+ taxtotal);//print out earnings, tax, and tax amount
        
    }
}
//Tom Kobyluch
//9-23-14
//TimePadding



import java.util.Scanner;       //call scanner to use for input

class TimePadding{
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        System.out.println("Enter seconds passed in day:");    //prompt user for input
        if(scan.hasNextInt()){//checks if input is int
            int timesec = scan.nextInt();    //store input as var 
            if(timesec >0){//must be positive number
                double minutes = Math.floor(timesec / 60);//divides secs by 60 to get minutes
                double hours = Math.floor(minutes / 60);//divides minutes by 60 to get hours
                minutes = minutes - (hours*60);//makes minutes change to minutes without the minutes from the hours
                double secs = timesec  - (minutes*60)- (hours*60*60);//seconds left after minutes and hours
                int minutesint = (int)minutes;//converts to int
                int hoursint = (int)hours;//converts to int
                int secsint = (int)secs;//converts to int
                String hoursstr = Integer.toString(hoursint);//converts to string
                String minutesstr = String.format("%02d", minutesint);//adds 0 if necessary
                String secsstr = String.format("%02d", secsint);//adds 0 if necessary
                System.out.println(hoursstr+ ":"+minutesstr+":"+secsstr);//prints our time
            }else{System.out.println("Not Positive");}//if secs is not positive
        }else{System.out.println("Not integer");}//if secs is not integer
        
    }
}
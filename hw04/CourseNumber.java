//Tom Kobyluch
//9-23-14
//CourseNumber



import java.util.Scanner;       //call scanner to use for input

class CourseNumber{
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        System.out.println("Enter a six digit number giving the course semester:");    //prompt user for input
        if(scan.hasNextInt()){//checks if int, then continues
            int coursenum = scan.nextInt();    //store input as var 
            if(coursenum <=201440 && coursenum>=186510){//checks if in range
                String coursestg = Integer.toString(coursenum);//converts int to string
                String semester = coursestg.substring(4);//cuts 4 char off of fron of string
                String year = coursestg.substring(0, coursestg.length() - 2);//cuts 2 char off back of string
                switch(semester){//switch statement for semester value
                    case "10": semester = "Spring";//sets semester string according to semester strings original value
                    break;
                    case "20": semester = "Summer 1";//sets semester string according to semester strings original value
                    break;
                    case "30": semester = "Summer 2";//sets semester string according to semester strings original value
                    break;
                    case "40": semester = "Fall";//sets semester string according to semester strings original value
                    break;
                    default: System.out.println("Invalid semester");//if semester turned out not to be 10,20,30,or 40
                    break;
                }
                System.out.println("The course was offered in "+semester+" semester of "+year);//prints out semester and year
            }else{System.out.println("Not between [186510,201440]");}//if course num not in range
        }else{System.out.println("Not integer");}//if course num not int
        
    }
}
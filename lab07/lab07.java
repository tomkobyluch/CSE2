import java.util.Scanner;

class lab07{
    public static void main(String[] args){
        /*int nStars = 10, i = 0;
        while(i<=nStars){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
        
        nStars = 10; i = 0;
        String output = "";
        while(i<=nStars){
            System.out.println(output);
            output += "*";
            i++;
        }
        
        System.out.print("\n\n");*/
        //user section
        
        Scanner scan = new Scanner(System.in);
        boolean booleancontroller = true;
        
        while(booleancontroller){
            System.out.println("Enter int between 1 and 15: ");
            if(scan.hasNextInt()){
                int nStaruser = scan.nextInt();
                if(nStaruser<=15&&nStaruser>0){
                    int x = 0;
                    while(x<=nStaruser){
                        System.out.print("*");
                        x++;
                    }
                    System.out.print("\n");
        
                    x = 0;
                    String useroutput = "";
                    while(x<=nStaruser){
                        System.out.println(useroutput);
                        useroutput += "*";
                        x++;
                    }
                }else{
                    System.out.println("Not between 1 and 15");
                }
            }else{
                System.out.println("Not an integer");
            }
            System.out.println("Continue? (Y,y)");
            char answer = scan.next().charAt(0);
            if(answer == 'Y' || answer == 'y'){
                booleancontroller = true;
            }else{
                booleancontroller = false;
            }
        }
    }
}
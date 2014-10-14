import java.util.Scanner; //calls scanner class
import java.util.Random;    //call random class

class Roulette{ //created class
    public static void main(String[] args){ //created main method
        
        Scanner scan = new Scanner(System.in);  //creat enew instance of scanner class
        Random rand = new Random(); //create new instance fo random class
        
        System.out.println("Guess a roulette number. (0-37, 37 is for a guess of 00):");
        
        if(scan.hasNextInt()){  //check for integer
            int number = scan.nextInt();    //sets input as number
            if(number<38&&number>=0){   //range check
                int numberwins = 0, total = 0,numberloses = 0;  //declare variables outisde loop for printing
                for(int x = 0; x<1000;x++){ //loop that runs 1000 times
                    int counter = 0;    //set counter back to 0 every loop of the 1000 loop
                    for(int i = 0;i<100;i++){   //loop that runs 100 times
                        int landon = rand.nextInt(38);  //creates random number between 0 and 37
                        if(landon == number){   //if the number that is landed on is equal to the number you guessed, u won once 
                            counter++;  // counter counts the amount fo tmes your mnmber is landed on
                        }
                    }
                    if(counter*36==0){  //if you winning are 0 
                        numberloses++;  //add one to number of loses
                    }
                    if(counter*36>100){   //if you proffitted
                        numberwins++;   //add one to number of wins
                    }
                    total += (counter*36);  //compound winnings to the total amount of winning
                }
                System.out.println("Loses: "+numberloses + "\nWins: "+numberwins+"\nTotal Money earned: $"+total);  //output num loses, wins , and total amount won.
            }
        }
    }
}

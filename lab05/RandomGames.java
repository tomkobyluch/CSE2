//Tom Kobyluch

import java.util.Random;
import java.util.Scanner;       //call scanner to use for input

class RandomGames{
    public static void main(String[] args){ //main method
        
        Scanner scan = new Scanner(System.in);      //create new instance of scanner class
        
        System.out.println("Pick game: Roulette (R,r), Craps (C,c), Pick a card (P,p)");    //prompt user for input
        char gamechoice = scan.next().charAt(0);
        Random rand = new Random(); 
        
        switch(gamechoice){
            case 'R': 
            case 'r': int roulette = rand.nextInt(38);
                      String roulettestr = Integer.toString(roulette);
                      if(roulette==37){roulettestr="00";} ;    
                      System.out.println("Roulette:"+roulettestr);
            break;
            
            case 'C': 
            case 'c': int dice1 = rand.nextInt(6)+1; 
                      int dice2 = rand.nextInt(6)+1; 
                      System.out.println(dice1+" + "+dice2+ " = "+(dice1+dice2));
                      break;
            
            case 'P': 
            case 'p': int suite = rand.nextInt(4)+1;
                      String namesuite = "";
                      int cardnum = rand.nextInt(13)+2;
                      String cardname = Integer.toString(cardnum);
                      switch(cardnum){
                                      case 11: cardname = "Jack";
                                               break;
                                      case 12: cardname = "Queen";
                                               break;
                                      case 13: cardname = "King";
                                               break;
                                      case 14: cardname = "Ace";
                                               break;         
                                  }
                      switch(suite){
                          case 1: namesuite = "Hearts";
                                  break;
                          case 2: namesuite = "Diamonds";   
                                  break;
                          case 3: namesuite = "Clubs";
                                  break;
                          case 4: namesuite = "Spades";
                                  break;
                      }
            System.out.println(cardname+" of "+namesuite);          
            break;
            
            default:System.out.println("Error: Enter R,r,C,c,P,p");
            return;
        }
        
    }
}
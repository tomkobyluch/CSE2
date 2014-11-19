import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  public static void simulateOdds(){
int notdupes = 0;
      int acecounter = 0;
      int kingcounter = 0;
      int queencounter = 0;
      int jackcounter = 0;
      int twocounter = 0;
      int three = 0;
      int four = 0;
      int five = 0;
      int six = 0;
      int seven = 0;
      int eight = 0;
      int nine = 0;
      int ten = 0;
      
      for(int y = 0;y<10000;y++){    //j is the current card we are checking for pairs
        int[] deck = new int[52]; //creat new deck
        for(int i = 0;i<deck.length;i++){     //fills my deck
          deck[i] = i;
        } 
      
        int[] hand = new int[5];      //code section to get hand
        Random rand = new Random();
        int position = 0;
        for(int x = 0; x<hand.length;x++){
            position = rand.nextInt(52); 
            while(deck[position] == -1){    //this loop checks if the number in the deck is taken, and gets new random if it is
                position = rand.nextInt(52); 
            }
            hand[x] = deck[position];
            deck[position] = -1;
      }
      
      String[] deckstring = new String[52]; //converted deck to have all the proper numbers and letters
      for(int i = 0;i<deckstring.length;i++){     //fills my deck
          deckstring[i] = Integer.toString(i-2);
          if(i>13){
              deckstring[i] = Integer.toString((i%13)-2);
          }
          if(i%13==0){
              deckstring[i]="A";
          }
          if(i%13==1){
              deckstring[i]="K";
          }
          if(i%13==2){
              deckstring[i]="Q";
          }
          if(i%13==3){
              deckstring[i]="J";
          }
          
      }
      
      for(int i = 0;i<deck.length;i++){     //refills my deck because it gets screwed up when hand drawer uses it
          deck[i] = i;
      } 
      
      //String stringj = deckstring[j];   //convert my card in number form to string form to check against my string form deck
      
      String[] stringhand = new String[5];  //converting array hand to 2-10 and a,k,q,j to easily check for pairs
      for(int i = 0;i<5;i++){
          stringhand[i] = deckstring[hand[i]];
      }
      
      outerloop:
      for(int i = 0;i<hand.length;i++){
          for(int x = i+1;x<hand.length;x++){
              if(i != x && stringhand[i].equals(stringhand[x])){   //makes sure it doesnt say itself is dupe
                  if(stringhand[i].equals("A")){        
                      acecounter++;
                      break outerloop;
                  }
                  if(stringhand[i].equals("K")){       
                      kingcounter++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("Q")){      
                      queencounter++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("J")){      
                      jackcounter++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("2")){       
                      twocounter++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("3")){       
                      three++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("4")){        
                      four++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("5")){      
                      five++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("6")){      
                      six++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("7")){   
                      seven++;
                      break outerloop;
                  }
                   if(stringhand[i].equals("8")){     
                      eight++;
                      break outerloop;
                  }
                  if(stringhand[i].equals("9")){    
                      nine++;
                      break outerloop;
                  }
                  if(stringhand[i].equals("10")){      
                      ten++;
                      break outerloop;
                  }
                  
              }
          }
      }
      }
      System.out.println("Aces: "+ acecounter);
      System.out.println("Kings: "+kingcounter);
      System.out.println("Queens: "+queencounter);
      System.out.println("Jacks: "+jackcounter);
      System.out.println("2s: "+ twocounter);
      System.out.println("3s: "+ three);
      System.out.println("4s: "+four);
      System.out.println("5s: "+five);
      System.out.println("6s: "+six);
      System.out.println("7s: "+seven);
      System.out.println("8s: "+eight);
      System.out.println("9s: "+nine);
      System.out.println("10s: "+ten);
      System.out.println("Not Dupes: "+ Integer.toString(10000-(acecounter+kingcounter+queencounter+jackcounter+twocounter+three+four+five+six+seven+eight+nine+ten)));
    }
  
  public static void showHands(){
      boolean control = true;
      Scanner scan = new Scanner(System.in);
      do{
      int[] deck = new int[52]; 
      for(int i = 0;i<deck.length;i++){     //fills my deck
          deck[i] = i;
          
      }
      
      int[] hand = new int[5];//code section to get hand
      Random rand = new Random();
      int position = 0;
      for(int x = 0; x<hand.length;x++){
        position = rand.nextInt(52); 
        while(deck[position] == -1){    //this loop checks if the number in the deck is taken, and gets new random if it is
            position = rand.nextInt(52); 
        }
        hand[x] = deck[position];
        deck[position] = -1;
      }
      
      String[] deckstring = new String[52]; //converted deck to have all the proper numbers and letters
      for(int i = 0;i<deckstring.length;i++){     //fills my deck
          deckstring[i] = Integer.toString(i-2);
          if(i>13){
              deckstring[i] = Integer.toString((i%13)-2);
          }
          if(i%13==0){
              deckstring[i]="A";
          }
          if(i%13==1){
              deckstring[i]="K";
          }
          if(i%13==2){
              deckstring[i]="Q";
          }
          if(i%13==3){
              deckstring[i]="J";
          }
          
      }
      
      System.out.print("Clubs: ");//outputs clubs cards
      for(int i = 0;i<hand.length;i++){
          if(hand[i]<14){
              System.out.print(deckstring[hand[i]] + "  ");
          }
      }
      System.out.println();
      System.out.print("Diamonds: ");//outputs Diamonds cards
      for(int i = 0;i<hand.length;i++){
          if(hand[i]>13&&hand[i]<27){
              System.out.print(deckstring[hand[i]] + "  ");
          }
      }
      System.out.println();
      System.out.print("Hearts: ");//outputs Diamonds cards
      for(int i = 0;i<hand.length;i++){
          if(hand[i]>26&&hand[i]<40){
              System.out.print(deckstring[hand[i]] + "  ");
          }
      }
      System.out.println();
      System.out.print("Spades: ");//outputs Diamonds cards
      for(int i = 0;i<hand.length;i++){
          if(hand[i]>39){
              System.out.print(deckstring[hand[i]] + "  ");
          }
      }
      System.out.println("\nAnother hand? (Y or y for yes | Anything else for no)");
      char answer = scan.next().charAt(0);
      if(answer == 'Y' || answer == 'y'){
      }else{
          control = false;
      }
      }while(control == true); 
  }
  
}
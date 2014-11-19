//Tom Kobyluch
//11-18-14
//HW10
//This program first gives the user a random hand of 5 cards from a standard deck of cards and keeps gives new hands until the user says no. After this the odds of getting 1 pair of 
//each card in a hand are computed over 10000 hands
//

import java.util.Random;        //imopoprt random class
import java.util.Scanner;   //import scanner class
public class PokerOdds{ //declare calss
  public static void main(String [] arg){   //declare main method
    showHands();    //run the random rands given section
    simulateOdds(); //run the 10000 odds section
  }
  
  public static void simulateOdds(){    //simulates odds of getting 1 pair of certain card over 10000 hands
int notdupes = 0;           //all theses counters are used to keep track of which card had a pair
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
      
      for(int y = 0;y<10000;y++){    //main loop that runs everything 10000 times
        int[] deck = new int[52]; //creat new deck
        for(int i = 0;i<deck.length;i++){     //fills my deck
          deck[i] = i;
        } 
      
        int[] hand = new int[5];      //code section to get hand
        Random rand = new Random();
        int position = 0;
        for(int x = 0; x<hand.length;x++){  //will give each elemnt of 5 length array a random number
            position = rand.nextInt(52);    //position refers to position in the main deck
            while(deck[position] == -1){    //this loop checks if the number in the deck is taken, and gets new random if it is
                position = rand.nextInt(52); //new random if pos taken
            }
            hand[x] = deck[position];   //sets array value
            deck[position] = -1;    //sets deck element to -1 to give the loop an indication of whats already taken
      }
      
      String[] deckstring = new String[52]; //converted deck to have all the proper numbers and letters
      for(int i = 0;i<deckstring.length;i++){     //fills my deck
          deckstring[i] = Integer.toString(i-2);    //all the numbers under 13 just need to be decreased by 2
          if(i>13){
              deckstring[i] = Integer.toString((i%13)-2);   //all the ones over that are decreades by 2 after mod 13
          }
          if(i%13==0){              //0 is for aces
              deckstring[i]="A";
          }
          if(i%13==1){              //remainder 1 is for kings
              deckstring[i]="K";
          }
          if(i%13==2){              //remainder 2 is for queens
              deckstring[i]="Q";
          }
          if(i%13==3){              //remainder 3 is for jacks
              deckstring[i]="J";
          }
          
      }
      
      for(int i = 0;i<deck.length;i++){     //refills my deck because it gets screwed up when hand drawer uses it
          deck[i] = i;
      } 
      
      //String stringj = deckstring[j];   //convert my card in number form to string form to check against my string form deck
      
      String[] stringhand = new String[5];  //converting array hand to 2-10 and a,k,q,j to easily check for pairs
      for(int i = 0;i<5;i++){   //for every elemnt in the hand
          stringhand[i] = deckstring[hand[i]];  //convert its orig position to new one in the string deck
      }
      
      outerloop:    //jump for hopping out of 2 loops
      for(int i = 0;i<hand.length;i++){ //loops checks every elemnt in hand
          for(int x = i+1;x<hand.length;x++){   //against all the other elemtns to check for dupe
              if(i != x && stringhand[i].equals(stringhand[x])){   //makes sure it doesnt say itself is dupe and check if equal
                  if(stringhand[i].equals("A")){            //all these if statemtns check which card has the duplicate and adds to the cards respective counter     
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
      System.out.println("Aces: "+ acecounter);     //these output the numbers of duplicates in the 10000 hands
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
  
  public static void showHands(){   //method to show users random hands
      boolean control = true;
      Scanner scan = new Scanner(System.in);
      do{   //loops repeats until user says no
      int[] deck = new int[52];     //make a new deck
      for(int i = 0;i<deck.length;i++){     //fills my deck
          deck[i] = i;
          
      }
      
      int[] hand = new int[5];//code section to get hand
      Random rand = new Random();
      int position = 0; 
      for(int x = 0; x<hand.length;x++){    //sets 5 elements of the array
        position = rand.nextInt(52); //rand vbalue from deck array
        while(deck[position] == -1){    //this loop checks if the number in the deck is taken, and gets new random if it is
            position = rand.nextInt(52); 
        }
        hand[x] = deck[position];   //set array value
        deck[position] = -1; pos refers to pos in deck
      }
      
      String[] deckstring = new String[52]; //converted deck to have all the proper numbers and letters
      for(int i = 0;i<deckstring.length;i++){     //fills my deck
          deckstring[i] = Integer.toString(i-2);      //all the numbers under 13 just need to be decreased by 2
          if(i>13){
              deckstring[i] = Integer.toString((i%13)-2);  //all the ones over that are decreades by 2 after mod 13 to convert from 0-52 to 2-10
          }
          if(i%13==0){
              deckstring[i]="A";//remainder 0 is for aces
          }
          if(i%13==1){
              deckstring[i]="K";//remainder 1 is for kings
          }
          if(i%13==2){
              deckstring[i]="Q";//remainder 2 is for queens
          }
          if(i%13==3){
              deckstring[i]="J";//remainder 3 is for jacks
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
      System.out.println("\nAnother hand? (Y or y for yes | Anything else for no)");    //prompt user
      char answer = scan.next().charAt(0);
      if(answer == 'Y' || answer == 'y'){   //if user enters y or Y continue, else quit
      }else{
          control = false;
      }
      }while(control == true); 
  }
  
}
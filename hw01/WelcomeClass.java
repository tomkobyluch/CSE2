import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WelcomeClass{

public static void main( String args[] ){
    int j = 0;
        int dupes=0; //main counter of pairs for certain card
      int othercounter = 0;
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
      
      int counter = 0;
      for(int i = 0;i<hand.length;i++){
          for(int x = i+1;x<hand.length;x++){
              if(i != x && stringhand[i].equals(stringhand[x])){   //makes sure it doesnt say itself is dupe
                  if(j==hand[i]){        //main loop only checks for any pair, this loop makes sure its a pair of the current card we are checking
                      counter++;
                  }
              }
          }
      }
      if(counter == 1){ //if we have one pair of the current card, add one to main counter, dupes. This will be done 1000 times.
          dupes++;
      }else{othercounter++;}
      }
      
      System.out.println(j+" - Pairs: "+dupes);
      System.out.println(j+" - Not Pairs: "+othercounter);
      
      
}
}
//PEMDAS
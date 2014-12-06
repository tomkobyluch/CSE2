//Tom Kobyluch
//12-5-12
//HW11
//This program gives user a random hand and tells what the hand type is. 

import java.util.Scanner;
import java.util.Arrays;

public class PokerHands{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        char[] suites = new char[]{'c','d','h','s'};
        char[] cardvalue = new char[]{'a','k','q','j','t','9','8','7','6','5','4','3','2'}; //t for 10. onyl lowercase are correct
        char[][] userhand = new char[5][2]; 
        fivecards(userhand,scan,suites,cardvalue);
    }
    
    public static void fivecards(char[][] userhand,Scanner scan,char[] suites,char[] cardvalue){                 //this method utilizes getInput 5 times to make a full hand, check for dupes, tells what type of hand, and ask if another hand
        char answer = 'n';
        char[] ans = new char[]{'y','Y'};       //this is to send getInput
        do{                                 //main loop for more hands
            for(int i = 0;i<5;i++){             //five cards storing to values each, suite and number
                do{     //this loop is for repeating a card input if it was a dupe
                    System.out.println("Enter the suit (lowercase): 'c', 'd', 'h', or 's'- ");  //universal code except this text
                    userhand[i][0] = getInput(scan,suites);
                    System.out.println("Enter one of 'a', 'k', 'q', 'j', 't(for 10)',9,8, ...'2' (lowercase)- ");  //universal code except this text
                    userhand[i][1] = getInput(scan,cardvalue); 
                }while(twoDimensionalDupeCheck(userhand[i][0],userhand[i][1],userhand,i));//repeats if dupe card
            }
            String HandType = HandType(userhand);
            System.out.println("\n\nHand: "+Arrays.deepToString(userhand));
            System.out.println(HandType);
            
            System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");
            answer = scan.next().charAt(0);
        }while(answer == 'y' || answer == 'Y'); //stop program only if user doesnt say yes to another hand
    }
    
    public static String HandType(char[][] userhand){
        String HandType = "";
        //flush check 
        boolean flush = true;            
        for(int i = 0;i < 5;i++){                  
            for(int j = 0;j < 5;j++){
                if(userhand[i][0] == userhand[j][0]){ //all suites should be same (the first poosition of every element of 2d array), if not, then flush false 
                }else{
                    flush = false;
                }
            }
        }
        int[][] userhandint = new int[5][2];
        for(int h = 0;h < 5;h++){               //create 2d array of hand with only ints
            userhandint[h][1] = ((int)userhand[h][1]-48);
            if(userhand[h][1] == 't'){
                userhandint[h][1] = 10;         //if its letter card, had to use if statement to convert to int
            }
            if(userhand[h][1] == 'j'){
                userhandint[h][1] = 11;
            }
            if(userhand[h][1] == 'q'){
                userhandint[h][1] = 12;
            }
            if(userhand[h][1] == 'k'){
                userhandint[h][1] = 13;
            }
            if(userhand[h][1] == 'a'){
                userhandint[h][1] = 14;
            }
        }
        //straight check
        boolean straight = true;
        int[] straightcheck = new int[5];
        for(int y = 0;y<5;y++){ //set straight deck equals to the users hand but only card values
            straightcheck[y] = userhandint[y][1];
        }
        Arrays.sort(straightcheck);
        System.out.println(Arrays.toString(straightcheck));
        for(int g = 0;g<4;g++){ //if any are not sequencial, return false
            if(straightcheck[g] != straightcheck[g+1]-1){
                straight = false;
            }
        }
        //4 of kind check
        boolean fourofkind = false;
        if(straightcheck[0]==straightcheck[1] && straightcheck[1]==straightcheck[2] && straightcheck[2]==straightcheck[3]){ //if the first 4 are same
            fourofkind = true;
        }
        if(straightcheck[1]==straightcheck[2] && straightcheck[2]==straightcheck[3] && straightcheck[3]==straightcheck[4]){ //or last 4 are same, its 4 of a kind
            fourofkind = true;
        }
        //Full house check 
        boolean fullhouse = false;
        if(straightcheck[0]==straightcheck[1]&&straightcheck[1]==straightcheck[2] && straightcheck[3] == straightcheck[4] && straightcheck[0]!=straightcheck[3]){
            fullhouse = true;
        }
        if(straightcheck[4]==straightcheck[3]&&straightcheck[3]==straightcheck[2] && straightcheck[0] == straightcheck[1] && straightcheck[0]!=straightcheck[3]){
            fullhouse = true;
        }
        //3 kind check 
        boolean threekind = false;
        if(straightcheck[0]==straightcheck[1]&&straightcheck[1]==straightcheck[2]){
            threekind = true;
        }
        if(straightcheck[4]==straightcheck[3]&&straightcheck[3]==straightcheck[2]){
            threekind = true;
        }
        //Two pair check
        boolean twopair = false;
        int counter = 0;
        for(int c = 0;c<5;c++){     //checks everynumber aginst every other number to check for pairs
            for(int q = 0;q<5;q++){
                if(c!=q && straightcheck[c]==straightcheck[q]){
                    counter++;
                }
            }
        }
        if(counter == 4){    //this value is what counter would be when there are 2 pairs
            twopair = true;
        }
        //onepair check
        boolean onepair = false;
        for(int k = 0;k<5;k++){
            for(int u = 0;u<5;u++){
                if(k!=u && straightcheck[k]==straightcheck[u]){
                    onepair = true;
                }
            }
        }
        
        if(fourofkind == true){
            HandType = "Four of a kind";        //make handtype what ever boolean is true
            return HandType;
        }
        if(fullhouse == true){
            HandType = "Full House";
            return HandType;
        }
        if(threekind == true){
            HandType = "Tree of a kind";
            return HandType;
        }
        if(twopair==true){
            HandType = "Two Pair";
            return HandType;
        }
        if(onepair==true){
            HandType = "One Pair";
            return HandType;
        }
        if(straight == true && flush == true){
            HandType = "Straight flush";
            if(straightcheck[0]==10 && straightcheck[1]==11 && straightcheck[2]==12 && straightcheck[3]==13 && straightcheck[4]==14){       
                HandType = "Royal Flush";
            }
            return HandType;
        }
        if(straight == true){
            HandType = "Straight";
            return HandType;
        }
        if(flush == true){
            HandType = "Flush";
            return HandType;
        }
        HandType = "High Card";
        return HandType;
    }
    
    public static boolean twoDimensionalDupeCheck(char suite,char value,char[][] userhand,int currentposition){     //checks if there is a duped card
        for(int i = 0;i<5;i++){
            if(i != currentposition && suite == userhand[i][0] && value == userhand[i][1]){
                System.out.println("Already have that card, try again");
                return true;
            }
        }
        return false; 
    }
    
    public static char getInput(Scanner scan, char[] stringlist){       //this method utilizes checkOneChar and charAginstList to take in 1 char from a certain list
        String tempinput;                                  
        char input = 'Q';
        do{
            tempinput = scan.next();
        }while(!checkOneChar(tempinput) || !charAgainstList(stringlist,tempinput)); 
        input = tempinput.charAt(0);
        return input;                                                                             
    } 
  
    public static boolean checkOneChar(String tempinput){       //used in getInput, check if there is only one char in input
        if(tempinput.length() != 1){                                           
            System.out.println("Not single character, try again");                
            return false;                                                                
        }
    return true;
    }
  
    public static boolean charAgainstList(char[] stringlist,String tempinput){      //if there is onyl one char in input, this method checks it aginast a given list
    for(int i = 0;i<stringlist.length;i++){
        if(tempinput.charAt(0) == stringlist[i]){ 
            return true;                                                                         
        }
    }
    System.out.println("Not on list " + Arrays.toString(stringlist) + ", try again"); 
    return false;
    }
  
}

//1:35 hours

//3:53 start
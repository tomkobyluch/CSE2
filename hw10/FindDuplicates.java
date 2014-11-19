//Tom Kobyluch
//11-18-14
//HW10
//This program take in ten integers and check them against each other to see if there are duplicates. If there is exactly one duplicate that must be confirmed.
//

import java.util.Scanner; //import scanner class
public class FindDuplicates{  //class declare
  public static void main(String [] arg){ //main statement declared
    Scanner scan=new Scanner(System.in);  //create new scanner
    int num[]=new int[10];  //create array for the input
    String answer=""; //
    do{ //main loop for asking user to go again
      System.out.print("Enter 10 ints- ");  //prompt user
      for(int j=0;j<10;j++){  //take in all the integers and store them in array
        num[j]=scan.nextInt();
      }
      String out="The array ";  //output numbers
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //if it has dups display this
        out+="has ";
      }
      else{
        out+="does not have ";  //else display this
      }
      out+="duplicates.";
      System.out.println(out);  //output the completed string
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");  //ask user if they want to go agian
      answer=scan.next();   //take in the users answer
    }while(answer.equals("Y") || answer.equals("y")); //restart loop only if answer is Y or y
  }

  public static String listArray(int num[]){  //method for display arrays
    String out="{";
    for(int j=0;j<num.length;j++){  //print each elemnt of array with comma inbetween, {} at end
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] num){   //checks if there is dupe in array
      boolean dupes = false;  
      for(int i = 0;i<num.length;i++){  //check every elemnt of array
          for(int x = 0;x<num.length;x++){  //against every other element of the array
              if(i != x && num[i] == num[x]){   //makes sure it doesnt say itself is dupe
                  dupes = true; //only if dupe is found willl dupes boolena be switched to true
              }
          }
      }
      return dupes; //return bollean
  }
  
  public static boolean exactlyOneDup(int[] num){ //check if there is only one dupe
      boolean dupes = false;
      int counter = 0;
      for(int i = 0;i<num.length;i++){//check every element of array
          for(int x = i;x<num.length;x++){  //against every other element
              if(i != x && num[i] == num[x]){   //makes sure it doesnt say itself is dupe
                  counter++;  //add to counter for every dupe
              }
          }
      }
      if(counter == 1){ //only is counter is 1 will it return true, 1 duplicate.
          dupes = true; //set true if one dupe
      }
      return dupes; //return boolean
  }
  
}


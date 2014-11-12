import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeClass{

public static void main( String args[] ){
	Scanner scan = new Scanner(System.in);
	int i = 4; int j = 5;
	int sum = sum(i,j);
	System.out.println(sum);
}

public static int sum(int i, int j) {
    // Fill in the code here to return the sum of i and j.
     return i+j;
  }
}

//PEMDAS
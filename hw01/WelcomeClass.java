import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class WelcomeClass{

    public static void main( String args[] ){
        
        int[]u = new int[]{1,2,3,4};
        int[]v = new int[]{1,21,4};
        enigma(u,enigma(u,v));
        
    }
    
    public static int[] enigma(int[] x, int[] y){
        int[]temp;
        temp = x;
        temp[y[1]]=42;
        System.out.print(x[0]);
        return temp;
    }
}
//PEMDAS
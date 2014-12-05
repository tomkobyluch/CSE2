import java.util.Random;
import java.util.Arrays;

public class lab13{
    public static void main(String[] arg){
        int[][] ragged = new int[5][];
        Random rand = new Random();
        
        ragged[0] = new int[5];
        ragged[1] = new int[8];
        ragged[2] = new int[11];
        ragged[3] = new int[14];
        ragged[4] = new int[17];
        
        int r = 0;
        for(int x = 5;x<19;x+=3){
            for(int i = 0;i<x;i++){
                ragged[r][i] = rand.nextInt(40);
            }
            r++;
        }
        
        System.out.println("Unsorted Multi Array");
        for(int i = 0;i<5;i++){
            System.out.print(Arrays.toString(ragged[i])+"\n");
        }
        
        for(int i = 0;i<5;i++){
            Arrays.sort(ragged[i]);
        }
        
        
        System.out.println("\nSorted Multi Array");
        for(int i = 0;i<5;i++){
            System.out.print(Arrays.toString(ragged[i])+"\n");
        }
        
        
        
    }
}
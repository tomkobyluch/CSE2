//Tom Kobyluch
//HW11 Matrix Sorter
//This program sorts and displays a 3 dimensional array

import java.util.Random;    
import java.util.Arrays;

class MatrixSorter{
    public static void main(String[] arg){      
        int mat3d[][][];        //creae 3d array
        mat3d=buildMat3d(); //full it
        show(mat3d);        //display it
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));      //find and siplay min of array
        System.out.println("After sorting the 3rd matrix we get");  //sort and display
        //sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int findMin(int [][][] threed){       //this methodf finds mion value in 3d array
        int minimum = threed[0][0][0];      //create new array to shuffle the min
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < (i*2)+3;j++){
                for (int k = 0;k < i+j+1;k++){
                    if (threed[i][j][k] < minimum){
                        minimum = threed[i][j][k];
                    }
                }
            }
       
        }
        int h = 0;
        return minimum;     //return min
    }
    
    public static void show(int [][][] threed){     //array to output 3d array
        for (int i = 0;i < 3;i++){      //loopp displays slabs with arithmetic rowsa and columns
            System.out.println("-----------------------Slab "+ (i+1));
            for(int j = 0;j < threed[i].length;j++){
                for (int k = 0;k < threed[i][j].length;k++){        //makes sure the length is same as the amount being output
                    System.out.print(threed[i][j][k] + "  ");
                }
                System.out.println();
            }
        }
        System.out.println("--------------------------");
    }
    
    public static int[][][] buildMat3d(){       //method fills initial 3d ARRAY
        Random rand = new Random(); //create new random instance
        int[][][] threed = new int[3][0][0];    //define array
        for(int i = 0;i<threed.length;i++){ //for all values in the outside that are less then length
            threed[i]=new int [i*2+3][];    //length set to prevent out of bounds
            for(int j = 0;j<3+(2*i);j++){   //for all inner values
                threed[i][j]=new int [i+j+1];   //set length to prevent out of bounds
                for(int k = 0;k<i+j+1;k++){ //most inner values actually set to rtadnom number
                    threed[i][j][k] = rand.nextInt(100);    //set to random number between 1 and 100
                }
            }
        }
        return threed;  //return your 3d array
    }
    
    
}
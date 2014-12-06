import java.util.Random;
import java.util.Arrays;

class MatrixSorter{
    public static void main(String[] arg){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        //sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int findMin(int [][][] threed){
        int minimum = threed[0][0][0];
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < (i*2)+3;j++){
                for (int k = 0;k < i+j+1;k++){
                    if (threed[i][j][k] < minimum){
                        minimum = threed[i][j][k];
                    }
                }
            }
       
        }
        return minimum;
    }
    
    public static void show(int [][][] threed){
        for (int i = 0;i < 3;i++){
            System.out.println("-----------------------Slab "+ (i+1));
            for(int j = 0;j < threed[i].length;j++){
                for (int k = 0;k < threed[i][j].length;k++){
                    System.out.print(threed[i][j][k] + "  ");
                }
                System.out.println();
            }
        }
        System.out.println("--------------------------");
    }
    
    public static int[][][] buildMat3d(){
        Random rand = new Random();
        int[][][] threed = new int[3][0][0];
        for(int i = 0;i<threed.length;i++){
            threed[i]=new int [i*2+3][];
            for(int j = 0;j<3+(2*i);j++){
                threed[i][j]=new int [i+j+1];
                for(int k = 0;k<i+j+1;k++){
                    threed[i][j][k] = rand.nextInt(100);
                }
            }
        }
        return threed;
    }
    
    
}
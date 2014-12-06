import java.util.Random;
import java.util.Arrays;

class MatrixSorter{
    public static void main(String[] arg){
        //int mat3d[][][];
        //mat3d=buildMat3d();
        //show(mat3d);
        //System.out.println("The smallest entry in the 3D matrix is "+
  		//findMin(mat3d));
        //System.out.println("After sorting the 3rd matrix we get");
        //sort(mat3d[2]);
        //show(mat3d);
    }
    
    public static void show(int[][][] threed){
        System.out.print(Arrays.deepToString(threed[0]));
    }
    
    public static int[][][] buildMat3d(){
        Random rand = new Random();
        int[][][] threed = new int[3][7][9];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3+2*i;j++){
                for(int k = 0;k<i+j+1;k++){
                    threed[i][j][k] = rand.nextInt(100);
                }
            }
        }
        return threed;
    }
}
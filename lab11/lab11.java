import java.util.Scanner;

class lab11{
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        int[] inputs = new int[10];
        for(int x = 0; x<inputs.length; x++){
            inputs[x] = scan.nextInt();
        }
        
        int index = 0;
        int min = inputs[0];
        for (int i=1; i<inputs.length; i++){
            if (inputs[i] < min) {
                min = inputs[i];
                index = i;
            }
        }
        System.out.println("Min: "+min);
        
        index = 0;
        int max = inputs[0];
        for (int i=1; i<inputs.length; i++){
            if (inputs[i] > max) {
                max = inputs[i];
                index = i;
            }
        }
        System.out.println("Max: "+max);
        
        int sum = 0;
        for(int x = 0; x< inputs.length;x++){
            sum +=inputs[x];
        }
        System.out.println("Sum: "+sum);
        
        int[] inputsrev = new int[10];
        for(int x = 0; x<inputs.length;x++){
            inputsrev[x] = inputs[inputsrev.length-1-x];
        }
        String numofspaces = "    ";
        for(int x = 0;x<10;x++){ 
            if(inputs[x]>9 || inputs[x]<0){
                numofspaces = "   ";
            }else{
                numofspaces = "    ";
            }
            System.out.println(inputs[x]+ numofspaces +inputsrev[x]);
        }
    }
}
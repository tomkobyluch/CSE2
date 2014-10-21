import java.util.Scanner;

class NumberStack{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        if(scan.hasNextInt()){
            int input = scan.nextInt();
            if(input>0 && input <10){
                
                for(int x = 1;x<=input;x++){            //main for loop
                    String numberofhyphens = "";
                    String numberofspaces = "";
                    
                    for(int u = 0; u<input; u++){ //calc max number of spaces infront of 1
                        numberofspaces+=" ";
                    }
                    
                    for( int j=1;j<=((x*2)-1);j++){ //calc number of hyphens
                        numberofhyphens += "-";
                    }
                    
                    for( int s=1;s<x;s++){  //take of spaces infront of next numbers to create pyramid
                        numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1);
                    }
                    
                    for(int n = 0;n<x;n++){ //this loop controls how many lines of the number there are
                        System.out.print("\n"+numberofspaces);
                        for(int t = 0;t<((x*2)-1);t++){ //this loop prints the amount of the number on one line
                            System.out.print(x);
                        }
                    }
                    System.out.print("\n" + numberofspaces + numberofhyphens);
                    
                }
                
                int q = 1;          //main while loop
                while(q<=input){
                    String numberofhyphens = "";
                    String numberofspaces = "";
                    
                    int l = 0;
                    while(l<input){ //calc max number of spaces infront of 1
                        numberofspaces+=" ";
                        l++;
                    }
                    
                    int b = 1;
                    while( b<=((q*2)-1)){ //calc number of hyphens
                        numberofhyphens += "-";
                        b++;
                    }
                    
                    int f = 1;
                    while( f< q){  //take of spaces infront of next numbers to create pyramid
                        numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1);
                        f++;
                    }
                    
                    int m = 0;
                    while(m<q){ //this loop controls how many lines of the number there are
                        int r = 0;
                        System.out.print("\n"+numberofspaces);
                        while(r<((q*2)-1)){ //this loop prints the amount of the number on one line
                            System.out.print(q);
                            r++;
                        }
                        m++;
                    }
                    System.out.print("\n" + numberofspaces + numberofhyphens);
                    q++; 
                }
                
                int v = 1;          //main do - while loop
                do{
                    String numberofhyphens = "";
                    String numberofspaces = "";
                    
                    int c = 0;
                    do{ //calc max number of spaces infront of 1
                        numberofspaces+=" ";
                        c++;
                    }while(c<input);
                    
                    int z = 1;
                    do{ //calc number of hyphens
                        numberofhyphens += "-";
                        z++;
                    }while( z<=((v*2)-1));
                    
                    int p = 1;
                    do{  //take of spaces infront of next numbers to create pyramid
                        numberofspaces = numberofspaces.substring(0,numberofspaces.length()-1);
                        p++;
                    }while( p< v);
                    
                    int o = 0;
                    do{ //this loop controls how many lines of the number there are
                        int h = 0;
                        System.out.print("\n"+numberofspaces);
                        do{ //this loop prints the amount of the number on one line
                            System.out.print(v);
                            h++;
                        }while(h<((v*2)-1));
                        o++;
                    }while(o<v);
                    System.out.print("\n" + numberofspaces + numberofhyphens);
                    v++; 
                }while(v<=input);
                
                
                
            }
        }
    }
}
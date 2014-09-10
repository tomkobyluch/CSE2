import java.util.Scanner;

class Root{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a double:");
        double num = scan.nextDouble();
        double numcuberoot = Math.pow(num,(0.3333));
        System.out.println("This is a crude cubed root of that number: " + numcuberoot);
        System.out.println("This is that crude number cubed: "+ Math.pow(numcuberoot,3));
        
    }
}
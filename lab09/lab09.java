import java.util.Scanner;
public class lab09{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+ " is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+ ", and "+c+" are in ascending order");
  }
  
  public static int larger(int a, int b){
      int l = 0;
      if(a>b){l = a;}
      if(b>a){l = b;}
      return l;
  }
  
  public static int getInt(Scanner scan){
      int number = 0;
      if(scan.hasNextInt()){
        number = scan.nextInt();
      }else{
          System.out.println("Not integer");
          System.exit(0);
      }
      return number;
  }
  
  public static boolean ascending(int a, int b, int c){
      boolean result;
      if(c>b&&b>a){result = true;}else{result = false;};
      return result;
      
  }
}  
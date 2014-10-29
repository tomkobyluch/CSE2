public class lab10{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int a, int digit){
        
        String stra = Integer.toString(a);
        if(digit>=0 && digit <=9){
            if(a < 0){
                stra = stra.substring(1);
                stra = "-" + digit + stra;
            }else{
            stra = digit + stra;
            }
        }
        a = Integer.parseInt(stra);
        return a;
    }
    
    public static int join(int a, int b){
        String stra = Integer.toString(a);
        String strb = Integer.toString(b);
        if(b < 0){
            strb = Integer.toString(b*-1);
        }
        if(a < 0 && b < 0){
            stra = Integer.toString(a*-1);
            strb = Integer.toString(b*-1);
        }
        String strc = stra + strb;
        int intc = Integer.parseInt(strc);
        return intc;
    }
    
}  
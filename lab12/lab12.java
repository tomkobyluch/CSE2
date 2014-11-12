public class lab12{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+"  + " + display(y) + "  = " +display(v));
    System.out.println(display(x)+"  + " + display(z) + "  = " +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+ " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+ " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+ " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double[] x, double[]y){
      boolean check = true;
      if(x.length == y.length){
          for(int index = 0; index < x.length;index++){
              if(x[index] != y[index]){
                  check = false;
                  break;
              }
          }
      }else{
          check = false;
      }
      return check;
  }
  
  public static double[] addArrays(double[] x, double[] y){
      int length = 0;
      int length2 = 0;
      if(x.length>y.length){
          length = y.length;
          length2 = x.length;
      }else{
          length = x.length;
          length2 = y.length;
      }
      double[] z = new double [length2];
      for(int index = 0; index<length2;index++){
          if(index < y.length){
              z[index] = x[index]+y[index];
          }
          if(index >= y.length){
              z[index] = x[index];
          }
      }
      return z;
  }
  
}
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
  
  //My code, made to fit above code
  
  public static boolean equals(double[] x, double[]y){
      boolean check = true;
      if(x.length == y.length){//nothing gets run if not same length, they are obvious not the same
          for(int index = 0; index < x.length;index++){ //loop check each elemnt against the corresponding, if 1 set doesnt match, the boolean is toggled and the loop is broken
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
      int length = 0;   //the shorter length
      int length2 = 0;  //the longer length
      if(x.length>y.length){    //checks which array is shorter
          length = y.length;
          length2 = x.length;
      }else{
          length = x.length;
          length2 = y.length;
      }
      double[] z = new double [length2];    //the combo array
      for(int index = 0; index<length2;index++){    //add the elements until it gets to end of short array, then the rest are just from the longer array
          if(index < length){
              z[index] = x[index]+y[index];
          }
          if(index >= length){
              z[index] = x[index];
          }
      }
      return z;
  }
  
}
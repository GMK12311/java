import java.io.*;
class Rectangle{
    int a;
    Rectangle(int l,int b){
       a=l*b;
    }
}
public class parameterizedConstructerDemo{
    public static void main(String args[]) {
      Rectangle r=new Rectangle(6,10);
      System.out.println("Area of rectangle is "+r.a);
    }
}

class Rectangle{
    int l,b,a;
    Rectangle(){
        l=5;
        b=8;
        a=l*b;
    }
}
public class DefaultConstructerDemo{
    public static void main(String args[]) {
      Rectangle r1=new Rectangle();
      System.out.println("Area of rectangle is "+r1.a);
    }
}

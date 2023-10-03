public class DefaultAccessSpecifierDemo{
    void display(){
        System.out.println("Hello world");
    }
    public static void main(String args[]) {
       DefaultClass dc=new DefaultClass();
       dc.display();
    }
}

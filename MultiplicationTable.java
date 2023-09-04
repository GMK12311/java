import java.io.*;
import java.util.*;
public class MultiplicationTable{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a integer number : ");
       int n=sc.nextInt();
       System.out.print("Enter no.of rows : ");
       int j=sc.nextInt();
       for(int i=1;i<=10;i++)
       {
         System.out.println(n+"*"+i+"="+(n*i));
       }
       
  }
}

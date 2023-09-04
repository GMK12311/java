import java.io.*;
import java.util.*;
public class DemoPrime_v_two {
    public static void main(String args[]) {
      int num,flag=0,i;
      System.out.print("Enter a integer to check prime or not : " );
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      for(i=2;i<=num;i++)
      {
          if(num%i==0)
          {
              flag=1;
              break;
             }
      }
       if(flag==1)
     {
           System.out.println(num+" is a prime " );
      }
      else
      {
         System.out.println(num+"is not prime ");
      }
    }
}
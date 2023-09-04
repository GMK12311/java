import java.io.*;
public class DemoPrime_V_three {
    public static void main(String args[]) {
      int num,flag=0,i;
      num=Integer.parseInt(args[0]);
      System.out.print("Enter a integer to check prime or not : " );
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
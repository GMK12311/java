import java.io.*;
import java.util.*;
public class DemoPrime {
    public static void main(String args[]) {
      int num=45,flag=0,i;
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
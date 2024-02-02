import java.util.Scanner;
import java.io.*;

public class countdigits
{
   public static void main(String args[])
   {
      int n;
      int digits=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the number: ");
      n=sc.nextInt();
      
      while(n!=0)
      {
         digits++;
         n=n/10;
      }
      
      System.out.println("\nThe Total Number of Digits = " +digits);
   }
}
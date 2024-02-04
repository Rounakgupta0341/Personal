import java.util.Scanner;
import java.io.*;
public class largest
{
   public static void main(String[] args)
   {
      int i, max;
      int a[] = new int[10];
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the array: ");
      for(i=0; i<10; i++)
         a[i] = sc.nextInt();
      
      max = a[0];
      for(i=1; i<10; i++)
      {
         if(max<a[i])
            max = a[i];
      }
      
      System.out.println("\nLargest Number = " +max);
   }
}
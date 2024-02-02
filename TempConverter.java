import java.util.Scanner;

public class TempConverter
 {
    public static void main(String agrs[])
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature which needs to be converted: ");
        int n =sc.nextInt();
        System.out.println("Enter 1 for Cel to Far and 2 for Far to Cel :");
        int m=sc.nextInt();
        sc.close();
        if(m!=2){
            int f=((n*9)/5)+32;
            System.out.println("Result= "+f);
        }else {
            int c=((n-32)*5)/9; 
            System.out.println("Result= "+c);
        }
     }
    }
            
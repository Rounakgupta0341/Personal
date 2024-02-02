import java.util.Scanner;
public class MinimumNumber
{
	public static void main(String[] args) 
	{
		int temp;
		int a[]=new int[5];
		int min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element");
		
		for(int i=0;i<5;i++)
		{
		    a[i]=sc.nextInt();
		}
	    min=a[0];
	    for(int i=1;i<5;i++)
	    {
	        if(a[i]<min)
	        {
	            min=a[i];
	        }
	    }
	    System.out.print("Minimum Value:"+min);
	}
}

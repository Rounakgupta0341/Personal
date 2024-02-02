public class Student
{
 public void Info(String x, int y)
{

    String name=x;
    int roll_no=y;

    System.out.println("Name is "+ name);
    System.out.println("Roll No. is " + roll_no);

}


public static void main(String args[])
{ 
    Student st = new Student();
    st.Info("John", 2);
}
}
     


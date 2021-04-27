import java.util.*;
class value
  {
  int n;
  void get()
    {
    Scanner in=new Scanner(System.in);
    System.out.print("\n\n\n\t\t\t WAP to print si \n");
    for(int i=1;i<80;i++)
      System.out.print("-");
    System.out.print("\n");
    System.out.print("enter a number:");
    n=in.nextInt();
    }
  }
class cube extends value
{
void show()
{
System.out.println("ans is"+(n*n*n));
for(int i=1;i<80;i++)
System.out.print("-");
System.out.print("\n\n\n\t\t\t Program Finished...");
}
}
class si1
  {
  public static void main(String args[])
    {
    cube ob=new cube();
    ob.get();
    ob.show();
    }
  }

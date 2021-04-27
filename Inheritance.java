import java.util.*;
class per
  {
  int p;
  Scanner in=new Scanner(System.in);
  void get()
    {
    System.out.print("Snter per:-");
    p=in.nextInt();
    }
  }
class result extends per
{
void show()
{
if(p>=36)
System.out.print("Pass");
else
System.out.print("Fail");
}
}
class ok1
  {
  public static void main(String agrs[])
    {
    result ob=new result();
    ob.get();
    ob.show();
    }
  }

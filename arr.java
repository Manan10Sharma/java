import java.util.*;
class arr
  {
  public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int[]a=new int[5];
    int i;
    for(i=0;i<5;i++)
      {
      System.out.println("Enter a num:");
      a[i]=in.nextInt();
      }
    for(i=0;i<5;i++)
      System.out.print(a[i]+",");
    }
  }

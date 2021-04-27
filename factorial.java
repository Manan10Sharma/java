import java.util.*;
class factorial
  {
  public static void main(String args[])
    {
    int f=1,j;
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number:");
    n=in.nextInt();
    for(j=1;j<=n;j++)
      {
      f=f*j;
      }
    System.out.println("Factorial:"+f);
    }
  }

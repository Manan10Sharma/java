import java.util.*;
public class odd_even
  {
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number:");
    n=s.nextInt();
    if(n%2==0)
      {
      System.out.println("even");
      }
    else
      System.out.println("odd");
    }
  }

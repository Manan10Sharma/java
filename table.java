import java.util.*;
class table
  {
  public static void main(String args[])
    {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number:");
    n=s.nextInt();
    System.out.println("Table:-");
    for(int a=1;a<=10;a++)
      {
      System.out.println(n+"*"+a+"="+n*a);
      }
    }
  }

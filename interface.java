import java.util.*;
interface Detail
  {
  public void get();
  public void show();
  }
class stud implements Detail
{
int r,p,a; 
String n;
Scanner in=new Scanner(System.in);
public void get()
{
System.out.println("Student Name:-");
n=in.nextLine();
System.out.println("Student Roll no:-"); 
r=in.nextInt();
System.out.println("Student Age:-"); 
a=in.nextInt();
System.out.println("Student Percentage:-"); 
p=in.nextInt();
}
public void show() 
{
System.out.println("Student Name:-"+n+"\nStudent Roll no:-"+r+ "\nStudent Age:-"+a+ "\nStudent Percentage:-"+p);
}
}
class teacher implements Detail
{
int i,s;
String n=new String();
Scanner in=new Scanner(System.in);
public void get()
{
System.out.println("Teacher Name:-");
n=in.nextLine();
System.out.println("Teacher Id:-"); 
i=in.nextInt();
System.out.println("Teacher Salary:-"); 
s=in.nextInt(); 
}
public void show() 
{
System.out.println("Teacher Name:-"+n+"\nTeacher Id:-"+i+"\nTeacher Salary:-"+s); 
}
}
class detl
{
  public static void main(String args[])
  {
    teacher ob=new teacher();
    stud ob1=new stud();
    ob1.get();
    ob1.show();
    ob.get();
    ob.show();
    }
  }

import java.util.Scanner;
class Employee
  {
  int Id,Salary;
  String N;
  void get()
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Employee Name:-");
    N = in.nextLine();
    System.out.print("Enter Employee Id:-");
    Id = in.nextInt();
    System.out.print("Enter Employee Salary:-");
    Salary = in.nextInt();
    }
  void set()
    {
    System.out.println("\n\t\t\tEmployee Id:-"+Id);
    System.out.println("\t\t\tEmployee Name:-"+N);
    System.out.println("\t\t\tEmployee Salary:-"+Salary);
    }
  }
class Company extends Employee
{
int RegNo;
String CN;
void show()
{
Scanner in = new Scanner(System.in);
System.out.print("Enter Company Name:-");
CN = in.nextLine();
System.out.print("Enter Registration No.:-");
RegNo = in.nextInt();
}
void Write()
{
System.out.println("\t\t\tRegistration No.:-"+RegNo);
System.out.println("\t\t\tCompany Name:-"+CN);
}
}
class inheritance
  {
  public static void main(String args[])
    {
    Company ob = new Company();
    ob.get();
    ob.show();
    ob.set();
    ob.Write();
    }
  }

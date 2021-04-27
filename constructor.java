import java.util.*;
class stud
  {
  String nm,course;
  int per;
  stud()
    {
    nm= new String("Manan Sharma");
    course= new String("BCA");
    per=50;
    }
  void show()
    {
    System.out.println("Name="+nm);
    System.out.println("Course="+course);
    System.out.println("Per="+per);
    }
  }
class result
  {
  public static void main(String args[])
    {
    stud ob=new stud();
    ob.show();
    }
  }

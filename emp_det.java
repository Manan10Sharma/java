class emp
  {
  int id,age;
  String nm,desig;
  public void get()
    {
    id=101;
    nm="manan";
    age=20;
    desig="xyz";
    }
  void show()
    {
    System.out.println("\n\n\n\t\t WAP in java to show emp detail");
    for(int i=1;i<80;i++)
      System.out.print("-");
    System.out.println("\n emp id:"+ id);
    System.out.println("\n emp nm:"+ nm);
    System.out.println("\n emp age:"+ age);
    System.out.println("\n emp desig:"+ desig);
    for(int i=1;i<80;i++)
      System.out.print("-");
    System.out.println("\n\n\n\t\t\t Program Finished...");
    }
  public static void main(String args[])
    {
    emp ob=new emp();
    ob.get();
    ob.show();
    }
  }

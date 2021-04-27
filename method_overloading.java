class maxi
  {
  int x,y,z;
  void set()
    {
    x=50; y=60;
    }
  void set(int i)
    {
    x=i; y=100;
    }
  void set(int i,int j)
    {
    x=i; y=j;
    }
  void show()
    {
    if(x>y)
      System.out.println("\n max is:-"+x);
    else
      System.out.println("\n max is:-"+y);
    }
  }
class exaover
  {
  public static void main(String agrs[])
    {
    maxi ob=new maxi();
    ob.set(); ob.show();
    ob.set(300); ob.show();
    ob.set(17,6); ob.show();
    }
  }

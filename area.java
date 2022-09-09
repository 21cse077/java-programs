package area;

/**
 *
 * @author Amrudha
 */
public class area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        System.out.println("rectangle");
        obj.getarea();
        obj.getperimeter();
        obj.resize(5);
        System.out.println("after resizing by 5");
        obj.getarea();
        obj.getperimeter();
        circle ob=new circle();
        System.out.println("circle");
        ob.getarea();
        ob.getperimeter();
        ob.resize(10);
        System.out.println("after resizing by 10");
        ob.getarea();
        ob.getperimeter();
    }
   
}
interface resizable
{
    public void resize(int x);
}
class rectangle implements resizable
{
  int length=10;
  int breadth=5;
  @Override
  public void resize(int x)
  {
    length=x;
    breadth=x;
  }
   public void getarea()
    {
     System.out.println("area..."+length*breadth);
    }
   public void getperimeter()
   {
     System.out.println("perimeter..."+(2*(length+breadth)));  
   }
  }
class circle implements resizable
{
  int radius=5;
  @Override
  public void resize(int x)
  {
    radius=x;  
  }
  public void getarea()
  {
       System.out.println("area..."+(3.14*(radius*radius)));
  }
  public void getperimeter()
  {
       System.out.println("perimeter..."+(2*3.14*radius));
  }
}



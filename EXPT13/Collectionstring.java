import java.util.*;


public class Collectionstring {
    
    public static void main(String[] args) {
       Collection list=new ArrayList<>();
       list.add("abitha");
       list.add("swetha");
       list.add("nand");
       list.add("affrin");
       System.out.println(list);
       Scanner obj=new Scanner(System.in);
       System.out.println("enter element to append:");  
       String a=obj.next();
       list.add(a);
       Collectionstring o=new  Collectionstring();
       System.out.println("the list after appending at the end is:");  
       System.out.println(list);  
       System.out.println("enter element to insert at particular index:");
       String b=obj.next();
       System.out.println("enter position:");  
       int c=obj.nextInt();
       //list.add(1,"abo");
       for(int  i=0;i<list.size();i++)
       {
          if(i==c)
          {
              list.add(b);
          }
       }
       System.out.println("the list after inserting at particular pasition is:");
       System.out.println(list);  
       System.out.println("enter element to be searched:");
       String d=obj.next();
       for(int  i=0;i<list.size();i++)
       {
          if(list.contains(d))
          {
              System.out.println("the element: "+d+" present in the list");
              break;
          }
          else
          {
              System.out.println("the element "+d+" not present in the list");
          }
       }
       System.out.println("enter a string :");
       int l[];
    }
   
}



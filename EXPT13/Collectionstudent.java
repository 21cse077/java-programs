package collectionstudent;

import java.util.*;


public class Collectionstudent {
    public static void main(String[] args) {
        Collection list=new ArrayList<>();
        Scanner obj=new Scanner(System.in);
        int a=20;
        for(int i=0;i<a;i++)
        {
           System.out.println("enter rollno:");
          int g=obj.nextInt();
           System.out.println("enter name:");
           String v=obj.next();
           System.out.println("enter cgpa:");
           double d=obj.nextDouble();
           list.add(new demo(g,v,d));
        }
        //Collections.sort(list,new sortingstudent());
        System.out.println(list);
    }
    }
class demo{
       int rollno;
   String name;
   double cgpa;
    demo(int r,String n,double c)
   {
       rollno=r;
       name=n;
       cgpa=c;
   }
    public String toString(){
        return "rollno: "+rollno +"name: "+name +"cgpa:"+cgpa+"\n";
    }
}
 class sortingstudent implements Comparator<demo>{

    @Override
    public int compare(demo d1, demo d2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   return Double.compare(d1.cgpa, d2.cgpa);
    }
   
     
}



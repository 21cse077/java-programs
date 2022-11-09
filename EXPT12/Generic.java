package genericfunction;
import java.util.*;
/**
 *
 * @author jagan
 */
public class Generic {
    public static void main(String[]args){
        Integer y[]={11,20,44,1,23,765,10,34,2};
         Generic o=new  Generic ();
         o.min(y);
     
    }
    <t extends Comparable <t>> void min(t[] y){
  t m;
        m=y[0];
  for(int i=0;i<y.length;i++)
  {
     for(int j=0;j<y.length;j++)
     {
         if(y[i].compareTo(y[j])>0)
         {
             m=y[j];
         }
     }
  }
     System.out.println("the minimum number in the list is:::"+ m);
       
    }
}


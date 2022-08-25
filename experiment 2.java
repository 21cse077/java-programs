
1.EMPLOYEE DETAILS
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import java.util.Scanner;

/**
 *
 * @author Nandhini
 */
public class employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employe obj= new employe(101,"nandhini","azam",10000);
        int percent;
        System.out.println(obj.getid());
        System.out.println(obj.getfirstname());
        System.out.println(obj.getlastname()); 
        System.out.println(obj.getname()); 
        System.out.println(obj.getsalary()); 
        System.out.println(obj.getannualsalary());
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter percent:");
        percent=obj1.nextInt();
        System.out.println(obj.raisedsalary(percent));
        System.out.println(obj.toString()); 
        
    }
    
}
class employe
{
   int id;
   String firstname;
   String lastname;
   static int salary;
    
    employe(int ids,String fname,String lname,int s)
    {
        id=ids;
        firstname=fname;
        lastname=lname;
        salary=s;
    }
   
   int getid()
    {
        return id;
    }
    String getfirstname()
    {
       return firstname;
    }
    String getlastname()
    {
        return lastname;
    }
    String getname()
    {
     return firstname+' ' +lastname;
    }
    int getsalary()
    {
 return salary;   
    }
    int getannualsalary()
    {
        return salary*12;
    }
    int raisedsalary(int percent)
    {
        salary=salary+((salary*percent)/100);
        return salary;
    }
    @Override
    public String toString()
    {
        return "id..."+id+' '+"name..."+firstname+' '+lastname+' '+"salary..."+salary;
    }
   }

2. ELECTRICITY BILL
package expt2;

import java.util.Scanner;


public class eb {

    
    public static void main(String[] args) {
        bill obj=new bill();
        obj.getdata();
        obj.calc();
        obj.display();
        //cu TODO code application logic here
    }
    
}
class bill
{
    int consumernum;
    String consumername;
    int prevreading;
    int currreading;
    String type;
    int unit;
    float bill;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter consumer num");
        consumernum=obj.nextInt();
        System.out.print("enter consumer name");
        consumername=obj.next();
        System.out.print("enter prev reading");
        prevreading=obj.nextInt();
        System.out.print("enter curr reading");
        currreading=obj.nextInt();
        System.out.print("enter type");
        type=obj.next();
        
        
    }
    void calc()
    {
         unit=currreading-prevreading;
         if(type.equals("D"))
         {
             if(unit<=100)
                 bill=(float)(1*unit);
             else if(unit>100 && unit<=200)
                 bill=(float)((1*100)+(2.50*(unit-100)));
             else if(unit>200 && unit<=500)
                 bill=(float)((1*100)+(2.50*100)+(4*(unit-200)));
             else
                 bill=(float)((1*100)+(2.50*100)+(4*300)+((unit-500)*6));
         }
         else{
             if(unit<=100)
                 bill=(float)(2*unit);
             else if(unit>100 && unit<=200)
                 bill=(float)((1*100)+(4.50*(unit-100)));
             else if(unit>200 && unit<=500)
                 bill=(float)((1*100)+(4.50*100)+(6*(unit-200)));
             else
                 bill=(float)((1*100)+(4.50*100)+(6*300)+((unit-500)*7));
         }
    }
    void display()
    {
        System.out.println("Consumername"+consumername);
        System.out.println("Consumernum"+consumernum);
         if(type.equals("D"))
             System.out.println("type of connection"+type);
         else
             System.out.println("type of connection"+type);
        System.out.println("curr month reading"+currreading);
        System.out.println("prev month reading"+prevreading); 
        System.out.println("total units"+unit);
        System.out.println("total bill"+bill);
    }
    

}
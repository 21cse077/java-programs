/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.no;

import java.util.Scanner;

/**
 *
 * @author 21CSE077
 */
public class MinimumNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
            Scanner obj=new Scanner(System.in);
                    int a,b;
                            System.out.println("enter a");
                            System.out.println("enter b");
                            a=obj.nextInt();
                            b=obj.nextInt();
                            if(a<b)
                                System.out.println("a is minimum");
                            else
                                System.out.println("b is minimum");
                                        
                                   
        // TODO code application logic here
    }

    
    
}

2.sum and product
package laboone;
  

import java.util.scanner;
public class labone{

public static void main(string[]args){
scanner obj=new scanner(System.in);
int a,b,c,d;
System.out.println("enter a:");
System.out.println("enter b:");
a=obj.nextInt();
b=obj.nextInt();
c=a+b;
d=a*b;
System.out.println("the sum is...."+c);
System.out.println("the product is...."+d);
}


3. GREET MESSAGE TO STUDENTS MARK
import java.util..Scanner;
public class greet
{
public static void main(string[]args)
{
Scanner obj=new scanner(system.in);
int m1,m2,m3,m4,m5 from 1-10");
m1=obj.nextInt();
m2=obj.nextInt();
m3=obj.nextInt();
m4=obj.nextInt();
m5=obj.nextInt();
avg=(m1+m2+m3+m4+m5)/5;
switch(avg)
{
case10:
System.out.println("excellent");
break;
case9:
system.out.println("very good");
break;
case8:
system.out.println("very good");
break;
case7:
system.out.println("good");
break;
case6:
system.out.println("good");
break:
case5:
system.out.println("poor");
break;
case4:
system.out.println("poor");
break;
case3:
system.out.println("poor");
break;
case2:
system.out.println("very poor");
break;
case1:
system.out.println("very poor");
break;
case0:
system.out.println("very good");
break;
default;
system.out.println("invalid");
break;
}
}
}


4.NUMBER PATTERN

class dec
{
public static void main(string ar[])
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print("  ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

5.CONVERTING MONTH TO DAYS
import java.util.scanner;
public class monday
{
public static void main(string[]args)
{
scanner obj=new scanner(system.in);
int n,month,day;
system.out.println("enter n:");
n=obj.nextInt();
month=n//30;
day=n%30;
system.out.println(n+"days="+month---"months and"+days---+"days"0;
}
}


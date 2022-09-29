/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exception6 {

 
    public static void main(String[] args) {
        flat obj[]=new flat[6];
        for(int i=0;i<obj.length;i++)
        {
            Scanner o=new Scanner(System.in);
            System.out.println("enter street address");
            String add;
            add = o.next();
            System.out.println("enter no.of digits of apartment number");
            int aptno=o.nextInt();
            System.out.println("enter no.of bedroom");
            int bedno=o.nextInt();
            System.out.println("enter apartment rent");
            int rent=o.nextInt();
            obj[i]=new flat(add,aptno,bedno,rent);
        }
    }
   
}
        
  

    

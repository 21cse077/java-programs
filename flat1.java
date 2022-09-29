/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception6;

/**
 *
 * @author user
 */
public class flat1 extends Exception{
    
    int aptno;
    int bedno;
    int aptrent;
    String add;
    public flat1(String address,int no,int bed,int rent)
    {
        super("apartment");
        add=address;
        bedno=bed;
        aptrent=rent;
        aptno=no;
        System.out.println("apartmentexception");
       
    }
    public flat1()
    {
        super("apartmentexception");
    }
   
}


    


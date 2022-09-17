/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suboops;
import oops.*;
class suboops extends oops1
{
    public static void main(String[]args)
    {
        suboops obj=new suboops();
        obj.display();
        try{
            obj.display1();
            
        }
        catch(Exception e)
        {
            System.out.println("default property cannot be displayed");
        }
        
}

    private void display1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
        

/**
 *
 * @author user
 */

    
}

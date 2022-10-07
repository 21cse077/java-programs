/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcount;

/**
 *
 * @author jagan
 */
public class Stringcount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
String s="my name is nandhini. what is yours ? ";
        char c[]=s.toCharArray();
        int count = 0;
        for(char c1:c)
        {
            if(c1=='?'||c1==','||c1=='-'||c1==':'||c1==' '||c1=='.')
            {
               count=count+1;
            }
           
        }
        System.out.println("the no.of words are..."+count);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='?'||c[i]==','||c[i]=='-'||c[i]==':'||c[i]==' '||c[i]=='.')
            {
               count=count+1;
            }
        }
    }
}
    



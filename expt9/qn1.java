import java.io.*;

public class qn1 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
       FileOutputStream f =new FileOutputStream("file4.txt");
       String s="OOPS LANGUage";
       byte b[]=s.getBytes();
       f.write(b);
       int p;
       FileInputStream f1=new FileInputStream("file4.txt");
       System.out.println("the contents in file4 is");
       System.out.println(s);
       FileOutputStream f2=new FileOutputStream("copyoffile4.txt");
       int r,a=0;
       while((r=f1.read())!=-1)
      {
          if(r>=65 && r<=90)
          {
           r=r+32;
           a=(char)r;
           f2.write(a);
          }
          else
          {
              a=(char)r;
              f2.write(a);
          }
       }
       FileInputStream f3=new FileInputStream("copyoffile4.txt");
       System.out.println("the contents in file copyoffile4 is");
       while((p=f3.read())!=-1)
       {
         System.out.print((char)p);  
       }
       System.out.println("\nhence contents in copyoffile4 is lowercase of contents in file4");
    }
   
}



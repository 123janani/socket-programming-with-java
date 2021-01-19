
package ip;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerParking {
    public static void main(String arg[]) throws IOException, Exception {
         
         ServerParking myServ = new ServerParking();
        
         
        
        
       
        ServerSocket s1 = new ServerSocket(1234);
            double h1,h2,m1,m2;
        while (true) {
            try {

                Socket ss = s1.accept();
                Thread thread = new Thread();
                System.out.println(ss);
                
              
                Scanner sc = new Scanner(ss.getInputStream());
                
                h1=sc.nextDouble();
                m1=sc.nextDouble();
                h2=sc.nextDouble();
                m2=sc.nextDouble();
                
                      double timeh = h2 - h1;
                     // double timem = m2 - m1;
                      
        timeh = 0;
        double cost1=0;   
       
        
        if(timeh<3){
            cost1=100.00;}
           
            else if(timeh>3){
                cost1=200.00 ;
            } 
            else {
                cost1=0.00;
            }
                   
          System.out.println(cost1);
          PrintStream ps;
                ps = new PrintStream(ss.getOutputStream());
                ps.println(cost1);
    }
            catch (IOException err){}
 
     }

     }

}

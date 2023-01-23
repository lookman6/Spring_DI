/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjxml;

//import org.omg.PortableServer.Servant;
import org.springframework.stereotype.Service;

/**
 *
 * @author elhaddadmohamed
 */
public class Essai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Codage normal saans spring
       MyService service = new MyServiceImpl2();
        MyClient Clt= new MonClient(service);
        
  Clt.doSomething();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author elhaddadmohamed
 */

//@Configuration
@ComponentScan("ma.spring.dinjannotation")
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        AnnotationConfigApplicationContext context ;
        context = new AnnotationConfigApplicationContext(Test.class);

        MyClient Clt = context.getBean("client1",MyClient.class);
        Clt.doSomething();
        
    }
    
}
        //context.scan("ma.spring");
//        context.refresh();
//        MyClient Clt = (MyClient)context.getBean("client1");
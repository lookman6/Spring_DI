/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author elhaddadmohamed
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
ApplicationContext appContext ;
        appContext    = new ClassPathXmlApplicationContext("AppConfig.xml");
         
        MyClient client = (MyClient) appContext.getBean("client1");
        
        client.doSomething();

        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.configurationBis;

import ma.spring.configuration.*;
import ma.spring.configurationBis.NewConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author elhaddadmohamed
 */
public class SpringDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PARTIE 1 

         ApplicationContext context = new AnnotationConfigApplicationContext(NewConfig.class); 
        Service M =  context.getBean(Service.class);
        M.Faire();
        
    }
    
}

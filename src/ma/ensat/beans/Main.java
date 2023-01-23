/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Main {
    public static void main(String[] args) {
        
        
    AnnotationConfigApplicationContext context ;
 context = new AnnotationConfigApplicationContext(Config.class);

Employee employee = context.getBean(Employee.class);
System.out.println(employee);
    }
    
}

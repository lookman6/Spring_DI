/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Config {
        @Bean
      
    public Employee JohnEmployee() {
        return new Employee("John");
    }

    @Bean
      // @Primary
    public Employee TonyEmployee() {
        return new Employee("Tony");
    }
}

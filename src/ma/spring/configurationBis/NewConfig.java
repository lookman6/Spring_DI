/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.configurationBis;

import ma.spring.configuration.Systeme;
import ma.spring.configuration.Windows;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Mohamed EL HADDAD
 */
//@Configurable
//@ComponentScan("ma.spring.configuration")
public class NewConfig {
 @Bean
public Service getService ()
{
        return new   ServiceImp() ;
 }

}

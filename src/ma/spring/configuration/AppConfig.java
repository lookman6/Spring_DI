/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author elhaddadmohamed
 * Inversion de contrôle (IoC) et Injection de dépendances (ID)
 * en utilisant les trois mode de configuration ( XML, annotations, JavaConfig)
 */
@Configurable
@ComponentScan("ma.spring.configuration")
public class AppConfig {
    
}

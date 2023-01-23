/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.configuration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author elhaddadmohamed
 */
@Component
@Primary
public class Linux implements Systeme
{

    @Override
    public void MonSysteme() {
        System.out.println(" LINUX SYSTEM ...");
    }
    
}

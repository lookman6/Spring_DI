/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author elhaddadmohamed
 */
@Component
public class Machine {
    @Autowired
 //@Qualifier("Windows")
    private Systeme MySystem ;

    public Systeme getMySystem() {
        return MySystem;
    }

    public void setMySystem(Systeme MySystem) {
        this.MySystem = MySystem;
    }
    
    void Show()
    {
        System.out.println("Je suis une machine de type ");
        MySystem.MonSysteme();
    }
    
}

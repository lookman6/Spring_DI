/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author elhaddadmohamed
 */
@Component("client1")
public class MyClientImp implements MyClient{
    
    @Autowired
@Qualifier("service1")
    private MyService service;

    public MyClientImp() {
        System.out.println("On instancie Un MyClientImp");
    }
 
    @Override
    public void doSomething() {
        String info = service.GetInfo();
        System.out.println(info);
    }
}

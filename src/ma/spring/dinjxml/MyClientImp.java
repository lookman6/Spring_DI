/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author elhaddadmohamed
 */

public class MyClientImp implements MyClient{

    private MyService service;

    public void setService(MyService service) {
        this.service = service;
    }

    public MyClientImp() {
        System.out.println("XML : On instancie Un MyClientImp");
    }
 
    @Override
    public void doSomething() {
        String info = service.GetInfo();
        System.out.println(info);
    }
}

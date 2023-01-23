/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjxml;

/**
 *
 * @author elhaddadmohamed
 */
public class MonClient implements MyClient{
    MyService service ; 
     public MonClient(MyService service) {
         this.service=service;
        System.out.println("XML : On instancie Mon Client");
    }
 
    @Override
    public void doSomething() {
        String info = service.GetInfo();
        System.out.println(info);
    }
}
    
    


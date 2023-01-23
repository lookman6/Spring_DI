/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjxml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author elhaddadmohamed
 */

public class MyServiceImpl2 implements MyService {

    public MyServiceImpl2() {
         System.out.println("XML : On instancie Un MyServiceImp2");
    }
 
    
    
    @Override
    public String GetInfo() {
        return "Service 2 :  Info XML ";
    }
 
}


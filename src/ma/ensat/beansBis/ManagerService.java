/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beansBis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mohamed EL HADDAD
 */
@Service
public class ManagerService {

    @Autowired
    private Manager manager;

    public Manager getManager() {
        return manager;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beansBis;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mohamed EL HADDAD
 */
@Component
@Primary
public class DepartmentManager implements Manager {
    @Override
    public String getManagerName() {
        return "Department manager";
    }
}
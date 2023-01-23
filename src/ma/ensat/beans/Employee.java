/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beans;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Employee {
    private String Name ;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Employee(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return " Employee Name : "+Name ;
    }
    
}

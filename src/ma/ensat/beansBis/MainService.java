/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ensat.beansBis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class MainService {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext context ;
 context = new AnnotationConfigApplicationContext(MyConfig.class);
        ManagerService service = context.getBean(ManagerService.class);
Manager manager = service.getManager();
System.out.println(manager.getManagerName());
    }
}

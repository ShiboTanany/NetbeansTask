/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 *
 * @author shibo
 */
public class MyNamingStrategy extends DefaultNamingStrategy {

    public String classToTableName(String className) {
        if (className.equals("hibernate1.Account")) {
            return ("account");
        } else {
            return ("EMPTY");
        }
    }
}

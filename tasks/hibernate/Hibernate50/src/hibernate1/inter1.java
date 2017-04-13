/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import java.io.Serializable;
import java.util.Iterator;
import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.EntityMode;
import org.hibernate.Interceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

/**
 *
 * @author shibo
 */
public class inter1 extends EmptyInterceptor {

    private static final long serialVersionUID = 1L;

  

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state,
            String[] propertyNames, Type[] types) {
        System.out.println("onsave Method is getting called");
        System.out.println("==== DETAILS OF ENTITY ARE ====");
        System.out.println(" ana fe inter1 on save");
        if (entity instanceof Account) {

            ((Account) entity).setAddress("dskdlskdlksldkslkds dskdslkdlsklds");

        }

        return false;
        
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        System.out.println("onsave Method is getting called");
        System.out.println("==== DETAILS OF ENTITY ARE ====");
        System.out.println(" ana fe inter1 on save");
        if (entity instanceof Account) {

            ((Account) entity).setAddress("dskdlskdlksldkslkds dskdslkdlsklds");

        }
        
        return false;}

    
    

}

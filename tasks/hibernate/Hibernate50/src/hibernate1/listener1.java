/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import java.io.Serializable;
import org.hibernate.event.internal.DefaultSaveEventListener;
import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.persister.entity.EntityPersister;

/**
 *
 * @author shibo
 */
public class listener1    implements PostUpdateEventListener, PreUpdateEventListener {

    @Override
    public void onPostUpdate(PostUpdateEvent pue) {
       
         System.out.println("Pre Update Event ");
           if(pue.getEntity() instanceof Account)
           {
                Account Account = (Account)pue.getEntity();
                System.out.println(Account.getFullName());
        }
        
        
    }

    @Override
    public boolean requiresPostCommitHanding(EntityPersister ep) {
       return false;
    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent pue) {
     
         System.out.println("Pre Update Event ");
           if(pue.getEntity() instanceof Account)
           {
                Account Account = (Account)pue.getEntity();
                System.out.println(Account.getAddress());
        }
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate1;

import org.hibernate.event.internal.DefaultSaveOrUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;

/**
 *
 * @author shibo
 */
public class NewClass  extends 
        DefaultSaveOrUpdateEventListener{

    @Override
    public void onSaveOrUpdate(SaveOrUpdateEvent event) {
      if (event.getObject() instanceof Account){
} }
    
}

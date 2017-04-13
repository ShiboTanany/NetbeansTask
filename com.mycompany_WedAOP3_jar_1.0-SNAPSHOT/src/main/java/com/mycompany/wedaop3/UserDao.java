/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop3;

/**
 *
 * @author shibo
 */
public interface UserDao {
    
    
    
   void addUser(User u);
   String getName();
   void deleteUser(User u)throws Exception;
   
   void sayHiUser(int y);
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tuesaop1.advices;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author shibo
 */
public class LogBefore implements  MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        
        System.out.println("before the operation ");
    
    }
    
}

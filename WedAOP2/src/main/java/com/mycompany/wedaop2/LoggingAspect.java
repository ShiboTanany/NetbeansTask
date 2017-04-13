/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author shibo
 */
@Aspect
public class LoggingAspect {

//    @Before("execution(* com.mycompany.wedaop2.DAOImp.new())")
    
    //@Before("execution(public DAOImp.new(..))")
    //@Before( "(execution(public * DAOImp.*(..)) || execution(public DAOImp.new(..)))")
  
    public void logBefore(JoinPoint jp) {
        System.out.println("logBefore is running!");
        System.out.println(" " + jp.getSignature().getName());
    

    }
    
}

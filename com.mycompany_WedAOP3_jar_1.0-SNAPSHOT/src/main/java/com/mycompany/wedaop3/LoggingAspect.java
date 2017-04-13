/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author shibo
 */

public class LoggingAspect {

    
    public void logBefore(JoinPoint jp) {
        System.out.println("logBefore is running!");
        System.out.println(" " + jp.getSignature().getName());
    

    }
}

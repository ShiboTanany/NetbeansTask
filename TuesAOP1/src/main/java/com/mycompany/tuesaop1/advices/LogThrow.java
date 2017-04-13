/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tuesaop1.advices;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author shibo
 */
public class LogThrow implements ThrowsAdvice {

    public void AfterThrowing(IllegalArgumentException e) {
        System.out.println("illegal arguments ");

    }

}

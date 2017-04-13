/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tuesaop1.advices;

import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author shibo
 */
public class AroundLog implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object x = null;
        System.out.println("in around method 3al fekra ");
        System.out.println("" + mi.getMethod());
        Object col2[] = mi.getArguments();
        Integer second = (Integer) col2[1];
        System.out.println("the second is "+second);
        //System.out.println(""+mi.ge);
        System.out.println(""+mi.getMethod());
        for (Object col : mi.getArguments()) {
            System.out.println("" + col.toString());
        }
       
        System.out.println(mi.getMethod().equals("public abstract double com.mycompany.tuesaop1.Calculator.divide(int,int)"));
        try {
            if (second == 0 &&mi.getMethod().toString().equals("public abstract double com.mycompany.tuesaop1.Calculator.divide(int,int)")) {
                System.out.println("you are in if ");
                throw new IllegalArgumentException("you can not divide 3al zero");

            }else{
            x = mi.proceed();
            System.out.println("" + x);
        } }catch (Exception e) {
            System.out.println("illegal arguement");
            throw e;
        }
        return x;
    }
}

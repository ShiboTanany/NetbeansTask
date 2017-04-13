/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 *
 * @author shibo
 */
@Aspect
public class TestAspect {
    
    @DeclareParents(  value="com.mycompany.wedaop4.CalculatorImp" ,defaultImpl = MaxCalc.class)
    public Max maxInt;
    
    @DeclareParents(  value="com.mycompany.wedaop4.CalculatorImp" ,defaultImpl = MinCalc.class)
    public Min minInt;
}

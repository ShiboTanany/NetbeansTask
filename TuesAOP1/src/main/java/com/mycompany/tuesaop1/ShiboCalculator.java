/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tuesaop1;

/**
 *
 * @author shibo
 */
public class ShiboCalculator implements Calculator{

    @Override
    public double add(double x, double y) {
       
    
        System.out.println("dksjdksj");
    return x-y;}

    @Override
    public double sub(double x, double y) {
      
    return x+y;
    }

    @Override
    public double divide(int x, int y) {
    return x*y; }

    @Override
    public double mult(double x, double y) {
       
    return x/y;
    }
    
}

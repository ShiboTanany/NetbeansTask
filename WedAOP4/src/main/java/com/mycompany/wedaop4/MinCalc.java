/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wedaop4;

/**
 *
 * @author shibo
 */
public class MinCalc implements Min {

    @Override
    public int findMin(int x, int y) {
        return (x < y) ? x : y;
    }
    
}

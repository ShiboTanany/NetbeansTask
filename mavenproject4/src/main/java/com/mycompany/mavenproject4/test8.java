/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author shibo
 */
public interface test8 {

    default String getName() {
        return "";
    }
  int y();
    static int x() {
        return 5;
    }
}

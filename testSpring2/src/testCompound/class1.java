/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCompound;

/**
 *
 * @author shibo
 */
public class class1 {
    private class2 class2;

    public class2 getClass2() {
        return class2;
    }

    public void setClass2(class2 class2) {
        this.class2 = class2;
    }

    public class1(class2 class2) {
        this.class2 = class2;
    }

    public class1() {
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author shibo
 */
public class Bank {

    private List<Account> list;

    private Set<Account> sets;
    private Map<String, Account> maps;
    private Properties pros;

    public Bank() {
    }

    public Bank(List<Account> list) {
        this.list = list;
    }

    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }

    public Set<Account> getSets() {
        return sets;
    }

    public void setSets(Set<Account> sets) {
        this.sets = sets;
    }

 

    public Map<String, Account> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Account> maps) {
        this.maps = maps;
    }

 
    
    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

   
}

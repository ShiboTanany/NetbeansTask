/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vote.managedBeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author shibo
 */
@ManagedBean(name = "user")
@SessionScoped
public class User implements Serializable{

    @ManagedProperty(name="CatalogeVote",value ="#{CatalogeVote}")
    private CatalogeVote CatalogeVote;

    public CatalogeVote getCatalogeVote() {
        return CatalogeVote;
    }

    public void setCatalogeVote(CatalogeVote CatalogeVote) {
        this.CatalogeVote = CatalogeVote;
    }
    
    private boolean choosen;
    private String choice;

    public boolean isChoosen() {
        return choosen;
    }

    public void setChoosen(boolean choosen) {
        this.choosen = choosen;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public User() {
    }

    public String voteButtonBack() {
        if (getChoice() != null) {
            
            CatalogeVote.editVote(getChoice());
           // setVoted(true);
            return "vote_1";
        } else {
            return null;
        }
    
}}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author shibo
 */
class Message {
    private int id;
    private String username;
    private String message;

    Message(int i, String parameter, String parameter0) {
      
    id=i;
    username=parameter;
    message=parameter0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  

    public String getContent() {
        return message;
    }

    public void setContent(String content) {
        this.message = content;
    }
    
    
}

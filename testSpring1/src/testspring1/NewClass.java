/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspring1;

/**
 *
 * @author shibo
 */
public class NewClass {

    private int id;
    private String name;
    private String profession;

    public NewClass(String profession, String name) {
        this.name = name;
        this.profession = profession;
    }
    

    private NewClass(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    private NewClass(int id) {
        this.id = id;
    }

    private NewClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private NewClass(String profession) {
        this.profession = profession;
    }

   
    private NewClass() {
    }

    @Override
    public String toString() {
        return "NewClass{" + "id=" + id + ", name=" + name + ", profession=" + profession + '}';
    }

    public String getame() {

        return "dsdsds";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static NewClass getInstance() {

        return new NewClass(1,"shibo","java developer");
    }
 public NewClass createInstance() {

        return new NewClass(1,"shibo","java developer");
    } 
}

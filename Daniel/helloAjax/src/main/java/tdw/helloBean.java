/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Danie
 */
@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    /**
     * Creates a new instance of helloBean
     */
    private String name;
    
    public helloBean() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSayWelcome() {
        if("".equals(name) || name == null) {
            return"";
        } 
        else{
            return"Ajax message: Welcome " + name;
        }
    }
}


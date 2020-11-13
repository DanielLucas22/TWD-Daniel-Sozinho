/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdw;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

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
    private String program; //Adicionado
    private Date someDate; //Adicionado
    
    
    
    public helloBean() {
    }
    
    //Get e Set adicionados usando insert code do Netbeans
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSayProgram() {  //Adicionado
        String outStr = "";
        
        
        if("".equals(program) || program == null) {
            return"";
        } 
        else{
            int num = Integer.parseInt(program);
            switch (num) {
                case 1:
                    outStr = "Programa: Tecnologias para Desenvolvimento Web";
                    break;
                case 2:
                    outStr = "Programa: Oficina certificadora";
                    break;
                case 3:
                    outStr = "Programa: Outra Disciplina";
                    break;
            }   
            return outStr;
        }  
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


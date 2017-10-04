/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import java.util.List;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.*;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 *
 * @author Aoife Sayers
 */
public class Student extends CouchDbDocument{
  
    private String firstname;
    private String surname;
    private String tNumber;
    private String email;
    

     
    public Student(String firstname, String surname, String tNumber, String email)
    {
        setFirstname(firstname);
        setSurname(surname);
        settNumber(tNumber);
        setEmail(email);
    }
         public Student()
    {
        
    }
       
    @JsonProperty("firstname")    
    public String getFirstname(){
            return firstname;
        }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    @JsonProperty("surname")
     public String getSurname(){
        return surname;
    }
     
    public void setSurname(String surname){
        this.surname = surname;
    }
     
     public String getTnumber(){
        return tNumber;
    }
    @JsonProperty("tnumber") 
    public void settNumber(String tNumber){
           this.tNumber = tNumber;
 
    }
    @JsonProperty("email")
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
  
    
    
    
    
    
    
}

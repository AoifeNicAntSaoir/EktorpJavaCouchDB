/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.*;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.ViewResult;
/**
 *
 * @author Aoife Sayers
 */
public class Student extends CouchDbDocument{
  
    private String firstname;
    private String surname;
    private String tNumber;
    private String email;
    private Map<String, StudentAddress> address;     
    public String[] modules;
    
       
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
    
    @JsonProperty("tnumber")
     public String getTnumber(){
        return tNumber;
    }
     
    public void setTnumber(String tNumber){
           this.tNumber = tNumber;
    }
    
    @JsonProperty("email")
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }   
    
    public Map<String, StudentAddress> getAddress() {
                return address;
        }
        @JsonProperty("address")
    public void setAddress(Map<String, StudentAddress> address) {
                this.address = address;
        }

    public String[] getModules() {
        return modules;
    }
    
    public String toString(){
        return "Firstname: " + getFirstname() + 
                "Surname: " + getSurname() +
                "Tnumber: " + getTnumber() + 
                "Email: " + getEmail() +
                "Address: " + getAddress();
                
    }

}

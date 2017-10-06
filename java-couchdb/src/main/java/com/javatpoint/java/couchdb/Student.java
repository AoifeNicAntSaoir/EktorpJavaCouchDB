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
   // private StudentAddress address;
    private String street;
    private String town;
    private String county;
    private String country;
    private String postcode;
   
     
  
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
    
    @JsonProperty("tnumber")
     public String getTnumber(){
        return tNumber;
    }
     
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
  
    
     @JsonProperty("address.Street")  
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @JsonProperty("address.Town") 
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    @JsonProperty("address.County") 
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    @JsonProperty("address.Country") 
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("address.Postcode") 
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    
    
    
    
    
}

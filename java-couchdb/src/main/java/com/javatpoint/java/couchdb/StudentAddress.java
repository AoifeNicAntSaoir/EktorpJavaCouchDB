/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Aoife Sayers
 */
public class StudentAddress {
    private String street;
    private String town;
    private String county;
    private String country;

    public StudentAddress(String street, String town, String county, String country)
    {
        setStreet(street);
        setTown(town);
        setCounty(county);
        setCountry(country);
    }
            
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String ountry) {
        this.country = ountry;
    }
    
    public String getAddress(){
        return getStreet() + ", " +
               getTown() + ", " +
               getCounty() + ", " + 
               getCountry();
    }
    
    
}

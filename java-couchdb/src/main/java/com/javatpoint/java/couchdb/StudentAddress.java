/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

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
    private String postcode;

    public StudentAddress(String street, String town, String county, 
            String country, String postcode){
        setStreet(street);
        setTown(town);
        setCounty(county);
        setCountry(country);
        setPostcode(postcode);
    }
    public StudentAddress(){
    
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

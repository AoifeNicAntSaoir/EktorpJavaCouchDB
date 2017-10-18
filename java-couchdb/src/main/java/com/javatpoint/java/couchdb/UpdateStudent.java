/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import java.net.MalformedURLException;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

/**
 *
 * @author Aoife Sayers
 */
public class UpdateStudent {
    public static void main(String[] args) throws MalformedURLException{
        HttpClient httpClient = new StdHttpClient.Builder()
        .url("http://localhost:5984")
        .build();

CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
CouchDbConnector db = new StdCouchDbConnector("person", dbInstance);

Student student = new Student();

student.setFirstname("blue");
student.setSurname("dot");
student.setEmail("bluedot@mail.com");
student.setTnumber("t00170881");
db.update(student);
        
    }
}

package com.javatpoint.java.couchdb;  
import java.net.MalformedURLException;  
import java.util.List;
import org.ektorp.CouchDbConnector;  
import org.ektorp.CouchDbInstance;  
import org.ektorp.http.HttpClient;  
import org.ektorp.http.StdHttpClient;  
import org.ektorp.impl.StdCouchDbConnector;  
import org.ektorp.impl.StdCouchDbInstance;  
import org.ektorp.support.DesignDocument;  

public class CreateStudent {  
    public static void main(String[] args) throws MalformedURLException { 
        //Point to CouchDB server
        HttpClient httpClient = new StdHttpClient.Builder()  
        .url("http://localhost:5984")  
        .build();  
        //Connect to CouchDB instance
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        //Point to Person database
        CouchDbConnector db = dbInstance.createConnector("person", true);
        //Student Object
        Student s = new Student();
        s.setFirstname("aoifes");
        s.setSurname("sayers");
        s.setEmail("aoifesayers@gmail.com");

         List<String> listOfIds = db.getAllDocIds();
         System.out.println(listOfIds);
         System.out.println(listOfIds.get(0));
         String firstStud = listOfIds.get(0);
         Student stud = db.get(Student.class, firstStud);
         System.out.println(stud.getTnumber());

        db.create((s));



        HttpClient httpClient1 = new StdHttpClient.Builder()  
        .url("http://localhost:5984")  
        .build();  

    }

}  
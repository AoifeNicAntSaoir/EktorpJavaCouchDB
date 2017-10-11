/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonNode;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

/**
 *
 * @author Aoife Sayers
 */
public class ReadingTest {
    public static void main(String[] args) throws MalformedURLException, IOException{
        HttpClient httpClient = new StdHttpClient.Builder()
                    .url("http://localhost:5984")  
                    .build();
            CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
            CouchDbConnector db = dbInstance.createConnector("person", true);
                ViewQuery query = new ViewQuery()
        .designDocId("_design/allTNumbers")
        .viewName("allTnumbers");

//List<Student> studentDetails = new ArrayList<>();
//studentDetails.add(new Student());
ViewResult result = db.queryView(query);
for (ViewResult.Row row : result.getRows()) {
    String keyValue = row.getKey();
    String stringValue = row.getValue();
    System.out.println(row.getKey());
    System.out.println(row.getValue());
}

       


    }
    
}

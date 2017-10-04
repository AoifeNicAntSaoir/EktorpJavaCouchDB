package com.javatpoint.java.couchdb;  
import java.net.MalformedURLException;  
import org.ektorp.CouchDbConnector;  
import org.ektorp.CouchDbInstance;  
import org.ektorp.http.HttpClient;  
import org.ektorp.http.StdHttpClient;  
import org.ektorp.impl.StdCouchDbConnector;  
import org.ektorp.impl.StdCouchDbInstance;  
import org.ektorp.support.DesignDocument;  


public class CreateStudent {  
public static void main(String[] args) throws MalformedURLException {  
//--------------- Creating Connection--------------------------//  
HttpClient httpClient = new StdHttpClient.Builder()  
.url("http://localhost:5984")  
.build();  
//CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);  
//--------------- Creating database----------------------------//  
//CouchDbConnector db = new StdCouchDbConnector("javatpoint", dbInstance);  
//db.createDatabaseIfNotExists();  

//--------------- Creating Document----------------------------//  

CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
CouchDbConnector db = dbInstance.createConnector("person", true);//new StdCouchDbConnector("javatpoint", dbInstance);
Student s = new Student();
s.setFirstname("aoifes");
s.setSurname("fUCK");
db.create((s));


HttpClient httpClient1 = new StdHttpClient.Builder()  
.url("http://localhost:5984")  
.build();  



/*
CouchDbInstance dbInstance1 = new StdCouchDbInstance(httpClient);
CouchDbConnector db1 = dbInstance1.createConnector("person", true);//new StdCouchDbConnector("javatpoint", dbInstance);
Student s1 = new Student("Fuck","Shit","T000000","fuckshit@mail");*/

//db.create(s1);
}
public void addDoc(StudentRepository repo) {
		// the new document id and age
		// create a document for use in this example
		Student doc = new Student("fuck","shit","fuck@shit","fuckfuckfuck");
		
		// add the doc to the database
		System.out.println("Adding new document to database...");
		repo.add(doc);

		// neat method that returns a boolean on whether the id exists in the
		// database
		
	}
}  
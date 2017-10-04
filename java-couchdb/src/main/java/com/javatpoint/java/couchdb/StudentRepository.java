/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.CouchDbConnector;
/**
 *
 * @author Aoife Sayers
 */
public class StudentRepository extends CouchDbRepositorySupport<Student> {
  public StudentRepository(CouchDbConnector dbc) {
		super(Student.class, dbc, true);
	}  
}

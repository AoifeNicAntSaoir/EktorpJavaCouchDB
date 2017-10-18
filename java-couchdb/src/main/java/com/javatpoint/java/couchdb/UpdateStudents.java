/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.java.couchdb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.ViewResult;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

/**
 *
 * @author Aoife Sayers
 */
public class UpdateStudents extends javax.swing.JFrame {
     String keyValue;
     String stringValue;
     String id ="";
    /**
     * Creates new form ReadingStudents
     */
    public UpdateStudents() throws IOException {
        initComponents();
        //Iterates through list of tnumbers and adds to combo box
       for(String s: getdetails())
       {
        cboReadStudents.addItem(s);
       }
    }
    //Calls the allTnumbers view query & places them in a list
    public List<String> getdetails() throws MalformedURLException, IOException{
        List<String> queryListDetails = new ArrayList<>();
           HttpClient httpClient = new StdHttpClient.Builder()
                    .url("http://localhost:5984")  
                    .build();
            CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
            CouchDbConnector db = dbInstance.createConnector("person", true);
                ViewQuery query = new ViewQuery()
        .designDocId("_design/allTNumbers")
        .viewName("allTnumbers");
        ViewResult result = db.queryView(query);
        for (ViewResult.Row row : result.getRows()) {
            keyValue = row.getKey();
            stringValue = row.getValue();
            String queryDetails = row.getKey() + stringValue;
            queryListDetails.add(queryDetails);
            }
    return queryListDetails;
    }
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboReadStudents = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboReadStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboReadStudentsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Updating Students");

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Update Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboReadStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(cboReadStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboReadStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboReadStudentsActionPerformed
        
    }//GEN-LAST:event_cboReadStudentsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null,"Updating " + keyValue + " " + stringValue);
        try {
            HttpClient httpClient = new StdHttpClient.Builder()  
                    .url("http://localhost:5984")
                    .build();
            CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
            CouchDbConnector db = dbInstance.createConnector("person", true);
            ViewQuery query = new ViewQuery()
                    .designDocId("_design/allTNumbers")
                    .viewName("getDocID");
            ViewResult result = db.queryView(query);
             String id ="";
            for (ViewResult.Row row : result.getRows()) {
               id = row.getKey();
               }
              
            try{
               // db.update(id);
                 JOptionPane.showMessageDialog(null, "Document with ID: " + id + "will be updated"); 
                 Student s = new Student();
                 s.setFirstname(JOptionPane.showInputDialog("Enter first name"));
                 s.setSurname(JOptionPane.showInputDialog("Enter surname"));
                 s.setTnumber(JOptionPane.showInputDialog("Enter T-Number"));
                 s.setEmail(JOptionPane.showInputDialog("Enter Email"));
                 Map<String,StudentAddress> addr = new HashMap();
                 String street = JOptionPane.showInputDialog("Address 1\n Enter Street");
                 String town = JOptionPane.showInputDialog("Address 2\n Enter Town");
                 String county = JOptionPane.showInputDialog("Address 3\n Enter County");
                 String country = JOptionPane.showInputDialog("Address 1\n Enter country");
                    addr.put("address", new StudentAddress(street, town, county, country));
                 s.setAddress(addr); 
                 JOptionPane.showMessageDialog(null,s.toString());
                 db.update(id);
                 
                 
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error occured"); 
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateStudents().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateStudents.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboReadStudents;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

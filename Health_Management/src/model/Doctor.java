/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author darshit
 */
public class Doctor {
//    Person person;
    private int docId;
    private String docName;
    private String department;
    private String username;
    private String password;

    public String getDocName() {
        return docName;
    }
    
    

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    }
    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

//    public Doctor(Person person) {
//        this.person = person;
//        this.docId = docId;
//    }

    public Doctor()
    {
        
    }

    public Doctor(String docName, int docId,String department, String username, String password) {
        this.docName = docName;
        this.docId = docId;
        this.department = department;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return docName;
    }
    
}

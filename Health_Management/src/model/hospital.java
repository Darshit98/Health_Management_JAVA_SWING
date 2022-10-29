/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author darsh
 */
public class hospital {
    
    private String hospitalName;
    doctor doc;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public doctor getDoc() {
        return doc;
    }

    public void setDoc(doctor doc) {
        this.doc = doc;
    }

    public hospital() {
    }

    public hospital(String hospitalName, doctor doc) {
        this.hospitalName = hospitalName;
        this.doc = doc;
    }
    
    
}

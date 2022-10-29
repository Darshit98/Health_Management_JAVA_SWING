/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author darshit
 */
public class SysAdmin {
    
    private ArrayList<PatientDirectory> patientDirectory;
    private ArrayList<PersonDirectory> perDirectory;

    public ArrayList<PatientDirectory> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientDirectory> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public ArrayList<PersonDirectory> getPerDirectory() {
        return perDirectory;
    }

    public void setPerDirectory(ArrayList<PersonDirectory> perDirectory) {
        this.perDirectory = perDirectory;
    }

    public SysAdmin() {
    }

    public SysAdmin(ArrayList<PatientDirectory> patientDirectory, ArrayList<PersonDirectory> perDirectory) {
        this.patientDirectory = patientDirectory;
        this.perDirectory = perDirectory;
    }
    
    
}

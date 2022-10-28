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
public class PatientDirectory {
    
    private ArrayList<Patient> patDirectory;

    public PatientDirectory() {
        this.patDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatDirectory() {
        return patDirectory;
    }

    public void setPatDirectory(ArrayList<Patient> patDirectory) {
        this.patDirectory = patDirectory;
    }
    
    public Patient addPatient()
    {
        Patient pat = new Patient();
        patDirectory.add(pat);
        return pat;
    }
    
}

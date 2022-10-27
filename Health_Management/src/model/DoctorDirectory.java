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
public class DoctorDirectory {
    
    private ArrayList<Doctor> docDirectory;
    
     public DoctorDirectory() {
        this.docDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(ArrayList<Doctor> docDirectory) {
        this.docDirectory = docDirectory;
    }

   
    
    public Doctor createDoctor()
    {
        Doctor newDoctor = new Doctor();
        docDirectory.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor d)
    {
        docDirectory.remove(d);
    }
}

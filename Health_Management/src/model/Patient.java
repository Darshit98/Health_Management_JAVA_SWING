/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author darsh
 */
public class Patient {
    private String allergy;
    private String symptom;
    private String gender;

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Patient() {
    }

    public Patient(String allergy, String symptom, String gender) {
        this.allergy = allergy;
        this.symptom = symptom;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return symptom;
    }
    
    
}

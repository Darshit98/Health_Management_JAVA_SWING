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
public class encounterHistory {
    
    private ArrayList<encounter> encounterList;

    public ArrayList<encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public encounterHistory() {
    }

    public encounterHistory(ArrayList<encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    
}

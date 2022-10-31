/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author darsh
 */
public class doctorDirectory {
    
    private ArrayList<doctor> docList;

    public ArrayList<doctor> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<doctor> docList) {
        this.docList = docList;
    }

    public doctorDirectory() {
    }

    public doctorDirectory(ArrayList<doctor> docList) {
        this.docList = docList;
    }
    
}

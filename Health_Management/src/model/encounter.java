/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author darshit
 */
public class encounter {
    
    VitalSign vSigns;

    public VitalSign getvSigns() {
        return vSigns;
    }

    public void setvSigns(VitalSign vSigns) {
        this.vSigns = vSigns;
    }

    public encounter() {
    }

    public encounter(VitalSign vSigns) {
        this.vSigns = vSigns;
    }
    
    
}

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
public class PersonDirectory {
    
    private ArrayList<Person> perList;
    
    public PersonDirectory() {
        this.perList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerList() {
        return perList;
    }

    public void setPerList(ArrayList<Person> perList) {
        this.perList = perList;
    }

    public Person addNewPerson()
    {
        Person newPerson = new Person();
        perList.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person p)
    {
        perList.remove(p);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author darshit
 */
public class Person {
    private String personName;
    private String perGender;
    private int age;
    private String city;
    private String username;
    private String password;

    public Person(String personName, String perGender, int age, String city, String username, String password) {
        this.personName = personName;
        this.perGender = perGender;
        this.age = age;
        this.city = city;
        this.username = username;
        this.password = password;
    }
    
    public Person()
    {
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPerGender() {
        return perGender;
    }

    public void setPerGender(String perGender) {
        this.perGender = perGender;
    }

    @Override
    public String toString() {
        return personName;
    }
   
}

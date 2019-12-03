/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem.PatientSystem;

import PatientManagementSystem.User;

/**
 *
 * @author apper
 */
public class Patient extends User implements java.io.Serializable
{
    private char gender;
    private int age;
    
    public Patient(String id, String name, String password, char gender, int age)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age =age;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem.AdminSystem;

import PatientManagementSystem.User;

/**
 *
 * @author apper
 */
public class Administrator extends User
{
    public Administrator(String id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

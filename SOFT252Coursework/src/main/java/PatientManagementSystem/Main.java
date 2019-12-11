/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;
import PatientManagementSystem.DoctorSystem.*;
import PatientManagementSystem.PatientSystem.*;
import PatientManagementSystem.AdminSystem.*;
import PatientManagementSystem.SecretarySystem.*;
import java.util.ArrayList;
/**
 *
 * @author apper
 */
public class Main 
{
    public static void main(String[] args)
    {
        Login login = new Login();
        login.setVisible(true);
        
        
        User p1 = new Patient("P1234", "John Smith", "pass", 'm', 26);
        User p2 = new Patient("P5678", "Kyle Raynor", "pass1", 'm', 27);
        User d1 = new Doctor("D1234", "Charles McNider", "doc");
        User a1 = new Administrator("A1234", "John Stewart", "add");
        User s1 = new Secretary("S1234", "Jennifer Walters", "sec");
        
        ArrayList<User> Users = new ArrayList<>();
        
        Users.add(p2);
        Users.add(p1);
        Users.add(d1);
        Users.add(a1);
        Users.add(s1);
        
        Serialize.getInstance().setName("Data.ser");
        
        Serialize.getInstance().writeObject(Users);
        Users = (ArrayList<User>) Serialize.getInstance().readObject();
        
        
    }
    
    
}

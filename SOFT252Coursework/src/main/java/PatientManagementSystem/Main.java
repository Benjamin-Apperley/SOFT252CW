/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;
import PatientManagementSystem.PatientSystem.*;
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
        
        Serialize s;
        s = new Serialize("Data.ser");
        
        User p1 = new Patient("P1234", "John Smith", "pass", 'm', 26);
        User p2 = new Patient("P5678", "Kyle Raynor", "pass1", 'm', 27);
        
        ArrayList<User> Patients = new ArrayList<>();
        
        Patients.add(p2);
        Patients.add(p1);
        
        s.writeObject(Patients);
        Patients = (ArrayList<User>) s.readObject();
        
        User p3;
        
        for (int i = 0; i < 2; i++) 
        {
            p3 = Patients.get(i);
            System.out.println(p3.getId());
        }
    }
    
    
}

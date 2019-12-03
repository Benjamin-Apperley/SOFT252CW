/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;
import PatientManagementSystem.PatientSystem.*;
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
        Serialize.writeObject((Patient)p1, "Data.txt");
        Serialize.writeObject((Patient)p2, "Data.txt");
        Serialize.readObject("Data.txt");
    }
    
    
}

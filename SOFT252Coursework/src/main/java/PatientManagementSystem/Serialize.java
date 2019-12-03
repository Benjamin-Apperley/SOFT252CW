/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;
import PatientManagementSystem.PatientSystem.Patient;
import java.io.*; 

/**
 *
 * @author apper
 */
public class Serialize 
{
    private static Serialize instance;
    
    private Serialize(){}
    
    public static Serialize getInstance()
    {
        if (instance == null)
        {
            instance = new Serialize();
        }
        return instance;
    }
    
    public static void serializeUser(Patient user)
    {
        try
        {
            FileOutputStream file = new FileOutputStream("Data.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(user);
            out.close();
            file.close();
            System.out.println("User successfully serialised ");
        }
        catch(IOException i)
        {
               i.printStackTrace();     
        }
    }
    
    public static void deserializeUser()
    {
        Patient u = null;
        try
        {
            FileInputStream file = new FileInputStream("Data.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            u = (Patient) in.readObject();
            in.close();
            file.close();
            System.out.println("Deserialised " + u == null);
            System.out.println(u.name);
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
        }
    }
}

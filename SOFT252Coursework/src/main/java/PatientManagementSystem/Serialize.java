/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

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
    
    
}

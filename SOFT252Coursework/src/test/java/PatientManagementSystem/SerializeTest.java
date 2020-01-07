/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem;

import PatientManagementSystem.PatientSystem.Patient;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author apper
 */
public class SerializeTest {
    
    private User u52;
    
    public SerializeTest() 
    {
        
    }
    
    @Test
    public void testWriting()
    {
        ArrayList<User> users = new ArrayList<User>();
        users.add(u52);
        assertTrue(Serialize.getInstance().writeObject(users));
        
    }
    
    @Test
    public static void testReading()
    {
        assertNotNull(Serialize.getInstance().readObject());
    }
    

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up");
        Serialize.getInstance().setName("Test.ser");
        u52 = new Patient("string", "string", "string", 'c', 52);
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down");
        Serialize.getInstance().setName("");
    }

    @org.junit.jupiter.api.Test
    public void testGetInstance() {
    }

    @org.junit.jupiter.api.Test
    public void testSetName() {
    }

    @org.junit.jupiter.api.Test
    public void testGetName() {
    }

    @org.junit.jupiter.api.Test
    public void testReadObject() {
    }

    @org.junit.jupiter.api.Test
    public void testWriteObject() {
    }
    
}

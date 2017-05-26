/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cobra
 */
public class PaarTest {
    
    public PaarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gelijkLengte method, of class Paar.
     */
    @Test
    public void testGelijkLengte() {
        
        
        Paar instance = new Paar();
        
        Object eerste = 10.0;
        Object tweede = 1234;
        boolean expResult = true;
       
        boolean result = instance.gelijkLengte(eerste, tweede);
        assertEquals(expResult, result);
        
        Object eerste2 = 3.1415;
        Object tweede2 = "crikel";
        
        boolean result2 = instance.gelijkLengte(eerste2, tweede2);
        assertEquals(expResult, result2);
        
        Object eerste3 = 12;
        Object tweede3 = "twaalf";
        
        boolean result3 = instance.gelijkLengte(eerste3, tweede3);
        assertEquals(expResult, result3);
        
        
        
        
    }
    
}

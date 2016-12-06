/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space_in;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vilius
 */
public class StaticGameObjectFactoryTest {
    
    public StaticGameObjectFactoryTest() {
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
     * Test of createObject method, of class StaticGameObjectFactory.
     */
    @Test
    public void testCreateObject() {
        System.out.println("createObject null");

        StaticGameObjectFactory instance = new StaticGameObjectFactory();
        GameObjectStatic expResult = null;
        GameObjectStatic result = instance.createObject(0, 0, ID.Bullet, 0, 0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCreateObject2() {
        System.out.println("createObject Score");

        StaticGameObjectFactory instance = new StaticGameObjectFactory();
        GameObjectStatic expResult = new Score(0, 0, ID.Score, 0, 0);
        GameObjectStatic result = instance.createObject(0, 0, ID.Score, 0, 0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCreateObject3() {
        System.out.println("createObject Wall");

        StaticGameObjectFactory instance = new StaticGameObjectFactory();
        GameObjectStatic expResult = new Score(0, 0, ID.Wall, 0, 0);
        GameObjectStatic result = instance.createObject(0, 0, ID.Wall, 0, 0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}

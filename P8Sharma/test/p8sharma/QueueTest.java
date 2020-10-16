/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8sharma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rohani1596
 */
public class QueueTest {
    
    public QueueTest() {
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
     * Test of enque method, of class Queue.
     */
    @Test
    public void testEnque() {
        System.out.println("enque");
        Object newNode = null;
        Queue instance = new Queue();
        boolean expResult = false;
        boolean result = instance.enque(newNode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deque method, of class Queue.
     */
    @Test
    public void testDeque() {
        System.out.println("deque");
        Queue instance = new Queue();
        Object expResult = null;
        Object result = instance.deque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAll method, of class Queue.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        Queue instance = new Queue();
        instance.showAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

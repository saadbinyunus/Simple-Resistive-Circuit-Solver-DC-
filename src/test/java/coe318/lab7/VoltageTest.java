/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class VoltageTest {
    
    Node node1=new Node();
    Node node2=new Node();
    Voltage voltage1=new Voltage (10.0,node1,node2);
    Node[]array1=voltage1.getNodes();
    
    public VoltageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class Voltage.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Voltage instance = voltage1;
        Node[] expResult = array1;
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    
    }


    /**
     * Test of toString method, of class Voltage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Voltage instance = voltage1;
        String expResult = "V1 0 1 DC 10.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}

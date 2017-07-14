/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tommy
 */
public class PositionTest {
    
    public PositionTest() {
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

    @Test
    public void testBasicConstructor_1() throws Exception {
        Position position = new Position('a', 1);
        
        assertEquals(0, position.getCoordonneXToInt());
    }

    @Test
    public void testBasicConstructor_2() throws Exception {
        Position position = new Position(0, 1);
        
        assertEquals('a', position.getCoordonneX());
    }
    
    @Test(expected = Exception.class)
    public void testBasicConstructor_3() throws Exception {
        Position position = new Position(0, 0);
    }
    
    @Test(expected = Exception.class)
    public void testBasicConstructor_4() throws Exception {
        Position position = new Position(0, 11);
    }
    
    @Test(expected = Exception.class)
    public void testBasicConstructor_5() throws Exception {
        Position position = new Position('k', 10);
    }
    
    @Test
    public void testBasicConstructor_TestMax() throws Exception {
        Position position = new Position('j', 10);
        
        assertEquals('j', position.getCoordonneX());
        assertEquals(9, position.getCoordonneXToInt());
        assertEquals(10, (int)position.getCoordonneY());
    }
    
}

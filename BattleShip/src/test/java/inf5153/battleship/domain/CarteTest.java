/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import java.util.ArrayList;
import java.util.List;
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
public class CarteTest {
    
    public CarteTest() {
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

//    @Test
//    public void testGetBateaux() {
//        System.out.println("getBateaux");
//        Carte instance = new Carte();
//        ArrayList<Bateau> expResult = null;
//        ArrayList<Bateau> result = instance.getBateaux();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPlacerBateau() throws Exception {
//        System.out.println("placerBateau");
//        Bateau bateau = null;
//        ArrayList<Position> positions = null;
//        Carte instance = new Carte();
//        instance.placerBateau(bateau, positions);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPositionsDisponibles() {
//        System.out.println("positionsDisponibles");
//        List<Position> positions = null;
//        Carte instance = new Carte();
//        boolean expResult = false;
//        boolean result = instance.positionsDisponibles(positions);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    @Test
    public void testTrouverPositionsAdjacentes_MinY() throws Exception {
        
        Orientation orientation = Orientation.Vertical;
        Position position = new Position('a', 1);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('a', 1));
        expResult.add(new Position('a', 2));
        expResult.add(new Position('a', 3));
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrouverPositionsAdjacentes_MaxY() throws Exception {
        
        Orientation orientation = Orientation.Vertical;
        Position position = new Position('a', 8);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('a', 8));
        expResult.add(new Position('a', 9));
        expResult.add(new Position('a', 10));
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrouverPositionsAdjacentes_MaxYTropGrand() throws Exception {
        
        Orientation orientation = Orientation.Vertical;
        Position position = new Position('a', 9);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('a', 9));
        expResult.add(new Position('a', 8));
        expResult.add(new Position('a', 7));
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrouverPositionsAdjacentes_MinX() throws Exception {
        
        Orientation orientation = Orientation.Horizontal;
        Position position = new Position('a', 1);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('a', 1));
        expResult.add(new Position('b', 1));
        expResult.add(new Position('c', 1));
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrouverPositionsAdjacentes_MaxX() throws Exception {
        
        Orientation orientation = Orientation.Horizontal;
        Position position = new Position('h', 1);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('h', 1));
        expResult.add(new Position('i', 1));
        expResult.add(new Position('j', 1));
        
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testTrouverPositionsAdjacentes_MaxXTropGrand() throws Exception {
        
        Orientation orientation = Orientation.Horizontal;
        Position position = new Position('i', 1);
        Carte instance = new Carte();
        ArrayList<Position> result = instance.trouverPositionsAdjacentes(orientation, position, 3);
        
        
        ArrayList<Position> expResult = new ArrayList();
        expResult.add(new Position('i', 1));
        expResult.add(new Position('h', 1));
        expResult.add(new Position('g', 1));
        
        assertEquals(expResult, result);
    }

//    @Test
//    public void testGetCase() {
//        System.out.println("getCase");
//        Position position = null;
//        Carte instance = new Carte();
//        Case expResult = null;
//        Case result = instance.getCase(position);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

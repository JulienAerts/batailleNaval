/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5153.battleship.domain;

import java.util.ArrayList;
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
public class IATest {
    
    public IATest() {
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
     * Test of positionMiniMax method, of class IA.
     */
    @Test
    public void testPositionMiniMax() throws Exception {
        System.out.println("positionMiniMax");
        IA instance = new IA();
        
        ArrayList<Position> positionsBateau = new ArrayList();
        positionsBateau.add(new Position('b', 5));
        positionsBateau.add(new Position('b', 4));
        
        instance.getCarte().placerBateau(new Torpilleur(), positionsBateau);
        instance.jouerCoup(new Position('b', 5));
        
        
        Position result = instance.positionMiniMax();
        
        assertEquals(new Position('c', 5), result);
        instance.jouerCoup(result);
        result = instance.positionMiniMax();
        assertEquals(new Position('b', 6), result);
        instance.jouerCoup(result);
        result = instance.positionMiniMax();
        assertEquals(new Position('a', 5), result);
        instance.jouerCoup(result);
        result = instance.positionMiniMax();
        assertEquals(new Position('b', 4), result);
    }
    
    /**
     * Test of positionMiniMax method, of class IA.
     */
    @Test
    public void testPositionMiniMax_DansUnCoinMax() throws Exception {
        System.out.println("positionMiniMax");
        IA instance = new IA();
        
        ArrayList<Position> positionsBateau = new ArrayList();
        positionsBateau.add(new Position('j', 10));
        positionsBateau.add(new Position('j', 9));
        
        instance.getCarte().placerBateau(new Torpilleur(), positionsBateau);
        instance.jouerCoup(new Position('j', 10));
        
        
        Position result = instance.positionMiniMax();
        
        assertEquals(new Position('i', 10), result);
        instance.jouerCoup(result);
        result = instance.positionMiniMax();
        assertEquals(new Position('j', 9), result);
        
        
    }
        @Test
    public void testPositionMiniMax_DansUnCoinMin() throws Exception {
        System.out.println("positionMiniMax");
        IA instance = new IA();
        
        ArrayList<Position> positionsBateau = new ArrayList();
        positionsBateau.add(new Position('a', 1));
        positionsBateau.add(new Position('a', 2));
        
        instance.getCarte().placerBateau(new Torpilleur(), positionsBateau);
        instance.jouerCoup(new Position('a', 1));
        
        
        Position result = instance.positionMiniMax();
        
        assertEquals(new Position('b', 1), result);
        instance.jouerCoup(result);
        result = instance.positionMiniMax();
        assertEquals(new Position('a', 2), result);
        
        
    }
//
//    /**
//     * Test of placerBateauxAleatoire method, of class IA.
//     */
//    @Test
//    public void testPlacerBateauxAleatoire() throws Exception {
//        System.out.println("placerBateauxAleatoire");
//        IA instance = new IA();
//        instance.placerBateauxAleatoire();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

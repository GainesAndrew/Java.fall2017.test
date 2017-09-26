/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafall2017.test;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author againes
 */
public class AppTest {
    
    public AppTest() {
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
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main untested");
        
    }

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run untested");
       
    }
    @Test
    public void testConstruct() throws Exception {
        String [] args = new String[] { "a", "b", "c" };
        App app = new App(args);
      
        assertArrayEquals(args,app.args);
    }

    /**
     * Test of readInput method, of class App.
     */
    @Test
    public void testReadInput_Scanner() {
        
        System.out.println("readInput");
        Scanner in = new Scanner("2 10 7\n" +
                                 "4 5 5 5 5 5 9");
        App app = new App(new String[]{});
        app.readInput(in);
        
        assertEquals(2,app.h);
        assertEquals(10,app.w);
        assertEquals(7,app.n);
        assertArrayEquals(new int[] {4,5,5,5,5,5,9}, app.x);
    }

    /**
     * Test of solveProblem method, of class App.
     */
    @Test
    public void testSolveProblem() {
        
        System.out.println("readInput");
        Scanner in = new Scanner("2 10 7\n" +
                                 "5 5 5 5 5 5 5");
        App app = new App(new String[]{});
        app.readInput(in);
        app.solveProblem();
        assertEquals(true, app.completed);
        
    }
    
     @Test
    public void testSolveProblem2() {
        
        System.out.println("readInput");
        Scanner in = new Scanner("2 10 7\n" +
                                 "5 5 5 3 5 2 2");
        App app = new App(new String[]{});
        app.readInput(in);
        app.solveProblem();
        assertEquals(false, app.completed);
        
    }

    /**
     * Test of writeOutput method, of class App.
     */
    

    
    
}

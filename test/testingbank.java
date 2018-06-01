

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import banking01.Application;

/**
 *
 * @author ATOMIC FLEA
 */
public class testingbank {
    Application obj=new Application();
    public testingbank() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        obj=new Application();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void testwithdrawaccount() 
   {
       assertEquals(0,obj.withdraw(100,1000,0));
       assertEquals(0,obj.withdraw(200,3450,0));
       assertEquals(0,obj.withdraw(300,6700,0));
   }
    public void testdepositaccount() 
   {
       assertEquals(0,obj.deposit(100,1000,0));
       assertEquals(0,obj.deposit(200,3450,0));
       assertEquals(0,obj.deposit(300,6700,0));
   }
}

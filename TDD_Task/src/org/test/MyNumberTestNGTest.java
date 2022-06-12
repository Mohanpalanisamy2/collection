package org.test;
import static org.testng.Assert.*;
import org.testng.annotations.*;
 
public class MyNumberTestNGTest extends Calculator {
   private MyNumber number1, number2; // Test Fixtures
 
   @BeforeClass
   public void oneTimeSetUp() {
      System.out.println("@BeforeClass - oneTimeSetUp");
   }
 
   @AfterClass
   public void oneTimeTearDown() {
      System.out.println("@AfterClass - oneTimeTearDown");
   }
 
   @BeforeMethod
   public void setUp() {
      number1 = new MyNumber();
      number2 = new MyNumber();
      System.out.println("@BeforeMethod - setUp before each test");
   }
 
   @AfterMethod
   public void tearDown() {
      System.out.println("@AfterMethod - tearDown before each test");
   }
 
   @Test
   public void testAdd() {
      System.out.println("@Test - testAdd");
      number1.setNumber(1);
      number2.setNumber(2);
      // assertEquals(actual, expected)
      assertEquals(number1.add(number2).getNumber(), 3);
   }
 
   @Test(expectedExceptions = IllegalArgumentException.class)
   public void testDiv() {
      System.out.println("@Test - testDiv with exception");
      number1.setNumber(1);
      number2.setNumber(0);
      number1.div(number2);
   }
}


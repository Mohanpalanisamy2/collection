package org.test;

import static org.testng.Assert.*;
import org.testng.annotations.*;
 
public class TestNGParameterizedTest1
{
   // Test fixtures
   private MyNumber number1 = new MyNumber();
   private MyNumber number2 = new MyNumber();
 
   @Test
   @Parameters(value={"value1", "value2", "result"})
   public void testAdd(int value1, int value2, int result) {
      System.out.println("value1=" + value1 + " value2=" + value2 + " result=" + result);
      number1.setNumber(value1);
      number2.setNumber(value2);
      assertEquals(number1.add(number2).getNumber(), result);
   }
}
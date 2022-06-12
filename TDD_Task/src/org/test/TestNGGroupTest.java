package org.test;

import org.testng.annotations.*;

public class TestNGGroupTest {
   @Test(groups = {"init"})
   public void method1() {
      System.out.println("@Test: method1");
   }
 
   @Test(groups = {"init", "post-init"})
   public void method2() {
      System.out.println("@Test: method2");
   }
 
   @Test(groups = {"main"})
   public void method3() {
      System.out.println("@Test: method3");
   }
}
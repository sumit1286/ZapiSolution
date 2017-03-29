package com.outware.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class LoginTest {
	
	
  @Test
  public void testLoginSuccess() {
	  
	  Assert.assertEquals(true, true);
  }
  
  
  @Test
  public void testLoginFailure() {
	  
	  Assert.assertEquals(true, false);
  }
  
  
  
  @Test
  public void testLoginLocked() {
	  
	  Assert.assertEquals(false, false);
  }
  
  
  @Test
  public void testLoginLocked1() {
	  
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void testLoginLocked2() {
	  
	  Assert.assertEquals(false, false);
  }
  
  
}

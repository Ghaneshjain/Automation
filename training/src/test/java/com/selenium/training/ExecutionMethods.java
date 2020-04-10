package com.selenium.training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionMethods {
	@BeforeClass
	  public void beforeClass()
	  {
	    System.out.println("beforeClass");
	  }
	  @BeforeMethod
	  public void beforeMethod()
	  {
	    System.out.println("\nbeforeMethod");
	  }
	  @Test
	  public void firstTest()
	  {
	    System.out.println("firstTest");
	  }
	  @Test
	  public void secondTest()
	  {
	    System.out.println("secondTest");
	  }
	  @Test
	  public void thirdTest()
	  {
	    System.out.println("thirdTest");
	  }
	
	@AfterMethod
	  public void aftermethod()
	  {
	    System.out.println("AfterMethod");
	  }
	  @AfterClass
	  public void afterClass()
	  {
	    System.out.println("AfterClass");
	  }
	}







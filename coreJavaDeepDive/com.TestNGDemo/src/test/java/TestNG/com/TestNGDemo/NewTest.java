package TestNG.com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Validate() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG";
	  String str5 = "TestNG";
	  String str6 = new String("Not TestNG");
	  
	  int val1=5;
	  int val2=10;
	  SoftAssert soft = new SoftAssert();
	  soft.assertTrue(val1>val2);
	  System.out.println("True");
	  soft.assertSame(str1, str2);
	  System.out.println("True");
	  soft.assertEquals(str1, str2);
	  System.out.println("It Equals");
	  
	  soft.assertNotEquals(str1, str6);
	  System.out.println("Not Equals");
	  
	  
	  
	
	
	  
//	  soft.assertAll();
	  
	  


  }
  @Test
  public void alidate() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG";
	  String str5 = "TestNG";
	  String str6 = new String("Not TestNG");
	  
	  int val1=5;
	  int val2=10;
	  
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertTrue(val1>val2);
	  System.out.println("True");
	  soft.assertSame(str1, str2);
	  System.out.println("True");
	  soft.assertEquals(str1, str2);
	  System.out.println("It Equals");
	  
	  soft.assertNotEquals(str1, str6);
	  System.out.println("Not Equals");
	  
	 
	soft.assertAll();
	
	
	  
	  
	  


  }
  
  
  }

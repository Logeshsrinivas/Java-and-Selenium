package TestNG.com.TestNGDemo;

import org.testng.annotations.DataProvider;

public class DataPov {
	
	@DataProvider(name="data1")
		public Object[][] datapov(){
			return new Object[][] {{"Logesh","Srinivasan","logeshsrinivas@gmail.com","9952008803","Logesh@11","Logesh@11"}};
		}
	@DataProvider(name="data2")
	public Object[][] datapov1(){
		return new Object[][] {{"logeshsrinivas@gmail.com","Logesh@11"}};
	}
	}



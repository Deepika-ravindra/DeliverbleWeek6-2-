package ValuesAssign;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DemoAngulator.CalculatorPage;

public class CalTest {
	
	CalculatorPage calPage;
	
	@BeforeTest
	public void setup() {
		calPage=new CalculatorPage();
		
	}
	@Test(priority=1)
	public void sumTest() {
		String res=calPage.doSum("10","20");
		Assert.assertEquals(res, "30");	
	}
	@Test(priority=2)
	public void subTest() throws Throwable {
		String res=calPage.doSub("100","70");
		Assert.assertEquals(res,"30");		
	}
	@Test(priority=3)
	public void mulTest() {
		String res=calPage.doMul("10","2");
		Assert.assertEquals(res, "20");	
	}
	@Test(priority=4)
	public void divTest() {
		String res=calPage.doDiv("20","10");
		Assert.assertEquals(res, "2");
		
	}
}

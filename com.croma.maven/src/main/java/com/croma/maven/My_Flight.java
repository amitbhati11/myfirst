package com.croma.maven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_Flight {
	WebDriver driver;
	QueraLogn qln;
	LoginPage ln;
	
	@Before
	
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://stackoverflow.com/questions/17657345/how-to-run-standalone-testng-project-from-jar-bat");
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void totest(){
		qln=new QueraLogn(driver);
		qln.toSgn();
		ln=new LoginPage(driver);
		ln.tolpg();
		
	}
	

}

package com.croma.maven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/form/input[2]")
	WebElement lgn;
	
//	constructor
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Test
	
	public void  lgnpg(){
		lgn.click();
	}
	public void tolpg(){
		this.lgnpg();
	}
	
	

}

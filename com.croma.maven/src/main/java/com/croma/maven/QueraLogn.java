package com.croma.maven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueraLogn {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div/div[2]/div/a[2]")
	WebElement sup;
	
	@FindBy(id="display-name")
	WebElement DNm;
	
	@FindBy(id="email")
	WebElement eml;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="submit-button")
	WebElement sbmt;
	
//	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/form/input[2]")
//	WebElement SRE;
	
//	constructor
	
	public QueraLogn(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Test
	
	public void lgnpage(){
		sup.click();
		DNm.sendKeys("AmitBhati");
		eml.sendKeys("amitbhati696@gmail.com");
		pwd.sendKeys("#BS9458661230");
		sbmt.click();
//	SRE.sendKeys("amitbh333@gmail.com");
	}
	public void toSgn(){
		this.lgnpage();
	}

}

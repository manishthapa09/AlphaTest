package com.utilidex.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilidex.base.BaseClass;

public class LoginPageTC extends BaseClass{

	@Test
	public void loginAlpha() {
	
		//Enter the email address and password
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("manish.thapa@utilidex.com");
		driver.findElement(By.xpath(OR.getProperty("passward"))).sendKeys("07Oct@2019");
		
		//Click on the sign button 
		driver.findElement(By.xpath(OR.getProperty("signinBtn"))).click();
	}
}

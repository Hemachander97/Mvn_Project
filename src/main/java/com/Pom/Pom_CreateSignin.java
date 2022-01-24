package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_CreateSignin {

	private	WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Create;

	public WebElement getCreate() {
		return Create;
	}
	public Pom_CreateSignin(WebDriver driver) {
	this.driver =driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="SubmitCreate")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	


}






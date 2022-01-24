package com.Baseclass;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		
		public static WebDriver driver;
		
		//browser launch
		public static void browserLaunch(String name) {

			if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

				driver =new ChromeDriver();
				
			}
//			else if (name.equalsIgnoreCase("FireFox")) {
//				System.setProperty("webdriver.firefox.driver",
//						System.getProperty("user+dir")+"\\Driver\\geckodriver.exe");
	//
//				driver =new GeekoDriver();
//				
			
		}
		//click
		public static void elementClick(WebElement element) {

			element.click();
		}
		//sendkeys
		public static void inputValues(WebElement element, String value) {

			element.sendKeys(value);
		}
		//get
		
		public static void getUrl(String url) {

			driver.get(url);
		}
		public static void screenShot() throws Throwable {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File src = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\D.PRIYA\\eclipse-workspace\\Mvn_Proje\\pics\\snap.png");
		FileUtils.copyFile(src, dest);
		
		
	}}
	 









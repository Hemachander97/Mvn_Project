package com.project;

	import java.io.File;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Automation_Runner1 {
		
		public static void main(String[] args) throws Throwable {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");

			//driver.manage().window().maximize();
			WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
			sign.click();

			WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
			email.sendKeys("devil9892@gmail.com");
			
			WebElement password = driver.findElement(By.name("passwd"));
			password.sendKeys("raj2114");
			

			WebElement signin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			signin.click();
			
			WebElement click = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
			click.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement quick = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
			quick.click();
			
//			WebElement click1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
//			click1.click();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			 js.executeScript("arguments[0].click()", cart);
//				
//				js.executeScript("window.scrollBy(0,9000);");
			 // driver.switchTo().frame(0);
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			
	          // driver.switchTo().frame(0);
				cart.click();

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement proced = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			proced.click();

			WebElement proced1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			proced1.click();

			WebElement proced2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			proced2.click();

			WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
			check.click();

			WebElement proced3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			proced3.click();

			WebElement amont = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
			amont.click();

			WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			confirm.click();

			WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
			back.click();
			TakesScreenshot scr = (TakesScreenshot) driver;
			File src = scr.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\D.PRIYA\\eclipse-workspace\\newproject.selenium\\pic\\snap12.png");
			FileUtils.copyFile(src, dest);

			driver.close();
		}}




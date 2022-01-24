package com.Mvn_Project;

	import java.io.File;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import com.Pom.Pom_CreateSignin;
	import com.Pom.Pom_Signin;

	public class Mini_Projectt extends Base_Class{

		public static void main(String[] args) throws Throwable {

			browserLaunch("chrome");

			getUrl("http://automationpractice.com/index.php");
	        Pom_Signin a = new  Pom_Signin(driver);
	        elementClick(a.getSignin());
			
//			WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
//			elementClick(sign);

			Thread.sleep(2000);
			Pom_CreateSignin b= new Pom_CreateSignin(driver);
			inputValues(b.getCreate(), "devil9875@gmail.com");
			elementClick(b.getSubmit());
//			WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//			inputValues(email,"devil987@gmail.com");

//			WebElement create = driver.findElement(By.id("SubmitCreate"));
//			elementClick(create);

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement gen = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
			elementClick(gen);

			WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			inputValues(firstname,"raj");

			WebElement lastname= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			inputValues(lastname,"kumar");

			WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
			inputValues(pass,"raj2114");

			WebElement day = driver.findElement(By.id("days"));
			Select s = new Select(day);
			s.selectByValue("15");

			WebElement month= driver.findElement(By.id("months"));
			Select s1 = new Select(month);
			s1.selectByIndex(5);

			WebElement years= driver.findElement(By.id("years"));
			Select s2 = new Select(years);
			s2.selectByValue("1998");

			WebElement comp= driver.findElement(By.xpath("(//input[@type='text'])[7]"));
			inputValues(comp,"air asia");

			WebElement add= driver.findElement(By.xpath("(//input[@type='text'])[8]"));
			inputValues(add,"Air Asia no:5,kaveri street");

			WebElement add2= driver.findElement(By.xpath("(//input[@type='text'])[9]"));
			inputValues(add2,"kalpakam,kanchipuram");

			WebElement city= driver.findElement(By.xpath("(//input[@type='text'])[10]"));
			inputValues(city,"chennai");

			WebElement state= driver.findElement(By.xpath("//select[@name='id_state']"));
			inputValues(state,"Texas");

			WebElement zip= driver.findElement(By.xpath("(//input[@type='text'])[11]"));
			inputValues(zip,"75217");

			WebElement country= driver.findElement(By.xpath("//select[@name='id_country']"));
			inputValues(country,"United States");

			WebElement phnno= driver.findElement(By.xpath("(//input[@type='text'])[13]"));
			inputValues(phnno,"9556655622");

			WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			elementClick(submit);

			WebElement shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
			elementClick(shirt);

			WebElement click = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
			elementClick(click);

			WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			elementClick(cart);

			WebElement proced = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			elementClick(proced);

			WebElement proced1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			elementClick(proced1);

			WebElement proced2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			elementClick(proced2);

			WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
			elementClick(check);

			WebElement proced3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			elementClick(proced3);

			WebElement amont = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
			elementClick(amont);

			WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			elementClick(confirm);

			screenShot();


		}}












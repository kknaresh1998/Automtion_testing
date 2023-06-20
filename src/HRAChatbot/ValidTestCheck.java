package HRAChatbot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidTestCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://newhratest.watchyourhealth.com/healthassessment/hra");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn py-0 px-3 mb-4 hraSubmitBtn']")).click();
		
		//check validation
		WebElement inputField = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@class='submit-button']"));
		if(inputField.getAttribute("value") != null) {
			
			submitButton.click();
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid date. Please provide a valid date.\"]")).getAttribute("data-tooltip"));	
		}else {
			System.out.println("Pass1");
		}
		
			
		/*Point point = calender.getLocation(); 
		System.out.println(point.getX());
		System.out.println(point.getY());
		Actions a = new Actions(driver);
		a.moveToElement(calender, 42, 0).build().perform();
		a.click().build().perform();*/
		
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("09-04-1998");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Select Gender
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[1]")).click();
		
		//enter Weight
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("65");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Enter Height
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("5.8");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Enter Waist
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("34");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Select Blood group
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='chat__quick-reply-item'])[4]")));
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[4]")).click();
		
		//Select active level
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[3]")).click();
		
		//Select diet routine
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Select additions that you consumed
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__checkbox-next'])")).click();
		
		//Select junk food
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Select veg or non veg
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Select fast
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();

		//Select competitive sports
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[1]")).click();
		
		//Enter Glasses
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("16");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Enter sleep
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("9");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Select sound sleeper
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Do you Suffer
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__checkbox-next'])")).click();
		
		//Parents suffer
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__checkbox-next'])")).click();
		
		//Watch addiction
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();

		//Select mental disease
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Travel Time
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[1]")).click();
		
		//On phone time
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[1]")).click();
		
		//Regular health check up
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		//Award & appreciation
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();

		//Quality time with family
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();

		//Do yoga
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='chat__question is-final']")).getText());



		
		

		
		
		
		
		






		
		
		


		
		
		
		
		
		
		

	}

	private static WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}

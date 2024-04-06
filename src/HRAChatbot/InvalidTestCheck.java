package HRAChatbot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidTestCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("Sample Url");
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
		
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("09-04-1998");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Select Gender
		driver.findElement(By.xpath("(//div[@class='chat__quick-reply-item'])[1]")).click();
		
		//enter Weight
		int weight = 159;
		String w1 = String.valueOf(weight);
		WebElement containWeight = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containWeight.sendKeys(w1);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(weight >149) {
			
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid Weight. Please provide a valid Weight.\"]")).getAttribute("data-tooltip"));
		}else {
			
			driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys(w1);
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		}
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("75");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();

		//Enter Height
		int height = 10;
		String h = String.valueOf(height);
		WebElement containheight = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containheight.sendKeys(h);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(height >=10) {
			Thread.sleep(2000l);
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid Height. Please provide a valid Height.\"]")).getAttribute("data-tooltip"));
		}
		
		Thread.sleep(2000l);
		//Click on Undo
		driver.findElement(By.xpath("//div[@class='icon undo']")).click();
		//Re-enter Weight
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("75");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		//Re-enter Height
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("5.8");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Enter Waist
		int waist = 10;
		String waistt = String.valueOf(waist);
		WebElement containwaist = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containwaist.sendKeys(waistt);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(waist >=120) {
			Thread.sleep(2000l);
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid Waist. Please provide a valid Waist.\"]")).getAttribute("data-tooltip"));
		}
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("34.5");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Select Blood group
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class	='chat__quick-reply-item'])[4]")));
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
		int glass = 25;
		String g = String.valueOf(glass);
		WebElement containglass = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containglass.sendKeys(g);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(glass >=25) {
			Thread.sleep(2000l);
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid Answer. Can you please type again?\"]")).getAttribute("data-tooltip"));
		}
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		//check glass has decimal validations.
		double glassdec = 24.5;
		String gdec = String.valueOf(glassdec);
		WebElement containglassdec = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containglassdec.sendKeys(gdec);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(gdec.contains(".")) 
		{
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"invalid Glass Count\"]")).getAttribute("data-tooltip"));
		}
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).sendKeys("16");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Enter sleep
		int sleep = 25;
		String s = String.valueOf(sleep);
		WebElement containsleep = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containsleep.sendKeys(s);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(sleep >=24) 
		{
			System.out.println("Sleep hours-" +  driver.findElement(By.cssSelector("div[data-tooltip=\"Sorry, that's not a valid Answer. Can you please type again?\"]")).getAttribute("data-tooltip"));
		}
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		//check glass has decimal validations.
	    double sleepdec = 23.5;
		String sdec = String.valueOf(sleepdec);
		WebElement containsleepdec = driver.findElement(By.xpath("//input[@class='chat__input-box']"));
		containsleepdec.sendKeys(sdec);
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		if(sdec.contains(".")) 
		{
			System.out.println(driver.findElement(By.cssSelector("div[data-tooltip=\"invalid no. of hours\"]")).getAttribute("data-tooltip"));
		}
				
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@class='chat__input-box']")).clear();
		
		
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

}

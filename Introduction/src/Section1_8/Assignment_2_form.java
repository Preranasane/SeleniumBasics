package Section1_8;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
public class Assignment_2_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Prerana/OneDrive/Documents/chromedriver.exe");

		WebDriver driver = new ChromeDriver();



		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



		driver.manage().window().maximize();



		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Rahul");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rahul@email.com");

		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("rahul");

		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();



		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(1);



		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		driver.findElement(By.xpath("//*[@name='bday']")).sendKeys("11022022");

		driver.findElement(By.xpath("//*[@type='submit']")).click();



		Thread.sleep(2000);

		String successSubmitMessage = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText();

		String[] successSubmitMessageA = successSubmitMessage.split("Success!");

		successSubmitMessageA[0] = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']/strong")).getText();

		System.out.println(successSubmitMessageA[0] + successSubmitMessageA[1]);

		Thread.sleep(2000);

		

		driver.quit();


	}

}

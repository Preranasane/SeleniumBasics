package Section_11;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Prerana/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String Label = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(Label);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Label);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		String alertText = driver.switchTo().alert().getText().split(" ")[1].trim().split(",")[0];
		System.out.println(alertText);
		driver.switchTo().alert().accept();
	}

}

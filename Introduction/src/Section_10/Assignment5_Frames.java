package Section_10;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment5_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Prerana/OneDrive/Documents/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		framesAssignment(driver);

		}



		public static void framesAssignment(WebDriver driver)

		{

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

		//System.out.println(driver.findElements(By.tagName("frame")).size()); //framecount

		driver.switchTo().frame(driver.findElement(By.name("frame-top")));

		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

		String middle = driver.findElement(By.id("content")).getText();

		System.out.println(middle);
	}

}

package Section_12;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment8_AutocompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Prerana/OneDrive/Documents/chromedriver.exe");


		WebDriver driver= new ChromeDriver();


        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");


		Thread.sleep(5000);

		List<WebElement> alldata= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		for(int i=0; i<alldata.size();i++) {


		System.out.println(alldata.get(i).getText());

		if(alldata.get(i).getText().contains("United Arab Emirates")) {


		alldata.get(i).click();

		break;

		}


		}



		System.out.println("done");

		Thread.sleep(5000);

		driver.findElement(By.id("autocomplete")).click();

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));


	}

}

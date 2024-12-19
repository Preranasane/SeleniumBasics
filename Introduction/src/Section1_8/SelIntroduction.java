package Section1_8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
	
		// Invoking Browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerana\\OneDrive\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");

		 System.out.println(driver.getTitle());

		 System.out.println(driver.getCurrentUrl());

		 driver.close();

	}

}

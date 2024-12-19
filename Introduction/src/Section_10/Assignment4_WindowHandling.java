package Section_10;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4_WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\my files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//li/a[contains(text(),'Multiple Windows')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		/*

		* Set<String> Window= driver.getWindowHandles(); Iterator<String> i=

		* Window.iterator();

		*/

		Set<String> Window= driver.getWindowHandles();

		Iterator <String> it= Window.iterator();

		String ParentId = it.next();

		String ChildId= it.next();

		driver.switchTo().window(ChildId);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

		String NW= driver.findElement(By.xpath("//div[@class='example']/h3")).getText();

		driver.switchTo().window(ParentId);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}

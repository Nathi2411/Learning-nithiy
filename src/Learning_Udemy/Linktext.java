package Learning_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		// links
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();
}
	
}

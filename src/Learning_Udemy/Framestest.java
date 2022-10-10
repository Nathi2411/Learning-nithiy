package Learning_Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement firstbtn = driver.findElement(By.id("Click"));
		firstbtn.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondtbtn = driver.findElement(By.id("Click1"));
		secondtbtn.click();
		
		driver.switchTo().defaultContent();
		List<WebElement> total = driver.findElements(By.tagName("iframe"));
		int a = total.size();
		System.out.println("total iframes in this page = "+a);
		
		
	}

}

package Learning_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("Sample text");
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("Append text");
		
		WebElement Getext = driver.findElement(By.name("username"));
		String Value = Getext.getAttribute("Value");	
		System.out.println(Value);
		
		WebElement Cleartxt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		Cleartxt.clear();
		
		WebElement Disable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean enabled = Disable.isEnabled();
		System.out.println(enabled);
		
	}

}

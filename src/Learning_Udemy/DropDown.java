package Learning_Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(Dropdown1);
		select.selectByIndex(1);
		
		WebElement Dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(Dropdown2);
		select1.selectByValue("3");
		
		WebElement Dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(Dropdown3);
		select2.selectByVisibleText("Appium");
		
		WebElement Dropdown4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Thread.sleep(3000);
		Select select3 = new Select(Dropdown4);
		List<WebElement> list = select3.getOptions();
		int number = list.size();
		System.out.println("The number is " + number);
		driver.quit();		
		
	}

}

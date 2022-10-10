package Learning_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		WebElement Position = driver.findElement(By.id("position"));
		Point value = Position.getLocation();
				int y = value.getY();
		System.out.println("X value Is :" + y + "Y value is :" + y);

		WebElement findcolor = driver.findElement(By.id("color"));
		String color = findcolor.getCssValue("background-color");
		System.out.println("The Color Is :" + color);

		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);

		WebElement home = driver.findElement(By.id("home"));
		home.click();

	}

}

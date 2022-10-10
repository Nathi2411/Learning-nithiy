package Learning_Udemy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//home/nithiyanantham/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		driver.manage().window().maximize();
		
		String oldwindow = driver.getWindowHandle();
		WebElement homewindow = driver.findElement(By.id("home"));
		homewindow.click();
		
		Set<String> newwindow = driver.getWindowHandles();
		
		for (String handle : newwindow) {
			
			driver.switchTo().window(handle);
			}
		Thread.sleep(3000);
		WebElement editbtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		editbtn.click();		
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		//2nd button
		WebElement multiplewindow = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		multiplewindow.click();
		driver.getWindowHandles();
		int size = driver.getWindowHandles().size();
		System.out.println("The size of window  ="+ size);
				
		Set<String> newwindow1 = driver.getWindowHandles();
		for (String new1 : newwindow1) {
			if(!new1.equals(oldwindow)) {
				Thread.sleep(3000);
				driver.switchTo().window(new1);
				driver.close();
		}
		

		}
		
	}	

}












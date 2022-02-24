package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			//go or click mensfashion
			WebElement mensfashion=driver.findElement(By.linkText("Men's Fashion"));
			Actions builder=new Actions(driver);
			builder.moveToElement(mensfashion).perform();
			
			//go to mensshoes
			driver.findElement(By.linkText("Sports Shoes")).click();
			
			
			//to 
			WebElement shoesCount=driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div"));
			String size=shoesCount.getText();
			System.out.println("sports shoe count: "+ size);
			
			String title=driver.getTitle();
			System.out.println(title);
			
			
	}

}

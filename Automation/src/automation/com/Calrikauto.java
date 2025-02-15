package automation.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calrikauto 
{
	

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vragh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver133.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3care.com/");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=1;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}

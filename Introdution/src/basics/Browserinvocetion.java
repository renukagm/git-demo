package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:/Users/YADAV/Desktop/geckodriver.exe");
        //WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/YADAV/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.findElement(By.xpath(xpathExpression)Xpath("//*[@input=gsfi"));
      
        
	}

}

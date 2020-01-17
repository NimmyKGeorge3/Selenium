import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlaskaTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
	
	driver.findElement(By.id("FH-origin")).sendKeys("nyc");

	Select dest=new Select(driver.findElement(By.id("FH-destination")));
	dest.selectByValue("Disney World");
	driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);
	
	//explicit wait
	WebDriverWait explicit=new WebDriverWait(driver,20);
	explicit.until(ExpectedConditions.elementToBeClickable(By.id("hotelNewSearchLnk")));
	driver.findElement(By.id("hotelNewSearchLnk")).click();
	
	}

}

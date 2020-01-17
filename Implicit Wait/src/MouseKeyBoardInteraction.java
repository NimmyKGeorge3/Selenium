import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		//Action class to perform mouse keyboard interactions
		Actions a=new Actions(driver);
	   a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("HELLO");
		
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.id("nav-orders"))).contextClick().build().perform();
	}

}

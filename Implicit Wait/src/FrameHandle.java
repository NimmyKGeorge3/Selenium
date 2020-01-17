import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chrome_driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com");
		// if there is more than one frame
	//	driver.switchTo().frame(0);
		// to find number of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.id("draggable"));
		Actions a= new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}

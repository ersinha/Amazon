package amazontestfile;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amz_Lounch_Quit 
{
	ChromeDriver driver;
	@BeforeMethod
	void Lounch()
	{
		driver=new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hoverover= driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		Actions act = new Actions(driver);
		act.moveToElement(hoverover).perform();
				
	}
		
	@AfterMethod
	void quit()
	{
		//Thread.sleep(2000);
	//	driver.quit();
		
	}

}

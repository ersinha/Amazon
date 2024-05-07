package amazonsourcefile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Search_Page 
{
	ChromeDriver driver;
	//1.Locating element for each component
	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement firstindexproduct;
	
	
	//2.Passing data in element for each component
	public void firstproduct() 
	{
		firstindexproduct.click();
		//String parent= driver.getWindowHandle();
		//Set<String> parent_child =driver.getWindowHandles();
		//Iterator<String> id =parent_child.iterator();
		//String parent1= id.next();
		//String child1 =id.next();
		//System.out.println(driver.getTitle());
		//driver.switchTo().window(child1);
		//System.out.println(driver.getTitle());
		//driver.close();		
	}
		
	
	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
		public Amz_Search_Page(ChromeDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	

}

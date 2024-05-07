package amazonsourcefile;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Home_Page 
{
	ChromeDriver driver;
	//1.Locating element for each component
	@FindBy(id= "twotabsearchtextbox")
	WebElement HomePageSeachBox;
	
	@FindBy (id = "nav-search-submit-button")
	WebElement HomePageSeachBoxClick;
	
	
	//2.Passing data in element for each component
	public void searchbox()
	{
		HomePageSeachBox.sendKeys("Mobile");
	}
	public void searchboxclick()
	{
		HomePageSeachBoxClick.click();
		
	}
	
	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Amz_Home_Page(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}

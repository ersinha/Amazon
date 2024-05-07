package amazonsourcefile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishlistPage 
{
	

		ChromeDriver driver;
		//1.Locating element for each component
		@FindBy (id= "add-to-wishlist-button-submit")
		WebElement addtowishlistbutton;
		
		@FindBy(id="continue-shopping")
		WebElement continuebutton;
		
		@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
		WebElement addtocart;
		
		@FindBy(xpath="//span[@id='attach-sidesheet-checkout-button']")
		WebElement proceedtocheckout;
		
		
		//2.Passing data in element for each component
		public void wishlist() 
		{
			addtowishlistbutton.click();	
		}
		public void contbut()
		{
			continuebutton.click();
		}
		public void addcard() 
		{
			addtocart.click();
		}
		public void checkout() 
		{
			proceedtocheckout.click();
		}
	
	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
		public AddToWishlistPage(ChromeDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

}

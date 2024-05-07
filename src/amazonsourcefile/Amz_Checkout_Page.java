package amazonsourcefile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Checkout_Page 
{
	ChromeDriver driver;
	//1.Locating element for each component
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement useaddress;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement creditdebitradiobutton;
	
	@FindBy(linkText="Enter card details")
	WebElement entercardno;
	
	
	//2.Passing data in element for each component
	public void address() 
	{
		useaddress.click();
	}
	public void radiobutton_credit_debit() 
	{
		creditdebitradiobutton.click();
	}
	public void cardenter() 
	{
		entercardno.click();
	}
	

	//3.Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Amz_Checkout_Page(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}

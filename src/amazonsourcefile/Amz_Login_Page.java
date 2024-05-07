package amazonsourcefile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Amz_Login_Page 
{
	//Locating element for each component
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement singInhomepage;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement passwordbutton;
	
	@FindBy(id="ap_password")
	WebElement pwdfield;
	
	@FindBy (id="signInSubmit")
	WebElement signbutton;
	
		
	//Passing data in element for each component
	public void singhomepage()
	{
		singInhomepage.click();
	}
	public void username()
	{
		email.sendKeys("er.sinha66@gmail.com");
	}
	public void contbutton()
	{
		passwordbutton.click();
	}
	public void pass() 
	{
		pwdfield.sendKeys("Rahul_Shwetha91");
	}
	public void singin() 
	{
		signbutton.click();
	}
	
	//Creating Constructor and Initializing the elements using PageFactory Class inside it.
	public Amz_Login_Page(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

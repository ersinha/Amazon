package amazontestfile;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import amazonsourcefile.AddToWishlistPage;
import amazonsourcefile.Amz_Checkout_Page;
import amazonsourcefile.Amz_Home_Page;
import amazonsourcefile.Amz_Login_Page;
import amazonsourcefile.Amz_Search_Page;

public class Amz_Scenario_1 extends Amz_Lounch_Quit
{
	@Test
	public void all() 
	{
		
	//Calling Login Page Method
		Amz_Login_Page amz= new Amz_Login_Page(driver);
		amz.singhomepage();
		amz.username();
		amz.contbutton();
		amz.pass();
		amz.singin();
		
	//Calling Home Page Method
		Amz_Home_Page azmhome=new Amz_Home_Page(driver);
		azmhome.searchbox();
		azmhome.searchboxclick();
		Amz_Search_Page azmsearch = new Amz_Search_Page(driver);
		azmsearch.firstproduct();
		//System.out.println(driver.getTitle());
		String parent= driver.getWindowHandle();
		Set<String> parent_child =driver.getWindowHandles();
		Iterator<String> id =parent_child.iterator();
		String parent1 =id.next();
		String child1 =id.next();
		System.out.println(driver.getTitle());
		driver.switchTo().window(child1);
		//driver.close();
		System.out.println(driver.getTitle());
		
	//Calling WishList Page Method
		AddToWishlistPage wishlistrv = new AddToWishlistPage(driver);
		wishlistrv.wishlist();
		wishlistrv.contbut();
		wishlistrv.addcard();
		wishlistrv.checkout();
		
	//Calling Checkout Page Method
		Amz_Checkout_Page checkout= new Amz_Checkout_Page(driver);
		checkout.address();
		checkout.radiobutton_credit_debit();
		checkout.cardenter();
	}

	
	
	
}

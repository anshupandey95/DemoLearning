package TestRunner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebUtil;

public class pagess {
	
	 WebUtil ut;
	public pagess(WebUtil ut) {
		this.ut = ut;
		PageFactory.initElements(ut.getDriver(), this);
	}
	/////////////////////Login/////////
	
	
	@FindBy(xpath = "(//input[@class='native-input sc-ion-input-ios'])[1]")
	WebElement logName;
	@FindBy(xpath = "(//input[@class='native-input sc-ion-input-ios'])[2]")
	WebElement logpassword;

	@FindBy(xpath = "//ion-button[@type='submit']")
	WebElement sub;

	@FindBy(xpath = "//ion-button[@class='btn-blue-icon ios button button-solid ion-activatable ion-focusable hydrated']")
	WebElement bookButton;

	public void Logname() {
		ut.usingsendkeys(logName, "user2@knoxweb.com","UserNameField");

	}

	public void logpass() {
		ut.usingsendkeys(logpassword, "sR@123456", "Passwordfield");

	}

	public void submit() {
		

		ut.javascriptClick(sub, "SubmitButton");
		
	}
	//////////////////Login/////////////////////////
	
	@FindBy(xpath = "(//p[text()='Laptop & Accessories'])[1]")
	WebElement e;
	
	@FindBy(xpath = "//input[@placeholder='Search for Products, Brands, Offers']")
	WebElement SearchButton;
	
	@FindBy(xpath = "//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorWarning MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorWarning css-tyahgk']")
	WebElement drag;
	
	
	
	public void clickk() {
		ut.click(e, "clicked on electronics ");
	}
	
	public void sendSearchitems() {
		ut.sendkeys(SearchButton, "searchButtonDataSends", "electronics");
	}
	
	public void slide() {
		ut.dragAndDrop(drag, 10, 0);
	}
	
	public String verifytitle()  {
		String pageTitle = ut.getDriver().getTitle();
		return pageTitle;
	}

}

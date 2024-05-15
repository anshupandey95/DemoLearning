package TestRunner;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utility.WebUtil;
import ZapBookPages.StaffPage;
import ZapBookPages.customerpage;

public class StaffTest extends BaseTest {

	//@Test
	public void CreatingNewEmployee_WithValidDetails() throws InterruptedException, AWTException {

		StaffPage page = new StaffPage(ut);
		ut.implicitWait(15);
		page.StaffTabClick();
		Thread.sleep(4000);
		page.elementEmployeewait();
		Thread.sleep(3000);
		//page.photoBtclicl();
//				
//		page.uploadphoto();
//		ut.getExtentTest().log(Status.INFO,
//				MarkupHelper.createLabel("Profile photo uploaded Suscessfully", ExtentColor.ORANGE));
//		Thread.sleep(3000);
//		page.InputFullName();
//		page.Enterdate();
//		Thread.sleep(3000);
//		page.InputEmail();
//		page.InputPhoneNumber();
//		Thread.sleep(3000);
//		page.InputPosition();
//		Thread.sleep(2000);
		page.ids();
		//page.scrollupto();
		ut.scrollDownjava();
//
//		
//		

		Thread.sleep(3000);

		page.UsrRoleClick();
		Thread.sleep(3000);
		page.PlayerButtonClick();
		//page.playerclick();
		//page.PlayerButtonClick();
		Thread.sleep(5000);

		Thread.sleep(3000);
		page.timeSelection();
		Thread.sleep(5000);
		page.Parttimeselect();
		page.locationClick();
		Thread.sleep(5000);
		page.locationselect();

	}
	
	//@Test
	public void customertabTest() throws InterruptedException {
		customerpage p = new customerpage(ut);
		ut.implicitWait(10);
		p.clickcustomer();
		Thread.sleep(4000);
		p.categoryclick();
		Thread.sleep(4000);
		p.scrlltoFC();
	}

}

package TestRunner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ZapBookPages.StaffPage;
//@Listeners(Utility.liissnneerr.class)
public class Login extends BaseTest {

	//@Test
	public void run() {
		pagess p = new pagess(ut);
		p.clickk();

	}

	//@Test
	public void run3() throws IOException, InterruptedException {
		pagess p = new pagess(ut);
		p.clickk();
		//Assert.assertTrue(false);
		
		p.sendSearchitems();
//		Thread.sleep(2000);
//		p.slide();
//		ut.refreshWindow();
//		ut.getExtentTest().log(Status.INFO, "Page Verified");
//		String tiitle = p.verifytitle();
//		System.out.println(tiitle);
//		
//		String Expected = "CrazzyHub";
////		
//		if(tiitle.equals(Expected)) {
//			Assert.assertTrue(true);
//		}else {
//			System.out.println("Not Matched");
//			Assert.assertTrue(false);	}
//		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
}

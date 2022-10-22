package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.mortbay.log.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PajeObject.LandingPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefi extends BaseClass1{
	
	@Before
	public void Setup() {
		Log=LogManager.getLogger("StepDefi");
		ReadConf=new ReadConfig();
		String Browser=ReadConf.getBrowser();
		switch(Browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;	
		}
		
		Log.info("Setup 1 Executed");
	}
	
	@Given("User Lunch Chrome Browser")
	public void user_lunch_chrome_browser() {
	    lp=new LandingPage(driver);
	}

	@Given("User opens Url {string}")
	public void user_opens_url(String url) {
		driver.get(url); 
		   Log.info("Url Lunched....");
	}
//////////////////////Validate Country Name//////////////////////
	@Then("Country Name Should Be {string}")
	public void country_name_should_be(String CountryName) {
	    String Country=lp.getCountryName();
	    if(Country.contains(CountryName)) {
	    	Log.info("Country Name Matched");
	    	Assert.assertTrue(true);
	    }else {
	    	Log.info("Country Name Not Matched");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("Close Browser")
	public void close_browser() {
	    //driver.quit();
	}
	///////////////// Validate Release Date///////////////////
	@Then("Release Date Should Be {string}")
	public void release_date_should_be(String ReleaseDate) {
		String Release=lp.getReleseDate();
	    if(Release.equalsIgnoreCase(ReleaseDate)) {
	    	Log.info("Release Date Matched");
	    	Assert.assertTrue(true);
	    }else {
	    	Log.warn("Release Date Did Not Match");
	    	Assert.assertTrue(false);
	    }
	}
	
	@After(order=1)
	public void TearDown(Scenario sc) {
		if(sc.isFailed()) {
			final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "image/png", sc.getName());
			Log.info("Test Case Failed");
			driver.quit();
		}else {
			Log.info("Test Passed");
		}

	}
	@After(order=2)
	public void teardown(Scenario sc)
	{
		System.out.println("Tear Down method executed..");
		if(sc.isFailed()==true)
		{
			//Convert web driver object to TakeScreenshot

			String fileWithPath = "C:\\Users\\nitis\\eclipse-workspace\\TestVagrantProjectCucumber\\Screenshot\\failedScreenshot.png";
			TakesScreenshot scrShot =((TakesScreenshot)driver);

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination
			File DestFile=new File(fileWithPath);

			//Copy file at destination

			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//driver.quit();
	}


}

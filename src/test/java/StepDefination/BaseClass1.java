package StepDefination;


import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import PajeObject.LandingPage;
import Utilities.ReadConfig;

//Parent Class
public class BaseClass1 {
	
	public WebDriver driver;
	public static Logger Log;
	public ReadConfig ReadConf;
	public LandingPage lp;
	public String GenerateRandomEmailId() {
		return RandomStringUtils.randomAlphabetic(5);
	}

}

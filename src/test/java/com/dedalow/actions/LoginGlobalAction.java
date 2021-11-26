package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import io.restassured.response.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginGlobalAction{

    private Class reflectiveClass;
    private Constant constant;
    private WebDriver driver;
    private String handler;
    private JavascriptExecutor js;
    private Properties prop;
    private String level;
    private String caseName;
    private File folderTestCase;
    private File folderDownloads;
    private String finalResult;
    private HashMap<String, String> excelSheet;
    
      
	private By IsClickSingIn = By.id("login");
	private By VisibleNameProfile = By.xpath("//strong[contains(text(),'cadgitlab')]");
	private By SingIn = By.id("login");
	private By UserName = By.id("id_username");
	private By Password = By.xpath("//input[@id='id_password']");
	private static By Nameprofile = By.xpath("//strong[contains(text(),'cadgitlab')]");
    
    public LoginGlobalAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
    }

    public void getPrepareAction() throws Exception {
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        this.constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
        this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
        this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
        this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
        this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
        this.folderTestCase = (File) reflectiveClass.getField("folderTestCase").get(reflectiveClass);
        this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
        this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
        this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
    }

    public LoginGlobalAction IsClickSingIn() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickSingIn));
            Report.reportLog(reflectiveClass, "Condition IsClickSingIn isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	public LoginGlobalAction IndexCAD () {
        driver.get(prop.getProperty("WEB_URL") + "");
        Report.reportLog(reflectiveClass, "IndexCAD action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	public LoginGlobalAction VisibleNameProfile() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleNameProfile));
            Report.reportLog(reflectiveClass, "Condition VisibleNameProfile isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public LoginGlobalAction SingIn() throws Exception {
        	driver.findElement(UserName).clear();
            driver.findElement(UserName).sendKeys("cadgitlab");
            Report.reportLog(reflectiveClass, "Typed " + "cadgitlab in UserName", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(Password).clear();
            driver.findElement(Password).sendKeys("cadgitlab");
            Report.reportLog(reflectiveClass, "Typed " + "cadgitlab in Password", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SingIn));
            Report.reportLog(reflectiveClass, "Condition SingIn isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(SingIn).click();
            Report.reportLog(reflectiveClass, "Clicked SingIn", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
	public LoginGlobalAction CheckProfile() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(Nameprofile));
            Report.reportLog(reflectiveClass, "Condition Nameprofile isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("cadgitlab".equals(driver.findElement(Nameprofile).getText()), "Field Nameprofile not found in assertion");
        	Report.reportLog(reflectiveClass, "The field cadgitlab has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field CheckProfile has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doLoginGlobalAction() throws Exception {
    
    
		IndexCAD();
    	Thread.sleep(1000);

		IsClickSingIn();
      
		SingIn();
    	Thread.sleep(1000);

		VisibleNameProfile();
      
		CheckProfile();
    
		
    }
}
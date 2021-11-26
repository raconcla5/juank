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

public class PushGogsGlobalAction{

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
    
      
	private By VisibleGeneratedCorrectly = By.xpath("/html/body/div[12]/div/div/div[2]/div/div[3]/div/div[2]");
	private By ShowResults = By.xpath("//a[contains(text(),'Show results...')]");
	private static By GeneratedCorrectly = By.xpath("/html/body/div[12]/div/div/div[2]/div/div[3]/div/div[2]");
	private By IsClickGenerateAndPush = By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/ul/li[6]/a");
	private By ExecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By IsClickRunGenerateAndPush = By.xpath("//button[contains(text(),'Run...')]");
	private By GenerateAndPush = By.xpath("//a[contains(text(),'Test - Export Test Model Generate and Push')]");
	private By VisibleGenerateAndPush = By.xpath("//span[contains(text(),'Export Test Model Generate and Push finished with ')]");
	private By RunGenerateAndPush = By.xpath("//button[contains(text(),'Run...')]");
	private By IsClickShowResults = By.xpath("//a[contains(text(),'Show results...')]");
	private By ExecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
    
    public PushGogsGlobalAction(Class reflectiveClass) throws Exception {
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

    public PushGogsGlobalAction IsClickGenerateAndPush() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickGenerateAndPush));
            Report.reportLog(reflectiveClass, "Condition IsClickGenerateAndPush isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public PushGogsGlobalAction ExecutePlugIn() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ExecutePlugIn));
            Report.reportLog(reflectiveClass, "Condition ExecutePlugIn isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(ExecutePlugIn).click();
            Report.reportLog(reflectiveClass, "Clicked ExecutePlugIn", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public PushGogsGlobalAction IsClickRunGenerateAndPush() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickRunGenerateAndPush));
            Report.reportLog(reflectiveClass, "Condition IsClickRunGenerateAndPush isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public PushGogsGlobalAction GenerateAndPush() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GenerateAndPush));
            Report.reportLog(reflectiveClass, "Condition GenerateAndPush isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(GenerateAndPush).click();
            Report.reportLog(reflectiveClass, "Clicked GenerateAndPush", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public PushGogsGlobalAction VisibleGenerateAndPush() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleGenerateAndPush));
            Report.reportLog(reflectiveClass, "Condition VisibleGenerateAndPush isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public PushGogsGlobalAction RunGenerateAndPush() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RunGenerateAndPush));
            Report.reportLog(reflectiveClass, "Condition RunGenerateAndPush isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(RunGenerateAndPush).click();
            Report.reportLog(reflectiveClass, "Clicked RunGenerateAndPush", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public PushGogsGlobalAction IsClickShowResults() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickShowResults));
            Report.reportLog(reflectiveClass, "Condition IsClickShowResults isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public PushGogsGlobalAction ExecutePlugIn1() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ExecutePlugIn1));
            Report.reportLog(reflectiveClass, "Condition ExecutePlugIn1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(ExecutePlugIn1).click();
            Report.reportLog(reflectiveClass, "Clicked ExecutePlugIn1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public PushGogsGlobalAction VisibleGeneratedCorrectly() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleGeneratedCorrectly));
            Report.reportLog(reflectiveClass, "Condition VisibleGeneratedCorrectly isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public PushGogsGlobalAction ShowResults() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ShowResults));
            Report.reportLog(reflectiveClass, "Condition ShowResults isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(ShowResults).click();
            Report.reportLog(reflectiveClass, "Clicked ShowResults", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
	public PushGogsGlobalAction GenerateAndPushGeneratedCorrectly() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(GeneratedCorrectly));
            Report.reportLog(reflectiveClass, "Condition GeneratedCorrectly isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(GeneratedCorrectly).getText().contains("Generated correctly"), "Field GeneratedCorrectly not found in assertion");
        	Report.reportLog(reflectiveClass, "The field Generated correctly has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field GenerateAndPushGeneratedCorrectly has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doPushGogsGlobalAction() throws Exception {
    
    
		ExecutePlugIn();
    	Thread.sleep(1000);

		IsClickGenerateAndPush();
      
		GenerateAndPush();
    	Thread.sleep(1000);

		IsClickRunGenerateAndPush();
      
		RunGenerateAndPush();
    	Thread.sleep(1000);

		VisibleGenerateAndPush();
      
		ExecutePlugIn1();
    	Thread.sleep(1000);

		IsClickShowResults();
      
		ShowResults();
    	Thread.sleep(1000);

		VisibleGeneratedCorrectly();
      
		GenerateAndPushGeneratedCorrectly();
    
		
    }
}
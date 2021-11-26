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

public class DeleteCreateGlobalAction{

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
    
      
	private By DeleteProjectOK = By.id("cadgitlab+createglobal");
	private By IsClickDeleteProject = By.id("cadgitlab+createglobal");
	private By DeleteProject = By.xpath("//button[contains(text(),'Delete Project ...')]");
	private By IsClickMenuProyects = By.xpath("//span[contains(text(),'Projects')]");
	private By MenuProyects = By.xpath("//span[contains(text(),'Projects')]");
	private By GoToProfile = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
	private By SignOut = By.xpath("//button[contains(text(),'Sign Out')]");
	private By IsClickDeleteProject1 = By.xpath("//button[contains(text(),'Delete Project ...')]");
	private By SelectCreateGlobal = By.xpath("//span[contains(text(),'createglobal')]");
	private By NameProject = By.xpath("//body/div[@id='dedalow-profile']/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]");
    
    public DeleteCreateGlobalAction(Class reflectiveClass) throws Exception {
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

    public DeleteCreateGlobalAction IsClickMenuProyects() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickMenuProyects));
            Report.reportLog(reflectiveClass, "Condition IsClickMenuProyects isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	public DeleteCreateGlobalAction IndexProfile () {
        driver.get(prop.getProperty("WEB_URL") + "/profile/home");
        Report.reportLog(reflectiveClass, "IndexProfile action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public DeleteCreateGlobalAction MenuProyects() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MenuProyects));
            Report.reportLog(reflectiveClass, "Condition MenuProyects isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(MenuProyects).click();
            Report.reportLog(reflectiveClass, "Clicked MenuProyects", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public DeleteCreateGlobalAction IsClickDeleteProject1() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickDeleteProject1));
            Report.reportLog(reflectiveClass, "Condition IsClickDeleteProject1 isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public DeleteCreateGlobalAction SelectCreateGlobal() throws Exception {
        	driver.findElement(NameProject).clear();
            driver.findElement(NameProject).sendKeys("createglobal");
            Report.reportLog(reflectiveClass, "Typed " + "createglobal in NameProject", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectCreateGlobal));
            Report.reportLog(reflectiveClass, "Condition SelectCreateGlobal isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(SelectCreateGlobal).click();
            Report.reportLog(reflectiveClass, "Clicked SelectCreateGlobal", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public DeleteCreateGlobalAction IsClickDeleteProject() {
        	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickDeleteProject));
            Report.reportLog(reflectiveClass, "Condition IsClickDeleteProject isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public DeleteCreateGlobalAction DeleteProject() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DeleteProject));
            Report.reportLog(reflectiveClass, "Condition DeleteProject isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(DeleteProject).click();
            Report.reportLog(reflectiveClass, "Clicked DeleteProject", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public DeleteCreateGlobalAction DeleteProjectOK() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DeleteProjectOK));
            Report.reportLog(reflectiveClass, "Condition DeleteProjectOK isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(DeleteProjectOK).click();
            Report.reportLog(reflectiveClass, "Clicked DeleteProjectOK", "INFO", 5000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public DeleteCreateGlobalAction GoToProfile() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoToProfile));
            Report.reportLog(reflectiveClass, "Condition GoToProfile isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(GoToProfile).click();
            Report.reportLog(reflectiveClass, "Clicked GoToProfile", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public DeleteCreateGlobalAction SignOut() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SignOut));
            Report.reportLog(reflectiveClass, "Condition SignOut isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(SignOut).click();
            Report.reportLog(reflectiveClass, "Clicked SignOut", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doDeleteCreateGlobalAction() throws Exception {
    
    
		IndexProfile();
    	Thread.sleep(1000);

		IsClickMenuProyects();
      
		MenuProyects();
    	Thread.sleep(1000);

		SelectCreateGlobal();
    	Thread.sleep(1000);

		IsClickDeleteProject1();
      
		DeleteProject();
    	Thread.sleep(1000);

		IsClickDeleteProject();
      
		DeleteProjectOK();
    	Thread.sleep(5000);

		GoToProfile();
    	Thread.sleep(1000);

		SignOut();
    
		
    }
}
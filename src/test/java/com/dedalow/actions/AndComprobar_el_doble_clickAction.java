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

public class AndComprobar_el_doble_clickAction{

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
    
      
	private static By checkTitle4 = By.xpath("//h2");
	private By doubleClickToOkByXpath = By.xpath("//*[@id=\"doubleClickToOk\"]");
	private By waitForButton = By.xpath("//*[@id=\"doubleClickToOk\"]");
	private By disableButtons2 = By.id("disableButtons");
    
    public AndComprobar_el_doble_clickAction(Class reflectiveClass) throws Exception {
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

    public AndComprobar_el_doble_clickAction goToApp4 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToApp4 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public AndComprobar_el_doble_clickAction checkPage4() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage"), "Field checkPage4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage4 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public AndComprobar_el_doble_clickAction waitForButton() {
        	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(waitForButton));
            Report.reportLog(reflectiveClass, "Condition waitForButton isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public AndComprobar_el_doble_clickAction disableButtons2() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons2));
            Report.reportLog(reflectiveClass, "Condition disableButtons2 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons2).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public AndComprobar_el_doble_clickAction doubleClickToOkByXpath() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickToOkByXpath)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickToOkByXpath", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public AndComprobar_el_doble_clickAction assertOkPage2() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle4));
            Report.reportLog(reflectiveClass, "Condition checkTitle4 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle4).getText().contains("OkPage"), "Field checkTitle4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage2 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doAndComprobar_el_doble_clickAction() throws Exception {
    
    
		goToApp4();
    
		checkPage4();
    
		disableButtons2();
    
		waitForButton();
      
		doubleClickToOkByXpath();
    
		assertOkPage2();
    
		
    }
}
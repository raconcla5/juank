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

public class AndComprobar_el_click_izquierdo_pAction1{

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
    
      
	private By disableButtons1 = By.id("disableButtons");
	private By clickToOkByXpath = By.xpath("//*[@id=\"clickToOk\"]");
	private static By checkTitle3 = By.xpath("//h2");
    
    public AndComprobar_el_click_izquierdo_pAction1(Class reflectiveClass) throws Exception {
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

    public AndComprobar_el_click_izquierdo_pAction1 goToApp3 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToApp3 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public AndComprobar_el_click_izquierdo_pAction1 checkPage3() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage"), "Field checkPage3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage3 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public AndComprobar_el_click_izquierdo_pAction1 disableButtons1() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons1));
            Report.reportLog(reflectiveClass, "Condition disableButtons1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons1).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public AndComprobar_el_click_izquierdo_pAction1 clickToOkByXpath() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickToOkByXpath));
            Report.reportLog(reflectiveClass, "Condition clickToOkByXpath isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(clickToOkByXpath).click();
            Report.reportLog(reflectiveClass, "Clicked clickToOkByXpath", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public AndComprobar_el_click_izquierdo_pAction1 assertOkPage1() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle3));
            Report.reportLog(reflectiveClass, "Condition checkTitle3 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle3).getText().contains("OkPage"), "Field checkTitle3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doAndComprobar_el_click_izquierdo_pAction1() throws Exception {
    
    
		goToApp3();
    
		checkPage3();
    
		disableButtons1();
    
		clickToOkByXpath();
    
		assertOkPage1();
    
		
    }
}
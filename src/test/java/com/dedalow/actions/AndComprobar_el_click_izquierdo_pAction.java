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

public class AndComprobar_el_click_izquierdo_pAction{

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
    
      
	private By clickToOk = By.id("clickToOk");
	private static By checkTitle2 = By.xpath("//h2");
	private By disableButtons = By.id("disableButtons");
    
    public AndComprobar_el_click_izquierdo_pAction(Class reflectiveClass) throws Exception {
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

    
      
	public AndComprobar_el_click_izquierdo_pAction disableButtons() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons));
            Report.reportLog(reflectiveClass, "Condition disableButtons isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public AndComprobar_el_click_izquierdo_pAction clickToOk() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickToOk));
            Report.reportLog(reflectiveClass, "Condition clickToOk isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(clickToOk).click();
            Report.reportLog(reflectiveClass, "Clicked clickToOk", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public AndComprobar_el_click_izquierdo_pAction assertOkPage() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle2));
            Report.reportLog(reflectiveClass, "Condition checkTitle2 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle2).getText().contains("OkPage"), "Field checkTitle2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doAndComprobar_el_click_izquierdo_pAction() throws Exception {
    
    
		disableButtons();
    
		clickToOk();
    
		assertOkPage();
    
		
    }
}
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

public class ThenComprobar_todos_los_tipos_de_aAction{

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
    
      
	private static By assertDistinct = By.id("name");
	private static By assertPhoneByName = By.name("phone");
	private static By assertContains = By.id("name");
	private static By assertNotContains = By.id("name");
	private static By assertIsNotEmpty = By.id("name");
	private static By assertNameById = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote = By.xpath("//*[@id='email']");
    
    public ThenComprobar_todos_los_tipos_de_aAction(Class reflectiveClass) throws Exception {
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

    
	public ThenComprobar_todos_los_tipos_de_aAction FrontEndVerdictStepsAction() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct));
            Report.reportLog(reflectiveClass, "Condition assertDistinct isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!"another name".equals(driver.findElement(assertDistinct).getAttribute("ng-reflect-model")), "Field assertDistinct not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("123456".equals(driver.findElement(assertPhoneByName).getAttribute("ng-reflect-model")), "Field assertPhoneByName not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains));
            Report.reportLog(reflectiveClass, "Condition assertContains isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(assertContains).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains));
            Report.reportLog(reflectiveClass, "Condition assertNotContains isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!driver.findElement(assertNotContains).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertIsNotEmpty));
            Report.reportLog(reflectiveClass, "Condition assertIsNotEmpty isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!"".equals(driver.findElement(assertIsNotEmpty).getAttribute("ng-reflect-model")), "Field assertIsNotEmpty not found in assertion");
        	Report.reportLog(reflectiveClass, "The field empty has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById));
            Report.reportLog(reflectiveClass, "Condition assertNameById isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("a name".equals(driver.findElement(assertNameById).getAttribute("ng-reflect-model")), "Field assertNameById not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field FrontEndVerdictStepsAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doThenComprobar_todos_los_tipos_de_aAction() throws Exception {
    
    
		FrontEndVerdictStepsAction();
    
		
    }
}
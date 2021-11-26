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

public class SimpleActionsGlobalAction{

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
    
      
	private By fillInputs1 = By.id("name");
	private By nameById1 = By.id("name");
	private By lastNameByXpathAndDoubleQuote1 = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSingleQuote1 = By.xpath("//input[@id='email']");
	private By phoneByName1 = By.name("phone");
	private By dragImage_Destination1 = By.id("dropArea");
    private By dragImage1 = By.id("imageToDrop");
	private static By checkTitle8 = By.xpath("//h2");
	private static By assertDistinct1 = By.id("name");
	private static By assertPhoneByName1 = By.name("phone");
	private static By assertContains1 = By.id("name");
	private static By assertNotContains1 = By.id("name");
	private static By assertIsNotEmpty1 = By.id("name");
	private static By assertNameById1 = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes1 = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote1 = By.xpath("//*[@id='email']");
	private By disableButtons3 = By.id("disableButtons");
	private By clickToOk1 = By.id("clickToOk");
	private static By checkTitle9 = By.xpath("//h2");
	private By disableButtons4 = By.id("disableButtons");
	private By clickToOkByXpath1 = By.xpath("//*[@id=\"clickToOk\"]");
	private static By checkTitle10 = By.xpath("//h2");
	private By doubleClickToOkByXpath1 = By.xpath("//*[@id=\"doubleClickToOk\"]");
	private By waitForButton1 = By.xpath("//*[@id=\"doubleClickToOk\"]");
	private By disableButtons5 = By.id("disableButtons");
	private static By checkTitle11 = By.xpath("//h2");
	private By enableDrag1 = By.id("initEvents");
    
    public SimpleActionsGlobalAction(Class reflectiveClass) throws Exception {
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

    
      
	public SimpleActionsGlobalAction fillInputs1() throws Exception {
        	driver.findElement(nameById1).clear();
            driver.findElement(nameById1).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById1", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(lastNameByXpathAndDoubleQuote1).clear();
            driver.findElement(lastNameByXpathAndDoubleQuote1).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuote1", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(emailByXpathAndSingleQuote1).clear();
            driver.findElement(emailByXpathAndSingleQuote1).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSingleQuote1", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(phoneByName1).clear();
            driver.findElement(phoneByName1).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName1", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs1));
            Report.reportLog(reflectiveClass, "Condition fillInputs1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(fillInputs1).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction checkInputs() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct1));
            Report.reportLog(reflectiveClass, "Condition assertDistinct1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!"another name".equals(driver.findElement(assertDistinct1).getAttribute("ng-reflect-model")), "Field assertDistinct1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName1));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("123456".equals(driver.findElement(assertPhoneByName1).getAttribute("ng-reflect-model")), "Field assertPhoneByName1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains1));
            Report.reportLog(reflectiveClass, "Condition assertContains1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(assertContains1).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains1));
            Report.reportLog(reflectiveClass, "Condition assertNotContains1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!driver.findElement(assertNotContains1).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertIsNotEmpty1));
            Report.reportLog(reflectiveClass, "Condition assertIsNotEmpty1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(!"".equals(driver.findElement(assertIsNotEmpty1).getAttribute("ng-reflect-model")), "Field assertIsNotEmpty1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field empty has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById1));
            Report.reportLog(reflectiveClass, "Condition assertNameById1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("a name".equals(driver.findElement(assertNameById1).getAttribute("ng-reflect-model")), "Field assertNameById1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes1));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes1).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote1));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote1 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote1).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkInputs has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToApp9 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToApp9 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction checkPage9() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage"), "Field checkPage9 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage9 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public SimpleActionsGlobalAction disableButtons3() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons3));
            Report.reportLog(reflectiveClass, "Condition disableButtons3 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons3).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons3", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction clickToOk1() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickToOk1));
            Report.reportLog(reflectiveClass, "Condition clickToOk1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(clickToOk1).click();
            Report.reportLog(reflectiveClass, "Clicked clickToOk1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage4() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle9));
            Report.reportLog(reflectiveClass, "Condition checkTitle9 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle9).getText().contains("OkPage"), "Field checkTitle9 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage4 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToApp8 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToApp8 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction checkPage10() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage"), "Field checkPage10 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage10 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public SimpleActionsGlobalAction disableButtons4() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons4));
            Report.reportLog(reflectiveClass, "Condition disableButtons4 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons4).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons4", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction clickToOkByXpath1() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickToOkByXpath1));
            Report.reportLog(reflectiveClass, "Condition clickToOkByXpath1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(clickToOkByXpath1).click();
            Report.reportLog(reflectiveClass, "Clicked clickToOkByXpath1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage5() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle10));
            Report.reportLog(reflectiveClass, "Condition checkTitle10 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle10).getText().contains("OkPage"), "Field checkTitle10 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage5 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToApp10 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToApp10 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction checkPage11() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage"), "Field checkPage11 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage11 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction waitForButton1() {
        	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(waitForButton1));
            Report.reportLog(reflectiveClass, "Condition waitForButton1 isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
    }

	
      
	public SimpleActionsGlobalAction disableButtons5() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons5));
            Report.reportLog(reflectiveClass, "Condition disableButtons5 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(disableButtons5).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons5", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction doubleClickToOkByXpath1() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickToOkByXpath1)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickToOkByXpath1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage6() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle11));
            Report.reportLog(reflectiveClass, "Condition checkTitle11 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(driver.findElement(checkTitle11).getText().contains("OkPage"), "Field checkTitle11 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage6 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToApp11 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
        Report.reportLog(reflectiveClass, "goToApp11 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction checkPage8() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage"), "Field checkPage8 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field checkPage8 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public SimpleActionsGlobalAction enableDrag1() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag1));
            Report.reportLog(reflectiveClass, "Condition enableDrag1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(enableDrag1).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public SimpleActionsGlobalAction dragImage1() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage1), driver.findElement(dragImage_Destination1)).release().build().perform();
        Report.reportLog(reflectiveClass, "dragImage1 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction assertOkPage3() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkTitle8));
            Report.reportLog(reflectiveClass, "Condition checkTitle8 isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("OkPage".equals(driver.findElement(checkTitle8).getText()), "Field checkTitle8 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage3 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doSimpleActionsGlobalAction() throws Exception {
    
    
		fillInputs1();
    
		checkInputs();
    
		goToApp9();
    
		checkPage9();
    
		disableButtons3();
    
		clickToOk1();
    
		assertOkPage4();
    
		goToApp8();
    
		checkPage10();
    
		disableButtons4();
    
		clickToOkByXpath1();
    
		assertOkPage5();
    
		goToApp10();
    
		checkPage11();
    
		disableButtons5();
    
		waitForButton1();
      
		doubleClickToOkByXpath1();
    
		assertOkPage6();
    
		goToApp11();
    
		checkPage8();
    
		enableDrag1();
    
		dragImage1();
    
		assertOkPage3();
    
		
    }
}
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

public class WhenEscribir_en_el_formularioAction{

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
    
      
	private By fillInputs = By.id("name");
	private By nameById = By.id("name");
	private By lastNameByXpathAndDoubleQuote = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSingleQuote = By.xpath("//input[@id='email']");
	private By phoneByName = By.name("phone");
    
    public WhenEscribir_en_el_formularioAction(Class reflectiveClass) throws Exception {
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

    
      
	public WhenEscribir_en_el_formularioAction fillInputs() throws Exception {
        	driver.findElement(nameById).clear();
            driver.findElement(nameById).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(lastNameByXpathAndDoubleQuote).clear();
            driver.findElement(lastNameByXpathAndDoubleQuote).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuote", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(emailByXpathAndSingleQuote).clear();
            driver.findElement(emailByXpathAndSingleQuote).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSingleQuote", "INFO", 0, Status.PASS, true, "", "", null);	driver.findElement(phoneByName).clear();
            driver.findElement(phoneByName).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs));
            Report.reportLog(reflectiveClass, "Condition fillInputs isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(fillInputs).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doWhenEscribir_en_el_formularioAction() throws Exception {
    
    
		fillInputs();
    
		
    }
}
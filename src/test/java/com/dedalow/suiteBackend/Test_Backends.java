package com.dedalow.suiteBackend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Throwables;
import com.dedalow.utils.Utils;
import com.dedalow.utils.DriverInit;
import com.dedalow.utils.Constant;
import com.dedalow.report.ExtentHtml;
import com.dedalow.report.Report;
import com.dedalow.Launcher;

import com.aventstack.extentreports.Status;


import com.dedalow.actions.GivenRealizaBackendsAction;
import com.dedalow.actions.AndBackendAction2Action;
import com.dedalow.actions.WhenBackendAction1Action;

public class Test_Backends {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "SuiteBackend";
    public static String caseName = Test_Backends.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult;
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static SuiteBackendBeforeEach suiteBackendBeforeEach;
	private static GivenRealizaBackendsAction givenRealizaBackendsAction;
	private static AndBackendAction2Action andBackendAction2Action;
	private static WhenBackendAction1Action whenBackendAction1Action;
    
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	suiteBackendBeforeEach.doBeforeEach();
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			finalResult = "BQ";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
		}
    }

    public void before() throws Exception {
        try {
            
            
            Report.reportLog(reflectiveClass, "Before of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			givenRealizaBackendsAction.doGivenRealizaBackendsAction();
            Report.reportLog(reflectiveClass, "Action GivenRealizaBackendsAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_Backends")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenBackendAction1Action.doWhenBackendAction1Action();
            Report.reportLog(reflectiveClass, "Action WhenBackendAction1Action finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andBackendAction2Action.doAndBackendAction2Action();
            Report.reportLog(reflectiveClass, "Action AndBackendAction2Action finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
            if (finalResult != "BQ") {
				finalResult = "KO";
			}
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
        }
    }

    public void after() {
        constant.isAfter = true;
        constant.isBackend = false;
        try {
            
            
            Report.reportLog(reflectiveClass, "After of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenBackendAction1Action.doWhenBackendAction1Action();
            Report.reportLog(reflectiveClass, "Action WhenBackendAction1Action finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			constant.captureLog = "KO";
			constant.afterResult = "not succesfully";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.WARNING, true, "isCatch", "", Throwables.getStackTraceAsString(e));
        }
    }

    @AfterEach
    public void afterEach()  {
        boolean screenShot = false;
        after();
        
        if (finalResult == "OK") {
            Report.reportLog(reflectiveClass, "Result on Test_Backends: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_Backends: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_Backends: " + finalResult);
		constant.logger.info("After execution finished: " + constant.afterResult);
        Utils.tearDown(reflectiveClass);
		Utils.finalReports(reflectiveClass, screenShot);
		constant.initialize.flush();
    }
    
    
	public static void setUp() throws Exception{
        try{
            finalResult = "OK";
            constant.defaultValues();
            constant.folderTestSuite = new File(constant.folderLogs + constant.fileSystem.getSeparator() + suiteName);
            constant.folderTestSuite.mkdirs();
            folderTestCase = new File(constant.folderTestSuite + constant.fileSystem.getSeparator() + caseName);
            folderTestCase.mkdirs();
            folderDownloads = new File(folderTestCase + constant.fileSystem.getSeparator() + "files");
            folderDownloads.mkdirs();
            prop = Utils.getConfigProperties();
            level = prop.getProperty("LOG_LEVEL");
        } catch (Exception e) {
            e.printStackTrace();
            Report.reportErrors(e.getMessage());
            throw new Exception(e);
        }
    }

    public static WebDriver setUpEnvironment(File folderDownloads, Properties prop,
        String nameDriver, Map<String, WebDriver> contextsDriver) throws Exception {
        
        reflectiveClass = Utils.getReflective(Test_Backends.class.getCanonicalName());
			suiteBackendBeforeEach = new SuiteBackendBeforeEach(reflectiveClass);
		givenRealizaBackendsAction = new GivenRealizaBackendsAction(reflectiveClass);
		andBackendAction2Action = new AndBackendAction2Action(reflectiveClass);
		whenBackendAction1Action = new WhenBackendAction1Action(reflectiveClass);
        return driver;
    }
}
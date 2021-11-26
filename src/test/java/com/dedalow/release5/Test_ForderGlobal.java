package com.dedalow.release5;

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


import com.dedalow.actions.GivenIr_a_la_aplicacion_supertestuiAction;
import com.dedalow.actions.WhenSe_ejecutan_las_pruebas_simplesAction;

public class Test_ForderGlobal {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "Release5";
    public static String caseName = Test_ForderGlobal.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult;
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static Release5Background_Release5 release5Background_Release5;
	private static GivenIr_a_la_aplicacion_supertestuiAction givenIr_a_la_aplicacion_supertestuiAction;
	private static WhenSe_ejecutan_las_pruebas_simplesAction whenSe_ejecutan_las_pruebas_simplesAction;
    
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	release5Background_Release5.doBackground_Release5();
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
            
			
			givenIr_a_la_aplicacion_supertestuiAction.doGivenIr_a_la_aplicacion_supertestuiAction();
            Report.reportLog(reflectiveClass, "Action GivenIr_a_la_aplicacion_supertestuiAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_ForderGlobal")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenSe_ejecutan_las_pruebas_simplesAction.doWhenSe_ejecutan_las_pruebas_simplesAction();
            Report.reportLog(reflectiveClass, "Action WhenSe_ejecutan_las_pruebas_simplesAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
            if (finalResult != "BQ") {
				finalResult = "KO";
			}
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
        }
    }

    

    @AfterEach
    public void afterEach()  {
        boolean screenShot = true;
        
        
        if (finalResult == "OK") {
            Report.reportLog(reflectiveClass, "Result on Test_ForderGlobal: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_ForderGlobal: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_ForderGlobal: " + finalResult);
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
        driver = driverInit.driverSelector(folderDownloads, prop, nameDriver, contextsDriver);
            handler = driver.getWindowHandle();
        reflectiveClass = Utils.getReflective(Test_ForderGlobal.class.getCanonicalName());
			release5Background_Release5 = new Release5Background_Release5(reflectiveClass);
		givenIr_a_la_aplicacion_supertestuiAction = new GivenIr_a_la_aplicacion_supertestuiAction(reflectiveClass);
		whenSe_ejecutan_las_pruebas_simplesAction = new WhenSe_ejecutan_las_pruebas_simplesAction(reflectiveClass);
        return driver;
    }
}
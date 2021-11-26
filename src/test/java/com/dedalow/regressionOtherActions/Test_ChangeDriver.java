package com.dedalow.regressionOtherActions;

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


import com.dedalow.actions.GivenAbrir_un_nuevo_navegador_a_la_Action;
import com.dedalow.actions.AndComprobar_que_estamos_en_la_pa_WIKIPEDIAAction;
import com.dedalow.actions.AndComprobar_que_estamos_en_la_pa_GmailAction;
import com.dedalow.actions.ThenVolver_a_la_pagina_CADAction;
import com.dedalow.actions.WhenAbrir_un_nuevo_navegador_a_la_Action;
import com.dedalow.actions.AndComprobar_que_estamos_en_la_pa_CADAction;
import com.dedalow.actions.AndComprobar_que_podemos_realizarAction;
import com.dedalow.actions.WhenVolver_a_la_pestaa_de_GmailAction;
import com.dedalow.actions.AndAbrir_la_pestaa_para_realizarAction;

public class Test_ChangeDriver {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionOtherActions";
    public static String caseName = Test_ChangeDriver.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult;
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
	private static GivenAbrir_un_nuevo_navegador_a_la_Action givenAbrir_un_nuevo_navegador_a_la_Action;
	private static AndComprobar_que_estamos_en_la_pa_WIKIPEDIAAction andComprobar_que_estamos_en_la_pa_WIKIPEDIAAction;
	private static AndComprobar_que_estamos_en_la_pa_GmailAction andComprobar_que_estamos_en_la_pa_GmailAction;
	private static ThenVolver_a_la_pagina_CADAction thenVolver_a_la_pagina_CADAction;
	private static WhenAbrir_un_nuevo_navegador_a_la_Action whenAbrir_un_nuevo_navegador_a_la_Action;
	private static AndComprobar_que_estamos_en_la_pa_CADAction andComprobar_que_estamos_en_la_pa_CADAction;
	private static AndComprobar_que_podemos_realizarAction andComprobar_que_podemos_realizarAction;
	private static WhenVolver_a_la_pestaa_de_GmailAction whenVolver_a_la_pestaa_de_GmailAction;
	private static AndAbrir_la_pestaa_para_realizarAction andAbrir_la_pestaa_para_realizarAction;
    
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
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
            
			
			givenAbrir_un_nuevo_navegador_a_la_Action.doGivenAbrir_un_nuevo_navegador_a_la_Action();
            Report.reportLog(reflectiveClass, "Action GivenAbrir_un_nuevo_navegador_a_la_Action finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andComprobar_que_estamos_en_la_pa_WIKIPEDIAAction.doAndComprobar_que_estamos_en_la_pa_WIKIPEDIAAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_que_estamos_en_la_pa_WIKIPEDIAAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_ChangeDriver")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenAbrir_un_nuevo_navegador_a_la_Action.doWhenAbrir_un_nuevo_navegador_a_la_Action();
            Report.reportLog(reflectiveClass, "Action WhenAbrir_un_nuevo_navegador_a_la_Action finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAbrir_la_pestaa_para_realizarAction.doAndAbrir_la_pestaa_para_realizarAction();
            Report.reportLog(reflectiveClass, "Action AndAbrir_la_pestaa_para_realizarAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andComprobar_que_podemos_realizarAction.doAndComprobar_que_podemos_realizarAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_que_podemos_realizarAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			whenVolver_a_la_pestaa_de_GmailAction.doWhenVolver_a_la_pestaa_de_GmailAction();
            Report.reportLog(reflectiveClass, "Action WhenVolver_a_la_pestaa_de_GmailAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andComprobar_que_estamos_en_la_pa_GmailAction.doAndComprobar_que_estamos_en_la_pa_GmailAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_que_estamos_en_la_pa_GmailAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			thenVolver_a_la_pagina_CADAction.doThenVolver_a_la_pagina_CADAction();
            Report.reportLog(reflectiveClass, "Action ThenVolver_a_la_pagina_CADAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andComprobar_que_estamos_en_la_pa_CADAction.doAndComprobar_que_estamos_en_la_pa_CADAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_que_estamos_en_la_pa_CADAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
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
            Report.reportLog(reflectiveClass, "Result on Test_ChangeDriver: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_ChangeDriver: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_ChangeDriver: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_ChangeDriver.class.getCanonicalName());
		givenAbrir_un_nuevo_navegador_a_la_Action = new GivenAbrir_un_nuevo_navegador_a_la_Action(reflectiveClass);
		andComprobar_que_estamos_en_la_pa_WIKIPEDIAAction = new AndComprobar_que_estamos_en_la_pa_WIKIPEDIAAction(reflectiveClass);
		andComprobar_que_estamos_en_la_pa_GmailAction = new AndComprobar_que_estamos_en_la_pa_GmailAction(reflectiveClass);
		thenVolver_a_la_pagina_CADAction = new ThenVolver_a_la_pagina_CADAction(reflectiveClass);
		whenAbrir_un_nuevo_navegador_a_la_Action = new WhenAbrir_un_nuevo_navegador_a_la_Action(reflectiveClass);
		andComprobar_que_estamos_en_la_pa_CADAction = new AndComprobar_que_estamos_en_la_pa_CADAction(reflectiveClass);
		andComprobar_que_podemos_realizarAction = new AndComprobar_que_podemos_realizarAction(reflectiveClass);
		whenVolver_a_la_pestaa_de_GmailAction = new WhenVolver_a_la_pestaa_de_GmailAction(reflectiveClass);
		andAbrir_la_pestaa_para_realizarAction = new AndAbrir_la_pestaa_para_realizarAction(reflectiveClass);
        return driver;
    }
}
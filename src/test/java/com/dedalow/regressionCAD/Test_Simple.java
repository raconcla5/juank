package com.dedalow.regressionCAD;

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


import com.dedalow.actions.AndComprobar_que_estamos_en_la_pAction;
import com.dedalow.actions.GivenIr_a_la_pgina_del_formularioAction;
import com.dedalow.actions.AndIr_a_la_pgina_de_drag_and_droAction;
import com.dedalow.actions.WhenEscribir_en_el_formularioAction;
import com.dedalow.actions.ThenComprobar_todos_los_tipos_de_aAction;
import com.dedalow.actions.WhenIr_a_la_pgina_de_botonesAction;
import com.dedalow.actions.AndComprobar_el_click_izquierdo_pAction;
import com.dedalow.actions.AndComprobar_el_click_izquierdo_pAction1;
import com.dedalow.actions.AndComprobar_el_doble_clickAction;
import com.dedalow.actions.AndArrastrar_una_imagenAction;
import com.dedalow.actions.ThenComprobar_que_se_ha_hecho_corrAction;

public class Test_Simple {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionCAD";
    public static String caseName = Test_Simple.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult;
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static RegressionCADBackground_RegressionCAD regressionCADBackground_RegressionCAD;
	private static AndComprobar_que_estamos_en_la_pAction andComprobar_que_estamos_en_la_pAction;
	private static GivenIr_a_la_pgina_del_formularioAction givenIr_a_la_pgina_del_formularioAction;
	private static AndIr_a_la_pgina_de_drag_and_droAction andIr_a_la_pgina_de_drag_and_droAction;
	private static WhenEscribir_en_el_formularioAction whenEscribir_en_el_formularioAction;
	private static ThenComprobar_todos_los_tipos_de_aAction thenComprobar_todos_los_tipos_de_aAction;
	private static WhenIr_a_la_pgina_de_botonesAction whenIr_a_la_pgina_de_botonesAction;
	private static AndComprobar_el_click_izquierdo_pAction andComprobar_el_click_izquierdo_pAction;
	private static AndComprobar_el_click_izquierdo_pAction1 andComprobar_el_click_izquierdo_pAction1;
	private static AndComprobar_el_doble_clickAction andComprobar_el_doble_clickAction;
	private static AndArrastrar_una_imagenAction andArrastrar_una_imagenAction;
	private static ThenComprobar_que_se_ha_hecho_corrAction thenComprobar_que_se_ha_hecho_corrAction;
    
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	regressionCADBackground_RegressionCAD.doBackground_RegressionCAD();
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
            
			
			givenIr_a_la_pgina_del_formularioAction.doGivenIr_a_la_pgina_del_formularioAction();
            Report.reportLog(reflectiveClass, "Action GivenIr_a_la_pgina_del_formularioAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andComprobar_que_estamos_en_la_pAction.doAndComprobar_que_estamos_en_la_pAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_que_estamos_en_la_pAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_Simple")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenEscribir_en_el_formularioAction.doWhenEscribir_en_el_formularioAction();
            Report.reportLog(reflectiveClass, "Action WhenEscribir_en_el_formularioAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			thenComprobar_todos_los_tipos_de_aAction.doThenComprobar_todos_los_tipos_de_aAction();
            Report.reportLog(reflectiveClass, "Action ThenComprobar_todos_los_tipos_de_aAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			whenIr_a_la_pgina_de_botonesAction.doWhenIr_a_la_pgina_de_botonesAction();
            Report.reportLog(reflectiveClass, "Action WhenIr_a_la_pgina_de_botonesAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andComprobar_el_click_izquierdo_pAction.doAndComprobar_el_click_izquierdo_pAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_el_click_izquierdo_pAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andComprobar_el_click_izquierdo_pAction1.doAndComprobar_el_click_izquierdo_pAction1();
            Report.reportLog(reflectiveClass, "Action AndComprobar_el_click_izquierdo_pAction1 finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andComprobar_el_doble_clickAction.doAndComprobar_el_doble_clickAction();
            Report.reportLog(reflectiveClass, "Action AndComprobar_el_doble_clickAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andIr_a_la_pgina_de_drag_and_droAction.doAndIr_a_la_pgina_de_drag_and_droAction();
            Report.reportLog(reflectiveClass, "Action AndIr_a_la_pgina_de_drag_and_droAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			andArrastrar_una_imagenAction.doAndArrastrar_una_imagenAction();
            Report.reportLog(reflectiveClass, "Action AndArrastrar_una_imagenAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			thenComprobar_que_se_ha_hecho_corrAction.doThenComprobar_que_se_ha_hecho_corrAction();
            Report.reportLog(reflectiveClass, "Action ThenComprobar_que_se_ha_hecho_corrAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
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
            Report.reportLog(reflectiveClass, "Result on Test_Simple: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_Simple: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_Simple: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_Simple.class.getCanonicalName());
			regressionCADBackground_RegressionCAD = new RegressionCADBackground_RegressionCAD(reflectiveClass);
		andComprobar_que_estamos_en_la_pAction = new AndComprobar_que_estamos_en_la_pAction(reflectiveClass);
		givenIr_a_la_pgina_del_formularioAction = new GivenIr_a_la_pgina_del_formularioAction(reflectiveClass);
		andIr_a_la_pgina_de_drag_and_droAction = new AndIr_a_la_pgina_de_drag_and_droAction(reflectiveClass);
		whenEscribir_en_el_formularioAction = new WhenEscribir_en_el_formularioAction(reflectiveClass);
		thenComprobar_todos_los_tipos_de_aAction = new ThenComprobar_todos_los_tipos_de_aAction(reflectiveClass);
		whenIr_a_la_pgina_de_botonesAction = new WhenIr_a_la_pgina_de_botonesAction(reflectiveClass);
		andComprobar_el_click_izquierdo_pAction = new AndComprobar_el_click_izquierdo_pAction(reflectiveClass);
		andComprobar_el_click_izquierdo_pAction1 = new AndComprobar_el_click_izquierdo_pAction1(reflectiveClass);
		andComprobar_el_doble_clickAction = new AndComprobar_el_doble_clickAction(reflectiveClass);
		andArrastrar_una_imagenAction = new AndArrastrar_una_imagenAction(reflectiveClass);
		thenComprobar_que_se_ha_hecho_corrAction = new ThenComprobar_que_se_ha_hecho_corrAction(reflectiveClass);
        return driver;
    }
}
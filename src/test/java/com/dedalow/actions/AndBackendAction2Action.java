package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.request.postError;
import com.dedalow.request.put;
import com.dedalow.request.patch;
import com.dedalow.request.get;
import com.dedalow.request.postUriContext;
import com.dedalow.request.post;
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

public class AndBackendAction2Action{

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
    
	private static postError postError;
	private static put put;
	private static patch patch;
	private static get get;
	private static postUriContext postUriContext;
	private static post post;
      
    
    public AndBackendAction2Action(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		postError = new postError();
		put = new put();
		patch = new patch();
		get = new get();
		postUriContext = new postUriContext();
		post = new post();
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

    public AndBackendAction2Action postPOST2() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = post.postPOST2();
    		Report.reportLog(reflectiveClass, "The field post2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postPOST2 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + post.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postPOST2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public AndBackendAction2Action VerdictPost2() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.getHeader("Content-Type").contains("utf-8"),
            "Error assertion BackendAssertion12 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion12 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion12 check the Header <br><strong>return</strong> Content-Type: "  + constant.apiResponse.getHeader("Content-Type")
            + ",</br> <strong> expected </strong> contains utf-8", "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").contains("leader"),
            "Error assertion BackendAssertion13 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion13 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion13 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> contains leader", "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPost2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPost2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPost2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPost2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public AndBackendAction2Action getGET2() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = get.getGET2();
    		Report.reportLog(reflectiveClass, "The field get2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke getGET2 <strong> GET </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "getGET2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public AndBackendAction2Action VerdictGet2() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("support").contains("[text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]"),
            "Error assertion BackendAssertion14 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion14 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion14 check the Body <br><strong>return</strong> support: "  + constant.apiResponse.jsonPath().getString("support")
            + ",</br> <strong> expected </strong> contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictGet2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictGet2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictGet2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictGet2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public AndBackendAction2Action patchPATCH2() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = patch.patchPATCH2();
    		Report.reportLog(reflectiveClass, "The field patch2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke patchPATCH2 <strong> PATCH </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + patch.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "patchPATCH2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public AndBackendAction2Action VerdictPatch2() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("updatedAt").contains("2021"),
            "Error assertion BackendAssertion11 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2021");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion11 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2021", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion11 check the Body <br><strong>return</strong> updatedAt: "  + constant.apiResponse.jsonPath().getString("updatedAt")
            + ",</br> <strong> expected </strong> contains 2021", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPatch2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPatch2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPatch2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPatch2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public AndBackendAction2Action putPUT2() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = put.putPUT2();
    		Report.reportLog(reflectiveClass, "The field put2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke putPUT2 <strong> PUT </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + put.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "putPUT2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public AndBackendAction2Action VerdictPut2() throws Exception {
        constant.isBackend = true;
        
            assertTrue(!constant.apiResponse.jsonPath().getString("job").contains("jesus"),
            "Error assertion BackendAssertion10 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion10 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion10 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> notContains jesus", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPut2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPut2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPut2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPut2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public AndBackendAction2Action postErrorPOST2() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postError.postErrorPOST2();
    		Report.reportLog(reflectiveClass, "The field postError2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postErrorPOST2 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postError.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postErrorPOST2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public AndBackendAction2Action VerdictPostError2() throws Exception {
        constant.isBackend = true;
        
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPostError2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPostError2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPostError2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPostError2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public AndBackendAction2Action postUriContextPOST() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postUriContext.postUriContextPOST();
    		Report.reportLog(reflectiveClass, "The field postUriContext completed", "INFO", 0, Status.PASS, false, "BackendInvoke postUriContextPOST <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + Utils.prop.getProperty("BACKEND_ENDPOINT") + "/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postUriContext.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postUriContextPOST action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    
    public void doAndBackendAction2Action() throws Exception {
    
    
		postPOST2();
    
		VerdictPost2();
    
		getGET2();
    
		VerdictGet2();
    
		patchPATCH2();
    
		VerdictPatch2();
    
		putPUT2();
    
		VerdictPut2();
    
		postErrorPOST2();
    
		VerdictPostError2();
    
		postUriContextPOST();
    
		
    }
}
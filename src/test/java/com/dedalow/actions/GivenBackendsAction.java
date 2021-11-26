package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.request.post;
import com.dedalow.request.postError;
import com.dedalow.request.patch;
import com.dedalow.request.get;
import com.dedalow.request.put;
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

public class GivenBackendsAction{

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
    
	private static post post;
	private static postError postError;
	private static patch patch;
	private static get get;
	private static put put;
      
    
    public GivenBackendsAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		post = new post();
		postError = new postError();
		patch = new patch();
		get = new get();
		put = new put();
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

    public GivenBackendsAction postPOST3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = post.postPOST3();
    		Report.reportLog(reflectiveClass, "The field post3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postPOST3 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + post.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postPOST3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GivenBackendsAction VerdictPost3() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.getHeader("Content-Type").contains("utf-8"),
            "Error assertion BackendAssertion16 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion16 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion16 check the Header <br><strong>return</strong> Content-Type: "  + constant.apiResponse.getHeader("Content-Type")
            + ",</br> <strong> expected </strong> contains utf-8", "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").contains("leader"),
            "Error assertion BackendAssertion17 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion17 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion17 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> contains leader", "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPost3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPost3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPost3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPost3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public GivenBackendsAction getGET3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = get.getGET3();
    		Report.reportLog(reflectiveClass, "The field get3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke getGET3 <strong> GET </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "getGET3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GivenBackendsAction VerdictGet3() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("support").contains("[text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]"),
            "Error assertion BackendAssertion18 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion18 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion18 check the Body <br><strong>return</strong> support: "  + constant.apiResponse.jsonPath().getString("support")
            + ",</br> <strong> expected </strong> contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictGet3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictGet3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictGet3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictGet3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public GivenBackendsAction patchPATCH3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = patch.patchPATCH3();
    		Report.reportLog(reflectiveClass, "The field patch3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke patchPATCH3 <strong> PATCH </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + patch.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "patchPATCH3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GivenBackendsAction VerdictPatch3() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("updatedAt").contains("2021"),
            "Error assertion BackendAssertion15 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2021");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion15 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2021", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion15 check the Body <br><strong>return</strong> updatedAt: "  + constant.apiResponse.jsonPath().getString("updatedAt")
            + ",</br> <strong> expected </strong> contains 2021", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPatch3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPatch3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPatch3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPatch3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public GivenBackendsAction putPUT3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = put.putPUT3();
    		Report.reportLog(reflectiveClass, "The field put3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke putPUT3 <strong> PUT </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + put.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "putPUT3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GivenBackendsAction VerdictPut3() throws Exception {
        constant.isBackend = true;
        
            assertTrue(!constant.apiResponse.jsonPath().getString("job").contains("jesus"),
            "Error assertion BackendAssertion19 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion19 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion19 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> notContains jesus", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPut3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPut3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPut3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPut3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public GivenBackendsAction postErrorPOST3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postError.postErrorPOST3();
    		Report.reportLog(reflectiveClass, "The field postError3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postErrorPOST3 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postError.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postErrorPOST3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GivenBackendsAction VerdictPostError3() throws Exception {
        constant.isBackend = true;
        
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPostError3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPostError3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPostError3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPostError3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    
    public void doGivenBackendsAction() throws Exception {
    
    
		postPOST3();
    
		VerdictPost3();
    
		getGET3();
    
		VerdictGet3();
    
		patchPATCH3();
    
		VerdictPatch3();
    
		putPUT3();
    
		VerdictPut3();
    
		postErrorPOST3();
    
		VerdictPostError3();
    
		
    }
}
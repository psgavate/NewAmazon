package Tests;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Actions.BaseTemplate;
import Actions.LoginAction;

public class LoginTest01 extends BaseTemplate {
	@Test
	/*public void test(){
		ReadProperties readProp = new ReadProperties();
		StartUpInitilize initilize = new StartUpInitilize();
		System.out.println("---------------My Test-----------"+readProp.getProperties("userName")+ initilize.getDriver().getCurrentUrl());
		
		System.out.println(ReadJson.getJsonValue("$.AdminCredentials.username"));}*/
		
	public void AmazonLogin(){
		logger.log(LogStatus.PASS, "User login in to the system");
		LoginAction action1=new LoginAction();
		action1.login();
		logger.log(LogStatus.PASS, "User successfully logged in to the system");
	}
	
	/*public void AmazonLogin2(){
		logger.log(LogStatus.PASS, "User login in to the system");
		LoginScriptAmz action2=new LoginScriptAmz();
		action2.logout();
		logger.log(LogStatus.PASS, "User successfully logged in to the system");
	}*/
	

}

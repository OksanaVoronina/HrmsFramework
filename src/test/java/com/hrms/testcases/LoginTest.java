package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginTest extends CommonMethods {


	
	@Test(groups="smoke")
	public static void login() {
		login.login(ConfigsReader.getPropery("username"),ConfigsReader.getPropery("password"));
		//LoginPageElement login = new LoginPageElement();
//		sendText(login.username, ConfigsReader.getPropery("username"));
//		sendText(login.password, ConfigsReader.getPropery("password"));
//		click(login.loginBtn);

		//DashboardPageElement dashboard= new DashboardPageElement();
		// String expectedUser="Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		// Assert.assertEquals(expectedUser, actualUser,"Admin is NOT logged in");
		// or this one without using expected
		AssertJUnit.assertTrue(actualUser.contains(ConfigsReader.getPropery("username")));
	}

	@Test
	public static void invalidPasswordLogin() {
		//LoginPageElement login = new LoginPageElement();
		sendText(login.username, ConfigsReader.getPropery("username"));
		sendText(login.password, "passwo");
		click(login.loginBtn);
		String expected="Invalid credentials";
		AssertJUnit.assertEquals(login.errorMsg.getText(), expected,"Error message text is not matched");
	}
	@Test
	public static void emptyUserName() {
		//LoginPageElement login = new LoginPageElement();
		sendText(login.password, ConfigsReader.getPropery("password"));
		click(login.loginBtn);
		String expected="Username cannot be empty";
		AssertJUnit.assertEquals(login.errorMsg.getText(), expected,"Error message text is not matched");
	}
	@Test
	public static void invalid() {
	//LoginPageElement login = new LoginPageElement();
	sendText(login.username, ConfigsReader.getPropery("username"));
	sendText(login.password, "passwo");
	click(login.loginBtn);
	String expected="Invalid credentials";
	AssertJUnit.assertEquals(login.errorMsg.getText(), expected,"Error message text is not match");
}
}

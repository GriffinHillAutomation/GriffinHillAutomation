package com.griffinhill.tests.testcases;

import com.griffinhill.entities.LoginInfo;
import com.griffinhill.tests.TestsInit;
import org.testng.annotations.Test;

import static com.griffinhill.site.pages.LoginPage.login;
import static testdata.LoginDetails.loginCredentials;

@Listeners({AllureListener.class})
public class LoginTest extends  TestsInit{

    LoginInfo user = loginCredentials();

    @Test
    @Description("Validate Login functionality")
    public void Login_TC_001() {
        login(user);
    }
}

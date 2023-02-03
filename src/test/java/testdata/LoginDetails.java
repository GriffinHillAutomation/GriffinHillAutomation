package testdata;

import com.griffinhill.entities.LoginInfo;

public class LoginDetails {

    public static LoginInfo loginCredentials() {
        LoginInfo loginCredentials = new LoginInfo();
        loginCredentials.setEmail("josem@griffinhill.com");
        loginCredentials.setPassword("Password123@");
        return loginCredentials;
    }
}

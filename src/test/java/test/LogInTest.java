package test;

import model.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;
import service.UserDataCreator;

public class LogInTest extends CommonConditions {
    @Test
    public void logIn(){
        UserData userData = UserDataCreator.withCredentialsFromProperty();
        boolean isAuthorized = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .clickLogInButton()
                .inputPassword(userData)
                .inputEmail(userData)
                .clickAuthorizedButton()
                .isPersonalCabinetButtonEnable();
        Assert.assertEquals(isAuthorized,true);
    }
}

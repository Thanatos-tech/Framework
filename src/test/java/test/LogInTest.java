package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;

public class LogInTest extends CommonConditions {
    @Test
    public void logIn(){
        boolean isAuthorized = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .clickLogInButton()
                .inputPassword("qwertyuiop")
                .inputEmail("some.mail@gmail.com")
                .clickAuthorizedButton()
                .isPersonalCabinetButtonEnable();
        Assert.assertEquals(isAuthorized,true);
    }
}

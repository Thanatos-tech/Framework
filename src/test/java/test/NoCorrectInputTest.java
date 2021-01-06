package test;

import model.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;
import service.UserDataCreator;

public class NoCorrectInputTest extends CommonConditions {
    @Test
    public void noCorrectInput()
    {
        UserData userData = UserDataCreator.withCredentialsFromProperty();
        boolean noInput = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .inputValueInSearchLine(userData)
                .noCorrectRequestResult();
        Assert.assertEquals(noInput,true);
    }
}

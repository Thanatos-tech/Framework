package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;

public class NoCorrectInputTest extends CommonConditions {
    @Test
    public void noCorrectInput()
    {
        boolean noInput = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .inputValueInSearchLine("впаа")
                .noCorrectRequestResult();
        Assert.assertEquals(noInput,true);
    }
}

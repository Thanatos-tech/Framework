package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;

public class ChangeRegionTest extends CommonConditions {
    @Test
    public void changeRegion()
    {
        String currentLanguage = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .clickLanguageDropdown()
                .selectNewRegion()
                .clickChangeRegion()
                .closeFrenchCoockiesPolitics()
                .getCurrentRegion();
        Assert.assertEquals(currentLanguage, "Français");
    }
}

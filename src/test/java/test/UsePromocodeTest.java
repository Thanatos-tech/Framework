package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class UsePromocodeTest extends CommonConditions {
    @Test
    public void usePromocode()
    {
        boolean promocodeIsUsed = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .clickOrderButton()
                .continueAsAGuest()
                .clickPromocodeButton()
                .inputPromocode("TH-WE-10-7N99HB")
                .activatePromocode()
                .isRemovePromocodeButtonActive();
        Assert.assertEquals(promocodeIsUsed,true);
    }
}

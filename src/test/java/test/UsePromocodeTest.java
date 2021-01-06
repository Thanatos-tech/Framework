package test;

import model.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;
import service.UserDataCreator;

public class UsePromocodeTest extends CommonConditions {
    @Test
    public void usePromocode()
    {
        UserData userData = UserDataCreator.withCredentialsFromProperty();
        boolean promocodeIsUsed = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .clickOrderButton()
                .continueAsAGuest()
                .clickPromocodeButton()
                .inputPromocode(userData)
                .activatePromocode()
                .isRemovePromocodeButtonActive();
        Assert.assertEquals(promocodeIsUsed,true);
    }
}

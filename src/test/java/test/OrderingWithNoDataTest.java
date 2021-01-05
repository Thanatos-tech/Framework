package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class OrderingWithNoDataTest extends CommonConditions {
    @Test
    public void orderingWithNoData()
    {
        boolean orderIsNotConfirmed = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .clickOrderButton()
                .continueAsAGuest()
                .goToPayment()
                .errorMessageDisplayed();
        Assert.assertEquals(orderIsNotConfirmed, true);
    }
}

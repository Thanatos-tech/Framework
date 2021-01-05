package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class RemoveItemFromCardTest extends CommonConditions {

    @Test
    public void removeItemFromCard()
    {
        String emptyCardMessage = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .openMiniCard()
                .openCardPage()
                .closeCoockiesPolitics()
                .removeItem()
                .getEmptyCardMessage();
        Assert.assertEquals(emptyCardMessage, "ВАША КОРЗИНА ПОКА ПУСТА");
    }
}

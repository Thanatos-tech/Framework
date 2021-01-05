package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class AddSomethingItemsToCardTest extends CommonConditions {
    @Test
    public void addSomethingItemsToCard()
    {
        String itemsCount = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .addToCard()
                .getItemsCount();
        Assert.assertEquals(itemsCount, "2");
    }
}

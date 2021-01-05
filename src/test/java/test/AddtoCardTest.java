package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class AddtoCardTest extends CommonConditions {
    @Test
    public void addToCard()
    {
        String itemsCount = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .selectSize()
                .addToCard()
                .getItemsCount();
        Assert.assertEquals(itemsCount, "1");
    }
}

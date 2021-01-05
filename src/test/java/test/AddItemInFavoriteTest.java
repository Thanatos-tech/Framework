package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerConcreteItemPage;

public class AddItemInFavoriteTest extends CommonConditions {
    @Test
    public void addItemInFavorite()
    {
        int favoriteResult = new TommyHilfigerConcreteItemPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .addItemInFavorite()
                .openFavoritePage()
                .getFavoriteResults();
        Assert.assertEquals(favoriteResult, 1);
    }
}

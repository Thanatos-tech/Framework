package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.TommyHilfigerNewClothesPage;

public class SortItemsByPriceTest extends CommonConditions {
    @Test
    public void sortItemsByPrice()
    {
        boolean isItemsSortedByPriceByDescending = new TommyHilfigerNewClothesPage(driver)
                .openPage()
                .closeCoockiesPolitics()
                .sortElementsBy()
                .sortByPrice()
                .elementsSorted();
        Assert.assertEquals(isItemsSortedByPriceByDescending, true);
    }
}

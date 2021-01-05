package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerFavoritePage extends AbstractPage {
    public TommyHilfigerFavoritePage(WebDriver driver)
    {
        super(driver);
    }

    public int getFavoriteResults() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wishlist-item']")));
        return driver.findElements(By.xpath("//div[@class='wishlist-item']")).size();
    }
}

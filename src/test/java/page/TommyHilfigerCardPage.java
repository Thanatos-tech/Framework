package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TommyHilfigerCardPage extends AbstractPage
{
    @FindBy(xpath = "//div[@class='product-details__cta-wrap ']//span[text()='Удалить']")
    private WebElement removeItemButtonLocator;

    @FindBy(xpath = "//p[@class='ShoppingBagContainer__empty-cta--only-empty-message']")
    private WebElement cardIsEmptyMessageLocator;

    @FindBy(xpath = "//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")
    private WebElement closeCookiesPoliticsButtonLocator;

    public TommyHilfigerCardPage(WebDriver driver)
    {
        super(driver);
    }

    public TommyHilfigerCardPage openPage()
    {
        driver.get("https://ru.tommy.com/shopping-bag");
        return this;
    }

    public TommyHilfigerCardPage removeItem()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-details__cta-wrap ']//span[text()='Удалить']")));
        removeItemButtonLocator.click();
        return this;
    }

    public String getEmptyCardMessage()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='ShoppingBagContainer__empty-cta--only-empty-message']")));
        return cardIsEmptyMessageLocator.getText();
    }

    public TommyHilfigerCardPage closeCoockiesPolitics()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@data-qa='section-header']")));
        closeCookiesPoliticsButtonLocator.click();
        return this;
    }

}

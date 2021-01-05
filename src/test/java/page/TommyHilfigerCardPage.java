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
    @FindBy(xpath = "//span[text()='Изменить']")
    private WebElement changeItemsCountButtonLocator;

    @FindBy(xpath = "//div[@id='dropdown-quantity']")
    private WebElement itemsCountDropdownLocator;

    @FindBy(xpath = "//li[@data-value='2']")
    private WebElement newItemsCountLocator;

    @FindBy(xpath = "//span[text()='Сохранить']")
    private WebElement saveChangesButtonLocator;

    @FindBy(xpath = "//div[@class='product-details__cta-wrap ']//span[text()='Удалить']")
    private WebElement removeItemButtonLocator;

    @FindBy(xpath = "//p[@class='ShoppingBagContainer__empty-cta--only-empty-message']")
    private WebElement cardIsEmptyMessageLocator;

    @FindBy(xpath = "//a[@class='product-details__description']")
    private WebElement itemInCardLocator;

    @FindBy(xpath = "//h1[@data-qa='section-header']")
    private WebElement cardIsNotEmptyLocator;

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

    public int getItemsInCardCount()
    {
        return driver.findElements(By.xpath("//div[@class='ProductItem product-details ']")).size();
    }

    public TommyHilfigerCardPage changeItemsCount()
    {
        changeItemsCountButtonLocator.click();
        return this;
    }

    public TommyHilfigerCardPage clickItemsCountDropdown()
    {
        itemsCountDropdownLocator.click();
        return this;
    }

    public TommyHilfigerCardPage selectNewItemsCount()
    {
        newItemsCountLocator.click();
        return this;
    }

    public TommyHilfigerCardPage saveChanges()
    {
        saveChangesButtonLocator.click();
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

    public String getMessageInfo()
    {
        return cardIsEmptyMessageLocator.getText();
    }

    public boolean checkCardIsNotEmpty()
    {
        return cardIsNotEmptyLocator.isDisplayed();
    }

    public TommyHilfigerCardPage waitForItem()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@data-qa='section-header']")));
        return this;
    }

    public TommyHilfigerCardPage closeCoockiesPolitics()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@data-qa='section-header']")));
        closeCookiesPoliticsButtonLocator.click();
        return this;
    }


    public String checkNameOfItem()
    {
        return itemInCardLocator.getText();
    }

}

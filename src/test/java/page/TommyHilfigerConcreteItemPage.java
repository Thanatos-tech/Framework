package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerConcreteItemPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='attribute-selector attribute-selector--button-selector']/div/button[4]")
    private WebElement sizeButtonLocator;

    @FindBy(xpath = "//button[@class='add-to-bag__add button']")
    private WebElement addToCardButtonLocator;

    @FindBy(xpath = "//button[@class='mini-basket__link']")
    private WebElement miniCardButtonLocator;

    @FindBy(xpath = "//button[@class='basket-panel__summary-action button--secondary button']")
    private WebElement cardButtonLocator;

    @FindBy(xpath = "//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")
    private WebElement closeCookiesPoliticsButtonLocator;

    @FindBy(xpath = "//span[@class='wishlist__toggle--button']")
    private WebElement addInFavoriteToggleLocator;

    @FindBy(xpath = "//button[@class='wishlist__button']")
    private WebElement favoriteButtonLocator;

    @FindBy(xpath = "//button[@class='basket-panel__summary-action button--secondary button']")
    private WebElement cardPageButtonLocator;

    @FindBy(xpath = "//button[@class='add-to-bag__checkout button--secondary button']")
    private WebElement orderButtonLocator;


    private final String PAGE_URL = "https://ru.tommy.com/%D0%B4%D0%B6%D0%B5%D0%BC%D0%BF%D0%B5%D1%80-%D1%81-%D0%B2%D0%BE%D1%80%D0%BE%D1%82%D0%BE%D0%BC-%D0%BD%D0%B0-%D0%BC%D0%BE%D0%BB%D0%BD%D0%B8%D0%B8-mw0mw12983bd2/";

    public TommyHilfigerConcreteItemPage(WebDriver driver) {
        super(driver);
    }

    public TommyHilfigerConcreteItemPage openPage() {
        driver.get(PAGE_URL);
        return this;
    }

    public TommyHilfigerConcreteItemPage addItemInFavorite()
    {
        addInFavoriteToggleLocator.click();
        return this;
    }

    public TommyHilfigerFavoritePage openFavoritePage()
    {
        favoriteButtonLocator.click();
        return new TommyHilfigerFavoritePage(driver);
    }

    public TommyHilfigerConcreteItemPage closeCoockiesPolitics()
    {
        closeCookiesPoliticsButtonLocator.click();
        return this;
    }

    public TommyHilfigerConcreteItemPage selectSize() {
        sizeButtonLocator.click();
        return this;
    }

    public TommyHilfigerConcreteItemPage addToCard()
    {
        addToCardButtonLocator.click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header__tabs--mini-basket']")));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='header__tabs--mini-basket']")));
        return this;
    }

    public TommyHilfigerConcreteItemPage openMiniCard()
    {
        miniCardButtonLocator.click();
        return this;
    }

    public TommyHilfigerCardPage openCardPage()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='basket-panel__summary-action button--secondary button']")));
        cardPageButtonLocator.click();
        return new TommyHilfigerCardPage(driver);
    }

    public String getItemsCount()
    {
        return miniCardButtonLocator.getText();
    }

    public TommyHilfigerChoiceOrderPage clickOrderButton()
    {
        orderButtonLocator.click();
        return new TommyHilfigerChoiceOrderPage(driver);
    }

}

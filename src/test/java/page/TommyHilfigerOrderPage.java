package page;

import model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerOrderPage extends AbstractPage {
    @FindBy(xpath = "//a[@id='productPromotionCode']")
    private WebElement promocodeLocator;

    @FindBy(xpath = "//input[@id='promotionCodeInput']")
    private WebElement promocodeLineLocator;

    @FindBy(xpath = "//button[@class='btn btnPrimary ']")
    private WebElement activatePromocodeButtonLocator;

    @FindBy(xpath = "//a[@id='promotionCodeRemove']")
    private WebElement removePromocodeButtonLocator;

    @FindBy(xpath = "//button[@id='continueToPayment']")
    private WebElement paymentButtonLocator;

    @FindBy(xpath = "//div[text()='Индекс обязателен.']")
    private WebElement errorMessageLocator;



    public TommyHilfigerOrderPage(WebDriver driver) {
        super(driver);
    }

    public TommyHilfigerOrderPage clickPromocodeButton()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='productPromotionCode']")));
        promocodeLocator.click();
        return this;
    }

    public TommyHilfigerOrderPage inputPromocode(UserData userData)
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='promotionCodeInput']")));
        promocodeLineLocator.click();
        promocodeLineLocator.sendKeys(userData.getPromocode());
        return this;
    }

    public TommyHilfigerOrderPage activatePromocode()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btnPrimary ']")));
        activatePromocodeButtonLocator.click();
        return this;
    }

    public boolean isRemovePromocodeButtonActive()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='promotionCodeRemove']")));
        return removePromocodeButtonLocator.isDisplayed();
    }

    public TommyHilfigerOrderPage goToPayment()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='continueToPayment']")));
        paymentButtonLocator.click();
        return this;
    }

    public boolean errorMessageDisplayed()
    {
        return errorMessageLocator.isDisplayed();
    }

}

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerChoiceOrderPage extends AbstractPage {
    @FindBy(xpath = "//button[@id='checkoutContinueGuestWebsphere']")
    private WebElement continueAsAGuestButtonLocator;

    public TommyHilfigerChoiceOrderPage(WebDriver driver) {
        super(driver);
    }

    public TommyHilfigerOrderPage continueAsAGuest()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkoutContinueGuestWebsphere']")));
        continueAsAGuestButtonLocator.click();
        return new TommyHilfigerOrderPage(driver);
    }
}

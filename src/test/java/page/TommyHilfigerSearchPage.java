package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TommyHilfigerSearchPage extends AbstractPage
{
    @FindBy(xpath = "//p[@class='catalog-search__message']/span")
    private WebElement noFoundResultLocator;

    public TommyHilfigerSearchPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean noCorrectRequestResult()
    {
        return noFoundResultLocator.isEnabled();
    }
}

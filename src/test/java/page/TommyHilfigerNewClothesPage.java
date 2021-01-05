package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TommyHilfigerNewClothesPage extends AbstractPage {
    @FindBy(xpath = "//span[text()='Сортировать по']")
    private WebElement sortElementsDropdownLocator;

    @FindBy(xpath = "//label[text()='Цена по убыванию']")
    private WebElement sortElementsByDescendingLocator;


    @FindBy(xpath = "//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")
    private WebElement closeCookiesPoliticsButtonLocator;

    public TommyHilfigerNewClothesPage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerNewClothesPage closeCoockiesPolitics()
    {
        closeCookiesPoliticsButtonLocator.click();
        return this;
    }

    public TommyHilfigerNewClothesPage sortElementsBy()
    {
        sortElementsDropdownLocator.click();
        return this;
    }

    public TommyHilfigerNewClothesPage openPage()
    {
        driver.get("https://ru.tommy.com/%D0%BD%D0%BE%D0%B2%D1%8B%D0%B5-%D0%BF%D0%BE%D1%81%D1%82%D1%83%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B4%D0%BB%D1%8F-%D0%BC%D1%83%D0%B6%D1%87%D0%B8%D0%BD#_sort_=ph");
        return this;
    }

    public TommyHilfigerNewClothesPage sortByPrice()
    {
        sortElementsDropdownLocator.click();
        return this;
    }

    public boolean elementsSorted()
    {
        return sortElementsDropdownLocator.isDisplayed();
    }
}

package page;

import model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerHomePage extends AbstractPage
{
    @FindBy(id = "headerSearchInput")
    private WebElement searchLineLocator;

    @FindBy(xpath = "//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")
    private WebElement closeCookiesPoliticsButtonLocator;

    @FindBy(xpath = "//button[text()='J’accepte']")
    private WebElement closeFrenchCoockiesPoliticsLocator;

    @FindBy(xpath = "//button[@class='header__link']")
    private WebElement logInButtonLocator;

    @FindBy(xpath = "//input[@name='logonId']")
    private WebElement emailInputLineLocator;

    @FindBy(xpath = "//input[@id='uid-27']")
    private WebElement passwordInputLineLocator;

    @FindBy(xpath = "//button[@class='login__submit button']")
    private WebElement authorizedButtonLocator;

    @FindBy(xpath = "//a[@class='header__action account-link']")
    private WebElement personalCabinetButtonLocator;

    @FindBy(xpath = "//div[@class='select THSelect ']/div[text()='Russia ( руб. )']")
    private WebElement selectLanguageDropdownLocator;

    @FindBy(xpath = "//div[text()='France ( € )']")
    private WebElement newRegionLocator;

    @FindBy(xpath = "//button[@class='cta-button button']")
    private WebElement changeRegionLocator;

    @FindBy(xpath = "//input[@id='uid-7']")
    private WebElement currentRegionLocator;

    private final String HOMEPAGE_URL = "https://ru.tommy.com/";

    public TommyHilfigerHomePage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerHomePage openPage()
    {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public TommyHilfigerHomePage clickLanguageDropdown()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select THSelect ']/div[text()='Russia ( руб. )']")));
        selectLanguageDropdownLocator.click();
        return this;
    }

    public TommyHilfigerHomePage selectNewRegion()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='France ( € )']")));
        newRegionLocator.click();
        return this;
    }

    public TommyHilfigerHomePage clickChangeRegion()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='cta-button button']")));
        changeRegionLocator.click();
        return this;
    }

    public String getCurrentRegion()
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='uid-7']")));
        return currentRegionLocator.getAttribute("value");
    }

    public TommyHilfigerHomePage closeCoockiesPolitics()
    {
        closeCookiesPoliticsButtonLocator.click();
        return this;
    }

    public TommyHilfigerHomePage closeFrenchCoockiesPolitics()
    {
        closeFrenchCoockiesPoliticsLocator.click();
        return this;
    }

    public TommyHilfigerHomePage clickLogInButton()
    {
        logInButtonLocator.click();
        return this;
    }

    public TommyHilfigerHomePage inputEmail(UserData userData)
    {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='logonId']")));
        emailInputLineLocator.click();
        emailInputLineLocator.sendKeys(userData.getEmail());
        return this;
    }

    public TommyHilfigerHomePage inputPassword(UserData userData)
    {
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='uid-27']")));
        passwordInputLineLocator.click();
        passwordInputLineLocator.sendKeys(userData.getPassword());
        return this;
    }

    public TommyHilfigerHomePage clickAuthorizedButton()
    {
        authorizedButtonLocator.click();
        return this;
    }

    public boolean isPersonalCabinetButtonEnable()
    {
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='header__action account-link']")));
        return personalCabinetButtonLocator.isDisplayed();
    }

    public TommyHilfigerSearchPage inputValueInSearchLine(UserData userData)
    {
        searchLineLocator.click();
        searchLineLocator.sendKeys(userData.getValueForSearchLine());
        searchLineLocator.sendKeys(Keys.ENTER);
        return new TommyHilfigerSearchPage(driver);
    }
}

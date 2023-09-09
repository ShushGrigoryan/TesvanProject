package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BaseClass.BaseClass;
import Selectors.HomePageSelectors;

public class HomePage extends BaseClass {

    public final BaseClass base;

    public HomePage(BaseClass base) {
        this.base = base;
    }

    public void homePage() {
        base.driver.get(base.baseURL);
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public boolean homePageOpens() {
        return base.driver.findElement(HomePageSelectors.tesvanLogo).isDisplayed();
    }

    public void closeButton() {
        WebElement closeButton = base.driver.findElement(HomePageSelectors.CloseButtonFromSendMessageModal);
        ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(false);", closeButton);
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        closeButton.click();

        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public boolean isModalClosed() {
        By modalSelector = HomePageSelectors.sendMessageModal;

        try {
            WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(modalSelector));

            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void selectLanguage(String selectedLanguage) {
        List<WebElement> listItems = base.driver.findElements(HomePageSelectors.languageDropdown);
        for (WebElement listItem : listItems) {
            String languageString = listItem.getText();
            System.out.println(languageString);
            if (languageString.equals(selectedLanguage)) {

                listItem.click();
                System.out.println(listItem);
                break;
            }
        }
    }

    public String urlContains(String expected_URL) {
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(expected_URL));
        return base.driver.getCurrentUrl();
    }

    public void navigateBack() {
        base.driver.navigate().back();
    }

}
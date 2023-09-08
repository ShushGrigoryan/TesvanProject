package PageObject;

import java.time.Duration;

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

    // public void closeButton() {

    //     WebElement closeButton = base.driver.findElement(HomePageSelectors.CloseButtonFromSendMessageModal); 
    //     ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", closeButton);

    //     WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
    //     wait.until(ExpectedConditions.elementToBeClickable(closeButton));

    //     closeButton.click();

    //     base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    // }

    // public boolean isModalClosed() {
    //     try {
    //         WebElement modalElement = base.driver.findElement(HomePageSelectors.sendMessageModal);
    //         return !modalElement.isDisplayed();
    //     } catch (NoSuchElementException e) {
    //         return true;
    //     }
    // }

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
        // Wait for the modal to disappear
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modalSelector));
        
        // Return true if the modal is closed
        return true;
    } catch (TimeoutException e) {
        // Return false if the modal is still visible or not found
        return false;
    }
}

}
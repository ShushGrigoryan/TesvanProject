package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;
import Selectors.MessageModalSelectors;
import PageObject.SendMessageModal;

public class SendMessageModal extends BaseClass {

    public final BaseClass base;

    public SendMessageModal(BaseClass base) {
        this.base = base;
    }

    public void fillField(String fieldName, String value) {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Elements element = Arrays.stream(Elements.values())
                .filter(e -> e.getName().equals(fieldName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown element: " +
                        fieldName));
        WebElement field = base.driver.findElement(element.getBy());
        ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView();", field);
        if (field.isEnabled()) {
            field.sendKeys(value);
        } else {
            System.out.println("The element is not editable.");
        }
    }

    public void checkboxFromModal() {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        base.driver.findElement(MessageModalSelectors.CheckBoxFromSendMessageModal).click();
    }

    public void clickOnElement(String elementName) {

        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        
            Elements element = Arrays.stream(Elements.values())
                    .filter(e -> e.getName().equals(elementName))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Unknown element: " + elementName));
            WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(element.getBy()));
            ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", elem);
            elem = wait.until(ExpectedConditions.elementToBeClickable(elem));
            elem.click();
        
     

    }

    public boolean Message(String successMessage) {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return base.driver
                .findElement(MessageModalSelectors.successMessage(successMessage)).isDisplayed();

    }

    public String inputError(String expectedErrorMessage) {
        WebElement errorElement = base.driver
                .findElement(MessageModalSelectors.getInputErrorSelector(expectedErrorMessage));
        return errorElement.getText();
    }

    public String textAreaError(String expectedErrorMessage) {
        WebElement errorElement = base.driver
                .findElement(MessageModalSelectors.getTextAreaErrorSelector(expectedErrorMessage));
        return errorElement.getText();
    }

    public String checkboxError(String expectedErrorMessage) {
        WebElement errorElement = base.driver
                .findElement(MessageModalSelectors.getCheckboxErrorSelector(expectedErrorMessage));
        return errorElement.getText();
    }

    public String verifyCurrentUrl() {
        ArrayList<String> tabs = new ArrayList<>(base.driver.getWindowHandles());
        base.driver.switchTo().window(tabs.get(1));
        base.driver.navigate().refresh();
        String currentUrl = base.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        return currentUrl;

    }

}

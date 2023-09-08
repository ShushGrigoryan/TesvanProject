package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;
import Selectors.MessageModalSelectors;

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

    // public void valueIsDisplayed(String value, String fieldName) {
    // Elements element = Arrays.stream(Elements.values())
    // .filter(e -> e.getName().equals(fieldName))
    // .findFirst()
    // .orElseThrow(() -> new IllegalArgumentException("Unknown element: " +
    // fieldName));
    // WebElement field = base.driver.findElement(element.getBy());
    // ((JavascriptExecutor)
    // base.driver).executeScript("arguments[0].scrollIntoView();", field);
    // field.getCssValue(value).equals(value);

    // }

    public void checkboxFromModal() {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        base.driver.findElement(MessageModalSelectors.CheckBoxFromSendMessageModal).click();
    }

    public void clickOnElement(String elementName) {
        // base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Elements element = Arrays.stream(Elements.values())
        // .filter(e -> e.getName().equals(elementName))
        // .findFirst()
        // .orElseThrow(() -> new IllegalArgumentException("Unknown element: " +
        // elementName));
        // WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        // // ((JavascriptExecutor)
        // base.driver).executeScript("arguments[0].scrollIntoView(true);", elem);

        // WebElement elem =
        // wait.until(ExpectedConditions.presenceOfElementLocated(element.getBy()));

        // base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // elem.click();
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));

        try {
            Elements element = Arrays.stream(Elements.values())
                    .filter(e -> e.getName().equals(elementName))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Unknown element: " + elementName));

            // Wait for the element's presence
            WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(element.getBy()));

            // Scroll the element into view
            ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", elem);

            // Wait for the element to be clickable
            elem = wait.until(ExpectedConditions.elementToBeClickable(elem));

            // Click the element
            elem.click();
        } catch (Exception e) {
            System.out.println("Error while interacting with the element: " + e.getMessage());
        } finally {
            // Reset the implicit wait back to the default value
            base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        }

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

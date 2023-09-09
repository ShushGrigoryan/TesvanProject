package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BaseClass.BaseClass;
import Selectors.ContactsSelectors;

public class Contacts extends BaseClass {
    public final String ResponseMessageFromContacts = null;
    public final BaseClass base;

    public Contacts(BaseClass base) {
        this.base = base;
    }

   
    public boolean ResponseMessageFromContacts(String responseSuccessMesage) {
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(20));
        By successMessageLocator = ContactsSelectors.successMesageFromContacts(responseSuccessMesage);
    
        System.out.println("Waiting for success message to be visible...");
        ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", base.driver.findElement(successMessageLocator));

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        System.out.println("Success message is now visible!");    
        return successMessage.isDisplayed();
    }

 public void checkboxFromContacts() {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        base.driver.findElement(ContactsSelectors.CheckBoxFromContacts).click();
    }


    public String emailInputError(String expectedErrorMessage) {
        WebElement errorElement = base.driver
                .findElement(ContactsSelectors.emailErrorMessage(expectedErrorMessage));
        return errorElement.getText();
    }


   
}

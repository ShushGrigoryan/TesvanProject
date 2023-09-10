package Selectors;

import org.openqa.selenium.By;

public class ContactsSelectors {

    public static By successMesageFromContacts(String responseSuccessMesage) {
        return By.xpath("//div[contains(@class,'Contact_container__KZnxh')]//p[contains(text(),'"
                + responseSuccessMesage + "')]");
    }

    public static By CheckBoxFromContacts = By
            .xpath("//div[contains(@class,'Contact_container__KZnxh')]//input[contains(@type,'checkbox')]");

    public static By emailErrorMessage(String expectedErrorMessage) {
        return By.xpath("//p[contains(@class, 'Input_error__')][contains(text(), '" + expectedErrorMessage + "')]");
    }

    public static By getTextAreaErrorSelector(String expectedErrorMessage) {
        return By.xpath("//p[contains(@class, 'Textarea_error__')][contains(text(), '" + expectedErrorMessage
                + "')]");
    }

    public static By getCheckboxErrorSelector(String expectedErrorMessage) {
        return By.xpath("//p[contains(@class, 'ContactForm_error')][contains(text(), '" + expectedErrorMessage
                + "')]");
    }
}
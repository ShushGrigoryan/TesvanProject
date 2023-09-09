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
        return By.xpath("//p[normalize-space()='" + expectedErrorMessage + "']");
    }
}
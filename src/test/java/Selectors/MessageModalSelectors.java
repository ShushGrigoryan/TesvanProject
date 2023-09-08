package Selectors;

import org.openqa.selenium.By;

public class MessageModalSelectors {

        public static By SendMessageButtonFromSendMessageModal = By
                        .xpath("//div[3]/form[1]/button[1]");

        public static By CheckBoxFromSendMessageModal = By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]/div[1]/input[1]");

        public static By successMessage(String successMessage) {
                return By.xpath("//div[contains(@class,'ResponseMessages_container__')]/div[contains(@class,'ResponseMessages_message__')]/p[1][contains(text(), '"
                                + successMessage + "')]");
        }

        public static By getInputErrorSelector(String expectedErrorMessage) {
                return By.xpath("//p[contains(@class, 'Input_error__')][contains(text(), '" + expectedErrorMessage
                                + "')]");
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

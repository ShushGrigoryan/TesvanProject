package Selectors;

import org.openqa.selenium.By;

public class MessageModalSelectors {

        public static By SendMessageButtonFromSendMessageModal = By
                        .xpath("//div[3]/form[1]/button[1]");

        public static By CheckBoxFromSendMessageModal = By.xpath("//body/div[@id='__next']/div[contains(@class,'')]/div[contains(@class,'')]/div[@class='ContactForm_container__7Fof9']/form[@class='ContactForm_form__TDamm']/div[@class='ContactForm_control__w9zQ_']/label[@class='ContactForm_acceptLabel__VylH6']/div[@class='Checkbox_checkbox__hWVxe ContactForm_checkbox__qhIHk']/input[1]");

        public static By successMessage(String successMessage) {
                return By.xpath("//body/div[@id='__next']/div[@class='ResponseMessages_container__wVOwE']/div[@class='ResponseMessages_message__gcPjy']/p[contains(text(), '"+ successMessage +"')]");
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

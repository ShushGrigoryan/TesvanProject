package PageObject;

import org.openqa.selenium.By;

public enum Elements {

        FULL_NAME_INPUT_FIELD("fullName", By.xpath("//div[3]/form[1]/div[1]/div[1]/label[1]/div/input")),
        EMAIL_INPUT_FIELD("email", By.xpath("//div[1]/div[3]/form[1]/div[1]/div[2]/label[1]/div[1]//input[1]")),
        PHONE_INPUT_FIELD("phone", By.xpath("//div[1]/div[3]/form[1]/div[2]/div[1]/label[1]/div[1]//input[1]")),
        COMPANY_INPUT_FIELD("company", By.xpath("//div[1]/div[3]/form[1]/div[2]/div[2]/label[1]/div[1]//input[1]")),
        DESCRIPTION_INPUT_FIELD("description", By.xpath("//div[3]/form[1]/div[3]/label[1]/div[1]/textarea[1]")),
        SEND_MESSAGE_BUTTON_FROM_MODAL("send_message", By.xpath("//div[3]/form[1]/button[1]")),
        UPWORK_SOCIAL_MEDIA_BUTTON("upwork",
                        By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]")),
        LINKEDIN_SOCIAL_MEDIA_BUTTON("linkedin",
                        By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[2]/div[1]")),
        FACEBOOK_SOCIAL_MEDIA_BUTTON("facebook",
                        By.xpath("/html/body/div[1]/div[1]/div/div[4]/div/a[3]/div")),
        SCROOL_DOWN_FROM_CONTACTS("Scrool_Down", By.xpath("//div/button[1]")),
        FULL_NAME_INPUT_FIELD_FROM_CONTACTS("Full_Name", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/input[1]")),
        EMAIL_INPUT_FIELD_FROM_CONTACTS("Email", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/input[1]")),
        PHONE_INPUT_FIELD_FROM_CONTACTS("Phone", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/div[1]/input[1]")),
        COMPANY_INPUT_FIELD_FROM_CONTACTS("Company", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/label[1]/div[1]/input[1]")),
        DESCRIPTION_INPUT_FIELD_FROM_CONTACTS("Description", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]/div[1]/textarea[1]")),
        SEND_MESSAGE_BUTTON_FROM_CONTACTS("Send_Message", By
                        .xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")),
        CHECKBOX_FROM_CONTACTS("Checkbox", By.xpath(
                        "/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]/div[1]/input[1]")),
        CONTACTS_FROM_MENU_BAR("Contacts",
                        By.xpath("//a[contains(@class,'MenuItems_other_eng__')][normalize-space()='CONTACTS']")),
        SCROOL_DOWN_CONTACTS("ScroolDown", By.xpath("/html[1]/body[1]/div[1]/div[6]/div[1]/div[1]/div[1]")),
        ENG_LANGUAGES_BUTTON("ENG", By.xpath("//html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]")),
        UPWORK_SOCIAL_MEDIA_BUTTON_FROM_CONTACTS("Upwork", By.xpath(
                        "/html/body/div[1]/div[8]/div/div/div/div/div[2]/div/a[1]/div")),
        LINKEDIN_SOCIAL_MEDIA_BUTTON_FROM_CONTACTS("Linkedin", By.xpath(
                        "/html/body/div[1]/div[8]/div/div/div/div/div[2]/div/a[2]/div")),
        FACEBOOK_SOCIAL_MEDIA_BUTTON_FROM_CONTACTS("Facebook", By
                        .xpath("/html/body/div[1]/div[8]/div/div/div/div/div[2]/div/a[3]/div")),
        CAREERS_BUTTON("Careers", By.xpath("//div[2]/nav[1]/div[1]/div[1]/div[1]/div[2]/a[1]")),
        SCROOL_DOWN_FROM_CAREERS("scroolDown", By.xpath("//button[@id='headerButton']")),
        MORE_DETAILS("More_Details",
                        By.cssSelector("div[class='Careers_row__PNLZ6'] button[type='button']")),
        SCROOL_DOWN_FROM_POSITION("scrool_down", By.xpath("//div[@class='HeaderContent_scrollIcon__FWW7K']")),
        FULL_NAME_FIELD_FROM_CAREERS("fullName_", By.xpath(
                        "//div[@class='CareerMainContent_container__30LDD']//div[1]//label[2]//div[1]//input[1]")),
        EMAIL_FIELD_FROM_CAREERS("email_", By.xpath(
                        "//div[@class='Form_formContainer__15aXe']//div[2]//label[2]//div[1]//input[1]")),
        PHONE_INPUT_FIELD_FROM_CAREERS("phone_", By.xpath(
                        "//div[3]//label[2]//div[1]//input[1]")),

        APPLY_BUTTON_FROM_CAREERS("Apply",
                        By.xpath("//button[normalize-space()='Apply']")),
        UPLOAD("upload", By.xpath("//span[@class='FileUploader_attach__zzM7j FileUploader_whiteAttach___KB8Z']"));

        public final String name;
        public final By by;

        Elements(String name, By by) {
                this.name = name;
                this.by = by;
        }

        public String getName() {
                return name;
        }

        public By getBy() {
                return by;
        }

}

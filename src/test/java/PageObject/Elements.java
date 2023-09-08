package PageObject;

import org.openqa.selenium.By;

public enum Elements  {

    

    FULL_NAME_INPUT_FIELD("fullName", By.xpath("//div[3]/form[1]/div[1]/div[1]/label[1]/div/input")),
    EMAIL_INPUT_FIELD("email", By.xpath("//div[1]/div[3]/form[1]/div[1]/div[2]/label[1]/div[1]//input[1]")),
    PHONE_INPUT_FIELD("phone", By.xpath("//div[1]/div[3]/form[1]/div[2]/div[1]/label[1]/div[1]//input[1]")),
    COMPANY_INPUT_FIELD("company", By.xpath("//div[1]/div[3]/form[1]/div[2]/div[2]/label[1]/div[1]//input[1]")),
    DESCRIPTION_INPUT_FIELD("description", By.xpath("//div[3]/form[1]/div[3]/label[1]/div[1]/textarea[1]")),
    SEND_MESSAGE_BUTTON_FROM_MODAL("send_message", By.xpath("//div[3]/form[1]/button[1]")),
    UPWORK_SOCIAL_MEDIA_BUTTON("upwork", By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]")),
    LINKEDIN_SOCIAL_MEDIA_BUTTON("linkedin", By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[2]")),
    FACEBOOK_SOCIAL_MEDIA_BUTTON("facebook", By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[3]")),
    FULL_NAME_INPUT_FIELD_FROM_CONTACTS("Full_Name", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/input[1]")),
    EMAIL_INPUT_FIELD_FROM_CONTACTS("Email", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/input[1]")),
    PHONE_INPUT_FIELD_FROM_CONTACTS("Phone", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/div[1]/input[1]")),
    COMPANY_INPUT_FIELD_FROM_CONTACTS("Company", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/label[1]/div[1]/input[1]")),
    DESCRIPTION_INPUT_FIELD_FROM_CONTACTS("Description", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]/div[1]/textarea[1]")),
    SEND_MESSAGE_BUTTON_FROM_CONTACTS("Send_Message", By.xpath("//div[contains(@class,'Contact_container__KZnxh')]//button[contains(@type,'submit')][normalize-space()='Send Message']")),
    CHECKBOX_FROM_CONTACTS("Checkbox", By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]/div[1]/input[1]")),
    CONTACTS_FROM_MENU_BAR("Contacts", By.xpath("//a[contains(@class,'MenuItems_other_eng__')][normalize-space()='CONTACTS']")),
    SCROOL_DOWN_FROM_MENU_BAR("ScroolDown", By.xpath("//html[1]/body[1]/div[1]/div[6]/div[1]/div[1]/button[1]"));
                                                             


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

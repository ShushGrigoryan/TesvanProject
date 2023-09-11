package Selectors;

import org.openqa.selenium.By;

public class CareersSelectors {

    public static By dropdownIcon = By.xpath("//*[@id=\"navMenu\"]/div[2]/nav/div[1]/p/span");
    public static By CompanyButton = By.xpath("//*[@id=\"navMenu\"]/div[2]/nav/div[1]/p");
    public static By CareersButton = By
            .xpath("//div[@class='MenuItemModals_modal__aKQAR']//div//a[normalize-space()='Careers']");
    public static By scroolDown = By.xpath("//button[@id='headerButton']");
    public static By Checkbox_from_careers = By
            .xpath("/html[1]/body[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]/input[1]");

    public static By success(String Success) {
        return By.xpath("//div[contains(@class, 'ResponseMessages_container__wVOwE')]//h1[contains(text(), '" + Success
                + "')]");
    }
}

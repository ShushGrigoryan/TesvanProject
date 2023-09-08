package Selectors;

import org.openqa.selenium.By;

public class HomePageSelectors {

    public static By tesvanLogo = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]");
    public static By CloseButtonFromSendMessageModal = By.xpath("//div[contains(@class, 'ContactModal_close__KCzRf')]");
    public static By sendMessageModal = By.xpath("//*[@id=\"__next\"]/div[1]/div");

}

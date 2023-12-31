package Selectors;

import org.openqa.selenium.By;

public class HomePageSelectors {
    public static By tesvanLogo = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/h1[1]/span[1]");
    public static By CloseButtonFromSendMessageModal = By.xpath("//div[contains(@class, 'ContactModal_close__KCzRf')]");
    public static By sendMessageModal = By.xpath("//*[@id=\"__next\"]/div[1]/div");
    public static By languageDropdown = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li");
}

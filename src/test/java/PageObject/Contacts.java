package PageObject;

import java.time.Duration;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseClass;
import Selectors.ContactsSelectors;
// import Selectors.MessageModalSelectors;

public class Contacts extends BaseClass {
    public final BaseClass base;

    public Contacts(BaseClass base) {
        this.base = base;
    }

   
public boolean ResponseMessageFromContacts(String responseSuccessMesage) {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        return base.driver
                .findElement(ContactsSelectors.successMesageFromContacts(responseSuccessMesage)).isDisplayed();

    }


}

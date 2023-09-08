package Selectors;

import org.openqa.selenium.By;


public class ContactsSelectors {




public static By successMesageFromContacts(String responseSuccessMesage) {
                return By.xpath("//div[8]/div/div/div/div/div[1]/div[3]/p[normalize-space()='" + responseSuccessMesage + "']");
        }
    
    
    
    }
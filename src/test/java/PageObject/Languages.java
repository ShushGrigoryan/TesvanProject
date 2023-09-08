package PageObject;

import BaseClass.BaseClass;

public class Languages extends BaseClass {
    public final BaseClass base;

    public Languages(BaseClass base) {
        this.base = base;
    }



    
    public void clickLanguageIcon() {
        // Implement clicking the language icon
    }

    public void selectLanguage(String language) {
        // Implement selecting the specified language from a dropdown or similar
    }

    public boolean isPageContentInSelectedLanguage() {
        // Implement logic to verify if page content is in the selected language
        return false;
    }

}

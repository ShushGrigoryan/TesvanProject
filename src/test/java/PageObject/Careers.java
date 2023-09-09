package PageObject;

import BaseClass.BaseClass;
import Selectors.CareersSelectors;

// import java.time.Duration;
// import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class Careers extends BaseClass {
    private final BaseClass base;

    public Careers(BaseClass base) {
        this.base = base;
    }

    public void hoverOver(String section) {

        WebElement companySection = base.driver.findElement(CareersSelectors.CompanyButton);
        Actions actions = new Actions(base.driver);
        actions.moveToElement(companySection).perform();
    }

  

    public void clickFromDropdown(String subsection) {
        WebElement dropdownElement = base.driver.findElement(CareersSelectors.CareersButton);
        dropdownElement.click();
       
    }

}

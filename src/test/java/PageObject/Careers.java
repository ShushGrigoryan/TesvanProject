package PageObject;

import BaseClass.BaseClass;
import Selectors.CareersSelectors;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

    public void ScroolDownPage(String elementName) {
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        Elements element = Arrays.stream(Elements.values())
                .filter(e -> e.getName().equals(elementName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown element: " + elementName));
        WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(element.getBy()));
        ((JavascriptExecutor) base.driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        Actions actions = new Actions(base.driver);
        actions.moveToElement(elem).click().perform();

    }

    public void attachFile() {
        try {
            Robot robot = new Robot();
            String filePath = "/home/david/Desktop/cv.pdf";

            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
                    null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_ALT);

        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println("break");
        }

    }

    public void checkboxFromCareers() {
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        WebElement checkbox = base.driver.findElement(CareersSelectors.Checkbox_from_careers);
        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        checkbox.click();
    }

    public boolean successMessage(String Success) {
        WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
        WebElement success_Message = wait
                .until(ExpectedConditions.visibilityOfElementLocated(CareersSelectors.success(Success)));
        return success_Message.isDisplayed();
    }

}

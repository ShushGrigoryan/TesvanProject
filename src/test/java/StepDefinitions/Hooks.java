package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.firefox.FirefoxOptions;
// import org.openqa.selenium.firefox.FirefoxProfile;

import BaseClass.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks extends BaseClass {

    private BaseClass base;

    public Hooks(BaseClass base) {
        this.base = base;
    }

    @Before
    public void initDriver() {

        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();

    }

    @After
    public void teardown() {
        System.out.println("Close browser");
        base.driver.quit();
    }
}

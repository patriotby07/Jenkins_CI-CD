package common.runners;

import com.codeborne.selenide.Selenide;
import common.config.SelenoidConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SelenoidRunner {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        SelenoidConfig selenoidConfig = new SelenoidConfig();
        selenoidConfig.createWebDriverInstance();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}

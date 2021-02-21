package common.runners;

import com.codeborne.selenide.Selenide;
import common.config.SelenoidConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SelenoidRunner {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        SelenoidConfig selenoidConfig = new SelenoidConfig();
        selenoidConfig.createWebDriverInstance();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}

package common.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Debug {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.timeout = 30000;
        Configuration.startMaximized = true;
    }

    @AfterMethod(alwaysRun = true)
    void tearDown() {
        Selenide.closeWebDriver();
    }

}

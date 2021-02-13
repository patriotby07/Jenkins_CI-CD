package steps;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ActionsWithOurMultipleWebElements {
    public void clickElement(String text, int index) {
        $(byXpath("(//a[text()='" + text + "'])[" + index + "]")).click();
    }
}

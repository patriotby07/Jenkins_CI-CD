package tests;

import org.testng.annotations.Test;
import pages.BasePage;

public class WikipediaClickableElements extends BasePage {

    @Test
    public void checkClickableElements() {
        mainPage.pressButtonWithLanguage("RU");
        actionsWithOurWebElements.clickElement("Заглавная страница");
        actionsWithOurWebElements.clickElement("Рубрикация");
        actionsWithOurWebElements.clickElement("Форум");
        actionsWithOurWebElements.clickElement("История");
        actionsWithOurMultipleWebElements.clickElement("Обсуждение", 2);
    }

}

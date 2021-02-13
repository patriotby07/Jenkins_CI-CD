package tests;

import common.test_data.Links;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;
import static common.steps.CommonSteps.checkUrl;

public class WikipediaExample extends BasePage {

    @DataProvider
    public Object[][] languageCodes() {
        return new Object[][]{
                {"EN"}, {"JA"}, {"RU"}, {"IT"}, {"PT"}, {"ES"}, {"DE"}, {"ZH"}, {"FR"}, {"PL"}
        };
    }

    @Test
    public void checkLanguageEnglish() {
        open(Links.WIKIPEDIA_MAIN_PAGE.getUrl());
        mainPage.pressButtonWithLanguageEnglish();
        checkUrl("/wiki/Main_Page", 5);
    }

    @Test(dataProvider = "languageCodes")
    public void checkLanguages(String languageCode) {
        open("https://www.wikipedia.org/");
        mainPage.pressButtonWithLanguage(languageCode);
        checkUrl("https://" + languageCode.toLowerCase() + ".wikipedia.org/wiki/", 5);
    }

    @Test
    public void clickElements() {
        open("https://www.wikipedia.org/");
        mainPage.pressButtonWithLanguage("RU");
        actionsWithOurWebElements.clickElement("Заглавная страница");
        actionsWithOurWebElements.clickElement("Рубрикация");
        actionsWithOurWebElements.clickElement("Форум");
        actionsWithOurWebElements.clickElement("История");
        actionsWithOurMultipleWebElements.clickElement("Обсуждение", 2);
    }

}

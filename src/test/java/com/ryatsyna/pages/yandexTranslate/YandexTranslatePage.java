package com.ryatsyna.pages.yandexTranslate;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DefaultUrl("https://translate.yandex.ru")
public class YandexTranslatePage extends PageObject {
    @FindBy(id = "translation")
    private WebElementFacade translationInput;

    @FindBy(id = "fakeArea")
    private WebElementFacade textInput;

    public void enterKeywords(String keyword) {
        textInput.type(keyword);
    }

    public void translationIsCorrect(String translation) {
        assertThat(translationInput.getText(), is(equalTo(translation)));
    }

    public void findTranslation(String query) {
        textInput.type(query);
    }
}

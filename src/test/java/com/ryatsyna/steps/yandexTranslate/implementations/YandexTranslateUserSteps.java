package com.ryatsyna.steps.yandexTranslate.implementations;

import com.ryatsyna.pages.yandexTranslate.YandexTranslatePage;
import net.thucydides.core.annotations.Step;

public class YandexTranslateUserSteps {
    YandexTranslatePage mainPage;

    @Step
    public void is_at_the_main_page() {
        mainPage.open();
    }

    @Step
    public void enters(String keyword) {
        mainPage.enterKeywords(keyword);
    }

    @Step
    public void looks_for_translation(String keyword) {
        enters(keyword);
    }

    @Step
    public void translation_is_correct(String translation) {
        mainPage.translationIsCorrect(translation);
    }
}

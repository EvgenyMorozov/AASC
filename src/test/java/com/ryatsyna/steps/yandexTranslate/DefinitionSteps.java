package com.ryatsyna.steps.yandexTranslate;

import com.ryatsyna.steps.yandexTranslate.implementations.YandexTranslateUserSteps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {
    @Steps
    YandexTranslateUserSteps user;

    @Пусть("^пользователь находится на главной странице Яндекс.Переводчика$")
    public void givenUserAtTheMainPage() {
        user.is_at_the_main_page();
    }

    @Когда("^пользователь ищет перевод слова: (.*)")
    public void whenUserSearchTranslation(String query) {
        user.looks_for_translation(query);
    }

    @Тогда("^пользователь получает перевод \"([^\"]*)\"")
    public void thenUserGetTranslation(String translation) {
        user.translation_is_correct(translation);
    }

    @Когда("^пользователь вводит английское слово: (.*)")
    public void whenUserInputEnglishWord(String query) {
        user.looks_for_translation(query);
    }

    @Тогда("^пользователь получает перевод на русский язык \"([^\"]*)\"")
    public void thenUserGetTranslationOnRussian(String translation) {
        user.translation_is_correct(translation);
    }

}

package com.ryatsyna.pages.wiki;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://wikipedia.org")
public class WikiMainPage extends PageObject {

    @FindBy(css = ".central-featured .central-featured-lang")
    private List<WebElementFacade> languages;

    @FindBy(id = "searchInput")
    private WebElementFacade searchInput;

    @FindBy(css = "fieldset .pure-button-primary-progressive")
    private WebElementFacade submit;


    public void enterKeywords(String keyword) {
        searchInput.type(keyword);
    }

    public void clickSearch() {
        submit.click();
    }
}

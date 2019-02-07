package com.menesates.serenitypratik.steps;

import com.menesates.serenitypratik.model.Category;
import com.menesates.serenitypratik.ui.CategoryNavitaionBar;
import com.menesates.serenitypratik.ui.CurrentPage;
import com.menesates.serenitypratik.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class NavigationUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavitaionBar categoryNavitaionBar;

    @Step
    public void isOnHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        MatcherAssert.assertThat(currentPage.getTitle(), Matchers.equalToIgnoringCase(expectedTitle));
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavitaionBar.selectCategory(category);
    }
}

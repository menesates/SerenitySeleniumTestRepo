package com.menesates.serenitypratik.features.navigation;

import com.menesates.serenitypratik.model.Category;
import com.menesates.serenitypratik.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigationUser mark;

    @Managed
    WebDriver browser = new FirefoxDriver();

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory(){
        // given
        mark.isOnHomePage();

        // when
        mark.navigatesToCategory(Category.Motors);

        // then
        mark.shouldSeePageTitleContaining("Parts and accessories | Motors | eBay");

    }

}

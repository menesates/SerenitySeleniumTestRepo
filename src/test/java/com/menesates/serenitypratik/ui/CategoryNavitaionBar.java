package com.menesates.serenitypratik.ui;

import com.menesates.serenitypratik.model.Category;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CategoryNavitaionBar extends PageObject {
    public void selectCategory(Category category) {
        $("*[class=hl-cat-nav] *[class=hl-cat-nav__container]").find(By.linkText(category.name())).click();
    }
}


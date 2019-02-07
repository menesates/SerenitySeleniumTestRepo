package com.menesates.serenitypratik.ui;

import com.menesates.serenitypratik.model.Category;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CategoryNavitaionBar extends PageObject {
    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
}

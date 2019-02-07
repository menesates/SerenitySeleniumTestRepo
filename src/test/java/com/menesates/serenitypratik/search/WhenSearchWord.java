package com.menesates.serenitypratik.search;

import com.menesates.serenitypratik.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@Narrative(text = "{Arama islemi}")
public class WhenSearchWord {

    @Steps
    GoogleSteps googleSteps;

    @Test
    @Pending
    public void searchingWord(){
        // given
        googleSteps.openMozillaAndGoogle();

        // when
        googleSteps.searchGoogle("serenity");


        // then
        googleSteps.checkTitle();
    }

    @Test
    public void searchingWord2(){
        // given
        googleSteps.openMozillaAndGoogle();

        // when
        googleSteps.searchGoogle("serenity");


        // then
        googleSteps.checkTitle();
    }
}

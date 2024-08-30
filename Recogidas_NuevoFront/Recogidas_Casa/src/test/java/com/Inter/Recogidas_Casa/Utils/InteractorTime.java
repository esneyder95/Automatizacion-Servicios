package com.Inter.Recogidas_Casa.Utils;

import net.serenitybdd.core.pages.PageObject;

public class InteractorTime extends PageObject {

    public void esperaMilis(Integer milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package org.fasttrrack.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends PageObject {


        public int getIntFromPrice(String priceNonFormatted) {
            return Integer.parseInt(priceNonFormatted
                    .replace(",", "")
                    .replace(" RON", "")
                    .replace(".", "")
                    .replace("lei",""));
        }
    }


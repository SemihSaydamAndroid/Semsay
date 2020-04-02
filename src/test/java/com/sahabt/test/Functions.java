package com.sahabt.test;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.Driver.webDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setMaxElementsForPrinting;

public class Functions {

    @Step("HepsiBurada sitesine gidilir.")
    public void gotoWebSite() {
        webDriver.get("https://www.hepsiburada.com/");
        assertThat(webDriver.getTitle()).contains("Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");
    }

    @Step("Arama kısmına <key> yazılır. ")
    public void searchArea(String key) throws InterruptedException {
        webDriver.findElement(By.id("productSearch")).sendKeys(key);
    }

    @Step("Ara butonuna tıklanır")
    public void clickButton() throws InterruptedException {
        webDriver.findElement(By.id("buttonProductSearch")).click();
    }

}

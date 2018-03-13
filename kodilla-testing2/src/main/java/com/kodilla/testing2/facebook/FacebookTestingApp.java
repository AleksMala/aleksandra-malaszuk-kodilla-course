package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[@name= \"birthday_day\"]/option[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[@id = \"month\"]/option[1]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[@id = \"year\"]/option[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(2);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(3);
    }
}

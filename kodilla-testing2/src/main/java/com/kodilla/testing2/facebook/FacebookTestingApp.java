package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_WAIT_FOR1 = "//select[@id=\"day\"]/option[1]";
    public static final String XPATH_WAIT_FOR2 = "//select[2]";
    public static final String XPATH_WAIT_FOR3 = "//select[3]";
    public static final String XPATH_SELECT_DAY = "//div[@id=\"u_0_10\"]/div/span/span/select[@id=\"day\"]/option[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_58mq_5dbb\"]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_58mq_5dbb\"]/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR1)).isDisplayed()) ;

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.getFirstSelectedOption();

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR2)).isDisplayed()) ;

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(2);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR3)).isDisplayed()) ;

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(3);
    }
}

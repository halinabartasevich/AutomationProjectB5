package io.loop.test.day6.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 https://the-internet.herokuapp.com/forgot_password

 */
public class T1_css_isDisplayed {
    public static void main(String[] args) {

        // setup driver and navigate
        WebDriver driver = new WebDriverUtil().getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(GeneralConstants.HEROKUAPP);

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div.example >h2")); // div[class='example']

        System.out.println("forgotPasswordHeading = " + forgotPasswordHeading.getText());

        // isDisplayed() boolean - will returns true or false depending the element is displayed at html
        System.out.println(forgotPasswordHeading.isDisplayed());

        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("TEST PASS => " + forgotPasswordHeading.getText() + " is displayed");
        } else {
            System.out.println("TEST FAIL");
        }



    }

}
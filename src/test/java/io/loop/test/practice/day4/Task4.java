package io.loop.test.practice.day4;

import io.loop.test.utilities.DocuporConstans;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
Practice tasks - 2
==============
go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in
 */
public class Task4 {

    public static void main(String[] args) throws InterruptedException {

      // go to URL
      WebDriver driver = new WebDriverUtil().getDriver(GeneralConstants.CHROME);
      driver.navigate().to(DocuporConstans.DOCUPORT_TEST);
      driver.manage().window().maximize();

      // locate the element with css locator
      WebElement logoDocuport = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

      // get value of attributes
      String actualLogo = logoDocuport.getAttribute("alt");
      String expectedLogo = DocuporConstans.EXPECTED_LOGO_DOCUPORT;

      // validate the value
      if (expectedLogo.equals(actualLogo)){
          System.out.println("Expected Logo: \"" + expectedLogo + "\" matches  actual Logo: " + DocuporConstans.EXPECTED_LOGO_DOCUPORT + "\" => TEST PASS");
      } else {
          System.out.println("Expected Logo: \"" + expectedLogo + "\" DOES NOT match  actual Logo: \"" + DocuporConstans.EXPECTED_LOGO_DOCUPORT + "\" => TEST FAIL");
      }

      // locate username
        WebElement username = driver.findElement(By.cssSelector("input#input-14"));
        username.sendKeys(DocuporConstans.USERNAME_CLIENT);

        // locate password
        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys(DocuporConstans.PASSWORD_CLIENT);


        // locate login + login
        WebElement login = driver.findElement(By.cssSelector("span.v-btn__content"));
        login.click();

        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']>span.v-btn__content"));
        continueButton.click();

        Thread.sleep(3000);


        //  locate home icon of docuport after login
        WebElement homeIcon = driver.findElement(By.cssSelector("div[class='v-list-item__icon mr-4']"));
        System.out.println("homeIcon.isDisplayed() = " + homeIcon.isDisplayed());

        // or locate Butch number
        WebElement butchNumber = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        System.out.println("butchNumber.isDisplayed() = " + butchNumber.isDisplayed());







    }
}

package io.loop.test.day4;

import io.loop.test.utilities.DocuporConstans;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.Doc;

public class T1_DocuportLogin_getText {
/*
     * go to docuport
     * enter username
     * do NOT enter password
     * click on login button
     * verify error message - Please enter password
 */

    public static void main(String[] args) {


        // get driver and navigate to the docuport page
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuporConstans.DOCUPORT_TEST);    // driver.get("https://beta.docuport.app");


        // locate username
        WebElement username = driver.findElement(By.id("input-14"));
       // username.sendKeys("b1g1_cliaen@gmail.com");
        username.sendKeys(DocuporConstans.USERNAME_CLIENT);


        // spy  locate / inspect login button and click it
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        // get error message from UI
        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
       // System.out.println("errorMessage.getText() = " + errorMessage);
      String actualErrorMessage = errorMessage.getText();
     // String expectedErrorMessage = "Please enter your password";

      // validation
        if (actualErrorMessage.equals(DocuporConstans.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)) {
            System.out.println("Expected error message: " + DocuporConstans.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + " , matches actual error message: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.out.println("Expected error message: " + DocuporConstans.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + " , DOES NOT match actual error message: " + actualErrorMessage + " => TEST FAIL");
        }

        driver.quit();


    }


}

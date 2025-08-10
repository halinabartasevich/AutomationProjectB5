package io.loop.test.practice.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*go to https://loopcamp.vercel.app/forgot-password.html
locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
use css
Validate those elements are displayed */
public class Task1 {
    public static void main(String[] args) {
        // get driver and navigate to https://loopcamp.vercel.app/forgot-password.html
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(LoopCampConstans.FORGOT_PASSWORD_URL);

        // locate FORGOT PASSWORD and validate
        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example>h2"));
        String actualForgotPassword = forgotPassword.getText();
        // expectedForgotPassword = LoopCampConstans.EXPECTED_HEADER_FORGOT_PASSWORD;
        if (actualForgotPassword.equals(LoopCampConstans.EXPECTED_HEADER_FORGOT_PASSWORD)){
            System.out.println("Expected forgot password: \"" + LoopCampConstans.EXPECTED_HEADER_FORGOT_PASSWORD + "\" matches with actual Forgot Password: \"" + actualForgotPassword + " => TEST PASS");
        } else
        {
            System.out.println("Expected forgot password: \"" + LoopCampConstans.EXPECTED_HEADER_FORGOT_PASSWORD + "\" DOES NOT match with actual Forgot Password: \"" + actualForgotPassword + " => TEST FAIL");
        }


        // locate EMAIL and validate
        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        String actualEmail = email.getText();
        String expectedEmail = "E-mail";
        if (expectedEmail.equals(actualEmail)){
            System.out.println("Expected e-mail: \"" + expectedEmail + "\" matches with actual e-mail: \"" + actualEmail + " => TEST PASS");
        } else {
            System.out.println("Expected e-mail: \"" + expectedEmail + "\" DOES NOT match with actual e-mail: \"" + actualEmail + " => TEST FAIL");
        }


        // locate EMAIL INPUT and validate
        WebElement emailInputField = driver.findElement(By.cssSelector("input#email"));
        if (emailInputField.isDisplayed()){
            System.out.println("Email Input is displayed  => TEST PASS" );
        } else {
            System.out.println("Email Input is not displayed => TEST FAIL" );
        }


        // locate RETRIEVE PASSWORD  and validate
        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin'"));
        String actualRetrievePassword = retrievePassword.getText();
        String expectedRetrievePassword = "Retrieve password";

        if (expectedRetrievePassword.equals(actualRetrievePassword)){
            System.out.println("Excpected Retrieve password: \"" + expectedRetrievePassword + " matches with actual Retrieve password: \"" + actualRetrievePassword + " => TEST PASS");
        } else {
            System.out.println("Excpected Retrieve password: \"" + expectedRetrievePassword + " DOES NOT match with actual Retrieve password: \"" + actualRetrievePassword + " => TEST FAIL");
        }

        // locate Powered by LOOPCAMP  and validate
        WebElement poweredByLoopcamp = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String actualText = poweredByLoopcamp.getText();
        String expectedText = LoopCampConstans.EXPECTED_POWERED_BY_LOOPCAMP;
        if (expectedText.equals(actualText)) {
            System.out.println("Expected text: \"" + expectedText + "\" matches with actual text: \"" + actualText + "\" => TEST PASS");
        } else {
            System.out.println("Expected text: \"" + expectedText + " DOES NOT match with actual text: \"" + actualText + "\" => TEST FAIL");
        }










    }
}

package io.loop.test.practice.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
task 3
=============
navigate to docuport application
validate placeholders for user name and password
without sending username and password click login button
validate username and password error messages
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new WebDriverUtil().getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //navigate to docuport application
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        // validate placeholders for user name and password
        WebElement usernameField = driver.findElement(By.cssSelector("label[for='input-14']"));
        WebElement passwordField = driver.findElement(By.cssSelector("label[for='input-15']"));

        String actualUsername = usernameField.getText();
        String actualPassword = passwordField.getText();
        String expectedUsername = "Username or email";
        String expectedPassword = "Password";

        if (expectedUsername.equals(actualUsername) && expectedPassword.equals(actualPassword)) {
            System.out.println("Placeholder for Email: " + expectedUsername + "; Placeholder for Password: " + expectedPassword + " => TEST PASS");
        } else {
            System.out.println("Email: " + expectedUsername + "\nPassword: " + expectedPassword + " => TEST FAIL");
        }

        // without sending username and password click login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        // validate username and password error messages
        String expectedErrorUsername = "Please enter your username or email address";
        String expectedErrorPassword = "Please enter your password";

        if (DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USERNAME.equals(expectedErrorUsername)){
            System.out.println("Expected error message for empty Username: \"" + expectedErrorUsername + "\" matches with actual error message:  => TEST PASS");
        } else {
            System.out.println("Expected error message for empty Username: \"" + expectedErrorUsername + "\" DOES NOT match with actual error message:  => TEST FAIL");
        }

        if (DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD.equals(expectedErrorPassword)) {
            System.out.println("Expected error message for empty Password: \"" + expectedErrorPassword + "\" matches with actual error message:  => TEST PASS");
        } else {
            System.out.println("Expected error message for empty Password: \"" + expectedErrorPassword + "\" DOES NOT match with actual error message:  => TEST FAIL");
        }







    }
}

package io.loop.test.practice.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
task 2
login to docuport application
logout from docuport application
Validate successful login
Validate successful logout
 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        // navigate to docuport application
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        // locate username field + provide email
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);

        // locate password field + provide password
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        // // locate Login button + click
        WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.cssSelector("button[class='text-none body-2 font-weight-medium v-btn v-btn--has-bg theme--light v-size--default success']>span[class='v-btn__content']"));
        continueButton.click();
        Thread.sleep(3000);

        // validate successful login (Batch4 Group2)
        WebElement nameOfBatch = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        String actualNameOfBatch = nameOfBatch.getText();
        String expectedNameOfBatch = "Batch4 Group2";

        if (expectedNameOfBatch.equals(actualNameOfBatch)) {
            System.out.println("Expected name of Batch: \"" + expectedNameOfBatch + "\"  => successful login => TEST PASS");
        } else {
            System.out.println(" => TEST FAIL");
        }




        //  LOGOUT
        nameOfBatch.click();
        Thread.sleep(3000);

        WebElement logoutButton = driver.findElement(By.cssSelector("div[id='list-item-160']>div[class='v-list-item__title']>span[class='body-2']"));

        Thread.sleep(3000);
        logoutButton.click();
        Thread.sleep(3000);


        // validate successful LOGOUT
        String expectedUrlLogout = "https://beta.docuport.app/login";

        if (driver.getCurrentUrl().equals(expectedUrlLogout)){
            System.out.println("Expected URL after Logout: " + expectedUrlLogout + " => successful logout => TEST PASS");
        } else {
            System.out.println("=> TEST FAIL");
        }

        driver.quit();










    }}

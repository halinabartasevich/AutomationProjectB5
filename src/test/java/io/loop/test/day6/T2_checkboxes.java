package io.loop.test.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_checkboxes {
    public static void main(String[] args) {
/*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.
         */



        WebDriver drive = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        // Navigate to the page
        drive.get("http://the-internet.herokuapp.com/checkboxes");
        drive.manage().window().maximize();

        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // create webElement checkbox1

        // WebElement checkbox1 = drive.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]"));
        //input[@type='checkbox' and normalize-space(following-sibling::text())='checkbox 1']

        WebElement checkbox1 = drive.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]/preceding-sibling::input"));


        //checkbox1 is not selected
        if (!checkbox1.isSelected()){
            System.out.println("Checkbox is not selected");
        }else {
            System.out.println("Check is selected");
        }

        // checkbox1 is selected
        checkbox1.click();

        if (!checkbox1.isSelected()){
            System.out.println("Checkbox is not selected");
        }else {
            System.out.println("Check is selected");
        }

        //Click checkbox #2 to deselect it.

//        WebElement checkbox2 = drive.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 2')]/preceding-sibling::input"));













    }


}
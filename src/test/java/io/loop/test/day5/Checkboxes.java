package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.


 */
public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new WebDriverUtil().getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //  1. Go to http://the-internet.herokuapp.com/checkboxes
        driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  2. Locate/create WebElement checkbox #1
        WebElement checkboxOne = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,' checkbox 1')]"));
      //  WebElement checkboxTwo = driver.findElement(By.xpath("//input[@type='checkbox' and following-sibling::text()[contains(.,'checkbox 1')]]"));

      WebElement checkboxTwo = driver.findElement(By.xpath("//input[@type='checkbox' and normalize-space(following-sibling::text())='checkbox 2']"));

        if(!checkboxOne.isSelected()) {
            System.out.println("checkboxOne is NOT SELECTED") ;
        } else {
            System.out.println("checkboxOne is selected" );
        }

        checkboxOne.click();

        if(!checkboxOne.isSelected()) {
            System.out.println("checkboxOne is NOT SELECTED") ;
        } else {
            System.out.println("checkboxOne is selected" );
        }






    }
}

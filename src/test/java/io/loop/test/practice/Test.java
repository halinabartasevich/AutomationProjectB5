package io.loop.test.practice;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
Steps: open https://www.amazon.com/.
•    Validate: logo visible, search box visible, search button enabled
Steps: search headphones; click Brand → choose Sony.
Validate: filter pill shows Sony; every visible result title contains “Sony” (or brand attribute matches).
 */
public class Test {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement logo = driver.findElement(By.cssSelector("i[class='a-icon a-logo']"));
        String actualLogo = logo.getDomAttribute("alt");
        String expectedLogo = "Amazon logo";

        if (actualLogo.equals(expectedLogo)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

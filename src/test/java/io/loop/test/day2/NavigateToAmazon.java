package io.loop.test.day2;

 /*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com"); //  navigate to amazon

        driver.manage().window().maximize();           // maximize

        driver.navigate().back();                     // navigate back

        driver.navigate().forward();                    // navigate forward

        driver.navigate().refresh();                    // refresh

    }

}

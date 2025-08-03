package io.loop.test.practice;
/*

Open Chrome browser
Go to https://www.target.com/
Search for “wooden spoon”
Validate title:
Expected: “Target”
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement searchBoxWithId = driver.findElement(By.id("twotabsearchtextbox"));

        searchBoxWithId.click();

        String str = "wooden spoon";


        searchBoxWithId.sendKeys(str + Keys.TAB + Keys.ENTER);





    }
}

package io.loop.test.practice.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Open Chrome browser
Go to https://www.target.com/
Search for “wooden spoon”
Validate title:
Expected: “Target”
 */
public class Target {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.target.com");

        WebElement searchBoxWithId = driver.findElement(By.name("searchTerm"));
        Thread.sleep(3000);
        searchBoxWithId.click();

        String textSearch = "wooden spoon";
        searchBoxWithId.sendKeys(textSearch + Keys.ENTER);

        String expectedTitle = "Target";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title = " + expectedTitle  + " => TEST PASS");
        }
        else {
            System.out.println("Actual title does not match with expected title  => TEST FAIL");
        }












    }

}

package io.loop.test.day4;
/*
Open Chrome browser
Go to https://www.etsy.com/
Search for “wooden spoon”
Validate title:
Expected: “Wooden spoon - Etsy”

 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Temu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

     WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));

     String searchText = "wooden spoon";

     searchBox.sendKeys(searchText + Keys.ENTER);

     String expectedTitle = "Wooden spoon - Etsy";
     String actualTitle = driver.getTitle();

        if(actualTitle.contains((expectedTitle))) {
            System.out.println("Actual title "  + actualTitle + " matches expected title: "  + expectedTitle + ". => TEST PASS");
        } else{
            System.err.println("Actual title "  + actualTitle + " DOES NOT match expected title: "  + expectedTitle + ". => TEST FAIL");
        }






    }



}

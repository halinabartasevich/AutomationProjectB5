package io.loop.test.practice.day3;
/*
1- Open a chrome browser
2- Go to: https://google.com/
3- Click to Gmail from top right.
4- Validate title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Validate title equals:
Expected: Google
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        WebElement clickGmail = driver.findElement(By.className("gb_X"));
        clickGmail.click();

        Thread.sleep(3000);
       String expectedTitle = "Gmail";
       String actualTitle = driver.getTitle();

       if (actualTitle.contains(expectedTitle)) {
           System.out.println("Actual title is " + expectedTitle + " => test PASS" );
       } else {
           System.err.println(" => test FAIL");
       }

       driver.navigate().back();
        Thread.sleep(3000);

        String titleExp = "Google";
        String titleAct = driver.getTitle();

        if (titleAct.contains(titleExp)) {
            System.out.println("Actual title is " + titleExp + " => test PASS"  );
        }
        else {
            System.err.println(" => test FAIL");
        }
        driver.quit();
    }}
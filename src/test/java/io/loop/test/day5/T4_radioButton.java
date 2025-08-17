package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
       https://loopcamp.vercel.app/radio-buttons.html
       wait implicitly 10 seconds
       is selected
       is enabled
        */
public class T4_radioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new WebDriverUtil().getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.navigate().to(LoopCampConstans.RADIOBUTTON_URL);
       // Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}

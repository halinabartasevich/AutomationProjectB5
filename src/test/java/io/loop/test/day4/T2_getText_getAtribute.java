package io.loop.test.day4;

import com.sun.security.jgss.GSSUtil;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAtribute {
    public static void main(String[] args) {
        /*

    go to url: https://loopcamp.vercel.app/registration_form.html
    validate header text expected:  Registration form
    validate placeholder attribute value for first name expected - first name
     */

        //go to the URL
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(LoopCampConstans.REGISTRATION_FORM_URL);

        // spy / locate the element - header
        WebElement header = driver.findElement(By.tagName("h2"));

        // use getText() method
        String actualHeaderForForm = header.getText();

        // validation
        if (actualHeaderForForm.equals(LoopCampConstans.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("expected header for form: \"" + LoopCampConstans.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" + actualHeaderForForm + "\" => TEST PASS");
        } else {
            System.out.println("expected header for form: \"" + LoopCampConstans.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header: \"" + actualHeaderForForm + "\" => TEST FAIL");
        }


        // use get attribute method with will return the value of the attribute, not the text
        WebElement firstNamePlaceholder = driver.findElement(By.name("firstname"));
       String actualPlaceholderForFirstName = firstNamePlaceholder.getAttribute("placeholder");

       //validation
       if (actualPlaceholderForFirstName.equals(LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME) )
       {
           System.out.println("expected placeholder for form: \"" + LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\", matches actual placeholder: \"" + actualPlaceholderForFirstName + "\" => TEST PASS");
       } else {
           System.out.println("expected placeholder for form: \"" + LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\", matches actual placeholder: \"" + actualPlaceholderForFirstName + "\" => TEST FAIL");
       }

    }
}
